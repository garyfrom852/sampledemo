package com.example.demo.services;

import com.example.demo.dao.Sample;
import com.example.demo.dao.SampleInfo;
import com.example.demo.dao.SubSampleInfo;
import com.example.demo.response.SamplesResopnse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class SampleService {

    private static final Logger logger = LoggerFactory.getLogger(SampleService.class);

    @Value( "${sample.url}" )
    private String url;

    @Value( "${sample.apiKey}" )
    private String apiKey;

    public SamplesResopnse getForSamples(Integer pageSize) {

        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl
                = "/samples?pageSize="+pageSize;

        HttpHeaders headers = new HttpHeaders();
        headers.set("accept","application/json");
        headers.set("apiKey",apiKey);

        HttpEntity<String> requestEntity = new HttpEntity<>("body",headers);

        ResponseEntity<SamplesResopnse> response
                = restTemplate.exchange(url+ resourceUrl, HttpMethod.GET , requestEntity , SamplesResopnse.class);

        if(response.getStatusCode() != HttpStatus.OK){
            if(logger.isDebugEnabled())
                throw new ResponseStatusException(response.getStatusCode()," with GET request to "+ resourceUrl +" | Response: "+response.toString());
            else throw new ResponseStatusException(response.getStatusCode()," with GET request to "+ resourceUrl);

        }

        for(SampleInfo sampleInfo : response.getBody().getSamples()){
            if(sampleInfo.getDescription() != null) sampleInfo.removeTagOnDescription();
            checkDateForWarn(sampleInfo);
        }

        return response.getBody();

    }

    public Sample getForSample(Integer id) {

        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl
                = "/samples/"+id;

        HttpHeaders headers = new HttpHeaders();
        headers.set("accept","application/json");
        headers.set("apiKey",apiKey);

        HttpEntity<String> requestEntity = new HttpEntity<>("body",headers);

        ResponseEntity<Sample> response
                = restTemplate.exchange(url+ resourceUrl, HttpMethod.GET , requestEntity , Sample.class);

        if(response.getStatusCode() != HttpStatus.OK){
            if(logger.isDebugEnabled())
                throw new ResponseStatusException(response.getStatusCode()," with GET request to "+ resourceUrl +" | Response: "+response.toString());
            else throw new ResponseStatusException(response.getStatusCode()," with GET request to "+ resourceUrl);

        }

        if(response.getBody().getDescription() != null) {
            response.getBody().removeTagOnDescription();
        }
        if(response.getBody().getSubSamples() != null){
            for(SubSampleInfo subSampleInfo:response.getBody().getSubSamples()){
                subSampleInfo.gatherContainersName();
            }
        }
        checkDateForWarn(response.getBody());

        return response.getBody();

    }

    public void checkDateForWarn(SampleInfo sampleInfo){

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE,7);
        if(sampleInfo.getExpiryDate().compareTo(cal.getTime()) < 0) sampleInfo.setCssClass("warn");

    }

}

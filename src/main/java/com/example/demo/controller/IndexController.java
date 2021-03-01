package com.example.demo.controller;

import com.example.demo.dao.Sample;
import com.example.demo.dao.SampleInfo;
import com.example.demo.services.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(SampleService.class);

    @Autowired
    SampleService sampleService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model) {
        //try {
        String name = "My name";
        Integer pageSize = 10;
        List<SampleInfo> samples = sampleService.getForSamples(pageSize).getSamples();
        logger.info("samples size : "+samples.size());
        model.addAttribute("name", name);
        model.addAttribute("max", pageSize);
        model.addAttribute("samples", samples);

        //sampleService.getForSample();

        //sampleService.postForSample();

        return "index";

        //}

    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String indexWithMax(@ModelAttribute("max")Integer max ,Model model) {
        //try {
        String name = "My name";
        max = max == null || max < 1 ? 10:max;
        List<SampleInfo> samples = sampleService.getForSamples(max).getSamples();
        logger.info("max size : "+max);
        model.addAttribute("name", name);
        model.addAttribute("max", max);
        model.addAttribute("samples", samples);

        //sampleService.getForSample();

        //sampleService.postForSample();

        return "index";

        //}

    }

    @RequestMapping("/sampleinfo")
    public String sampleInfo(@ModelAttribute("sampleId")Integer sampleId , Model model) {
        //try {

        logger.info("sample id is : "+sampleId);
        String name = "My name";

        Sample sample = sampleService.getForSample(sampleId);

        model.addAttribute("name", name);
        model.addAttribute("sample", sample);

        //sampleService.getForSample();

        //sampleService.postForSample();

        return "sampleinfo";

        //}

    }

}

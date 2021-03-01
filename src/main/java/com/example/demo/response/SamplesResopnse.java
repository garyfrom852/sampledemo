package com.example.demo.response;

import com.example.demo.dao.LinkItem;
import com.example.demo.dao.SampleInfo;

import java.util.List;

public class SamplesResopnse {

     private Integer totalHits;
     private Integer pageNumber;
     private List<SampleInfo> samples;
     private List<LinkItem> _links;

    public Integer getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public List<SampleInfo> getSamples() {
        return samples;
    }

    public void setSamples(List<SampleInfo> samples) {
        this.samples = samples;
    }

    public List<LinkItem> get_links() {
        return _links;
    }

    public void set_links(List<LinkItem> _links) {
        this._links = _links;
    }
}

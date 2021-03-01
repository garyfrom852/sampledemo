package com.example.demo.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sample extends SampleInfo{

    private List<SampleField> fields;
    private List<ExtraField> extraFields;
    private List<SubSampleInfo> subSamples;

    public List<SampleField> getFields() {
        return fields;
    }

    public void setFields(List<SampleField> fields) {
        this.fields = fields;
    }

    public List<ExtraField> getExtraFields() {
        return extraFields;
    }

    public void setExtraFields(List<ExtraField> extraFields) {
        this.extraFields = extraFields;
    }

    public List<SubSampleInfo> getSubSamples() {
        return subSamples;
    }

    public void setSubSamples(List<SubSampleInfo> subSamples) {
        this.subSamples = subSamples;
    }

}

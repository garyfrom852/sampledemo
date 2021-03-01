package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleInfo extends InventoryRecordInfo{

    private Number templateId;
    //user owner
    private User owner;
    private String subSampleAlias;
    //storageTempMin quantity
    private Quantity storageTempMin;
    //storageTempMax quantity
    private Quantity storageTempMax;
    private String sampleSource;
    private Date expiryDate;
    private String cssClass;
    //_links LinkItem list
    private List<LinkItem> _links;

    public Number getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Number templateId) {
        this.templateId = templateId;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getSubSampleAlias() {
        return subSampleAlias;
    }

    public void setSubSampleAlias(String subSampleAlias) {
        this.subSampleAlias = subSampleAlias;
    }

    public Quantity getStorageTempMin() {
        return storageTempMin;
    }

    public void setStorageTempMin(Quantity storageTempMin) {
        this.storageTempMin = storageTempMin;
    }

    public Quantity getStorageTempMax() {
        return storageTempMax;
    }

    public void setStorageTempMax(Quantity storageTempMax) {
        this.storageTempMax = storageTempMax;
    }

    public String getSampleSource() {
        return sampleSource;
    }

    public void setSampleSource(String sampleSource) {
        this.sampleSource = sampleSource;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public List<LinkItem> get_links() {
        return _links;
    }

    public void set_links(List<LinkItem> _links) {
        this._links = _links;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public void addCssClass(String cssClass) {
        if(!this.cssClass.isEmpty()) this.cssClass += " "+cssClass;
        else this.cssClass = cssClass;
    }

}

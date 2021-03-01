package com.example.demo.dao;

import java.util.List;

public class Container extends InventoryRecordInfo {

    private User owner;
    private Integer locationsCount;
    private Integer contentCount;
    private String gridLayout;
    private Boolean canStoreSamples;
    private Boolean canStoreContainers;
    private String cType;
    private List<LinkItem> _links;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Integer getLocationsCount() {
        return locationsCount;
    }

    public void setLocationsCount(Integer locationsCount) {
        this.locationsCount = locationsCount;
    }

    public Integer getContentCount() {
        return contentCount;
    }

    public void setContentCount(Integer contentCount) {
        this.contentCount = contentCount;
    }

    public String getGridLayout() {
        return gridLayout;
    }

    public void setGridLayout(String gridLayout) {
        this.gridLayout = gridLayout;
    }

    public Boolean getCanStoreSamples() {
        return canStoreSamples;
    }

    public void setCanStoreSamples(Boolean canStoreSamples) {
        this.canStoreSamples = canStoreSamples;
    }

    public Boolean getCanStoreContainers() {
        return canStoreContainers;
    }

    public void setCanStoreContainers(Boolean canStoreContainers) {
        this.canStoreContainers = canStoreContainers;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public List<LinkItem> get_links() {
        return _links;
    }

    public void set_links(List<LinkItem> _links) {
        this._links = _links;
    }
}

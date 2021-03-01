package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubSampleInfo extends InventoryRecordInfo{

    //list of parentContainers
    List<Container> parentContainers;

    String containersName = "";

    //parent location
    Location parentLocation;

    List<LinkItem> _links;

    public List<Container> getParentContainers() {
        return parentContainers;
    }

    public void setParentContainers(List<Container> parentContainers) {
        this.parentContainers = parentContainers;
    }

    public String getContainersName() {
        return containersName;
    }

    public void setContainersName(String containersName) {
        this.containersName = containersName;
    }

    public Location getParentLocation() {
        return parentLocation;
    }

    public void setParentLocation(Location parentLocation) {
        this.parentLocation = parentLocation;
    }

    public List<LinkItem> get_links() {
        return _links;
    }

    public void set_links(List<LinkItem> _links) {
        this._links = _links;
    }

    public void gatherContainersName() {

        if (parentContainers != null) {
            List<String> names = new ArrayList<>();
            for (Container container : parentContainers) {

                names.add(container.getName());

            }

            if (!names.isEmpty()) containersName = String.join(",", names);

        }
    }

}

package com.example.demo.dao;

public class ExtraField {

    private Integer id;
    private String globalId;
    private String type;
    private String name;
    private String content;
    private String parentGlobalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getParentGlobalId() {
        return parentGlobalId;
    }

    public void setParentGlobalId(String parentGlobalId) {
        this.parentGlobalId = parentGlobalId;
    }
}

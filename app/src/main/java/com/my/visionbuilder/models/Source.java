package com.my.visionbuilder.models;

public class Source {
    String sourceName, sourceOf;

    public Source(String sourceName, String sourceOf) {
        this.sourceName = sourceName;
        this.sourceOf = sourceOf;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceOf() {
        return sourceOf;
    }

    public void setSourceOf(String sourceOf) {
        this.sourceOf = sourceOf;
    }
}

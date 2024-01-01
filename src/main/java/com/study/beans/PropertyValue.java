package com.study.beans;

import lombok.Data;

@Data
public class PropertyValue {
    private final String type;
    private final String name;
    private final Object value;
    private final Boolean isRef;

    public PropertyValue(String type, String name, Object value, boolean isRef) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.isRef = isRef;
    }
}

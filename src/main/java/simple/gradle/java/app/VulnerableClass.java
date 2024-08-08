package com.example;

import java.io.Serializable;

public class VulnerableClass implements Serializable {
    private static final long serialVersionUID = 1L;

    private String data;

    public VulnerableClass(String data) {
        this.data = data;
    }

    private Object readResolve() {
        // This method is automatically called during deserialization
        // and can be exploited to execute arbitrary code
        System.out.println("Executing arbitrary code during deserialization!");
        return this;
    }

    @Override
    public String toString() {
        return "VulnerableClass with data: " + data;
    }
}

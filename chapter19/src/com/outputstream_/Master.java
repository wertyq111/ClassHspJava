package com.outputstream_;

import java.io.Serializable;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Master implements Serializable {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                '}';
    }
}

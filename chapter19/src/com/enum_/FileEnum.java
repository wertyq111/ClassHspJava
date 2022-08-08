package com.enum_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public
enum FileEnum {
    DIR_PATH("/Users/zhouxufeng/program/ClassHspJava/chapter19/");

    private String path;

    private FileEnum(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }
}

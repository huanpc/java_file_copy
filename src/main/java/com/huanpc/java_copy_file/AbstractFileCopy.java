package com.huanpc.java_copy_file;

import java.io.File;

public abstract class AbstractFileCopy {
    private File source;
    private File target;

    public AbstractFileCopy(File sourceParam, File targetParam) {
        this.source = sourceParam;
        this.target = targetParam;
    }

    public abstract void copy();
}
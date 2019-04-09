package com.huanpc.java_copy_file;

public class FileCopyFactory {
    public static FileCopy createFileCopy(FileCopyType fileCopyType) {
        switch (fileCopyType) {
            case NAIVE_STREAMS:
                return new NaiveStreamsCopy();
                break;
            case NAIVE_READER:
                break;
            default:
                break;
        }
        return null;
    }

}
package com.xupt.io.file;

import java.io.File;
import java.io.IOException;

public class TestFile03 {
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\JAVA\\IdeaProjects");
        f.list();
        File[] fs=f.listFiles();
        f.getParent();
        f.getParentFile();
        f.mkdir();
        f.mkdirs();
        f.createNewFile();
        f.getParentFile().mkdirs();
        f.listRoots();
    }
}

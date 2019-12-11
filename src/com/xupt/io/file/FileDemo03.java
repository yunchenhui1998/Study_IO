package com.xupt.io.file;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        //基本信息
        File src=new File("d:\\java\\io_study\\IO.png");
        System.out.println("名称"+src.getName());
        System.out.println("路径"+src.getPath());
        System.out.println("绝对路径"+src.getAbsolutePath());
        System.out.println("父路径"+src.getParent());
    }
}

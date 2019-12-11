package com.xupt.io.file;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        //1.构建File对象
        String path="d:\\java\\io_study\\IO.png";
        File src=new File(path);
        System.out.println(src.length());
        //2.构建File对象
        src=new File("d:\\java\\io_study\\IO.png");
        System.out.println(src.length());
        //3.构建File对象
        src=new File("d:\\java\\io_study","IO.png");
        System.out.println(src.length());
    }
}

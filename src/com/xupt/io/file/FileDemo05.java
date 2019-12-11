package com.xupt.io.file;

import java.io.File;

/*
其他信息
length():返回文件字节数，不能返回文件夹字节数
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File src=new File("E:\\JAVA\\IdeaProjects\\Study_IO\\IO.png");
        System.out.println("长度:"+src.length());
        src=new File("E:\\JAVA\\IdeaProjects\\Study_IO\\IO.png");
        System.out.println("长度:"+src.length());
    }
}

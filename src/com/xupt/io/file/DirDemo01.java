package com.xupt.io.file;

import java.io.File;

/*
创建目录
1.mkdir():确保上级目录存在，不存在创建失败
2.mkdirs():上级目录可以不存在，不存在一起创建
 */
public class DirDemo01 {
    public static void main(String[] args) {
        File dir=new File("E:\\JAVA\\IdeaProjects\\Study_IO\\dir\\test");
        boolean flag=dir.mkdirs();
        System.out.println(flag);
        dir=new File("E:\\JAVA\\IdeaProjects\\Study_IO\\dir\\io");
        flag=dir.mkdir();
        System.out.println(flag);
    }
}

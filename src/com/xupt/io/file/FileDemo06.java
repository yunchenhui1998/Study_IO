package com.xupt.io.file;

import java.io.File;
import java.io.IOException;
/*
其他信息：
创建文件：createNewFile  ()  不存在才创建，不能创建文件夹
删除文件：delete()
 */
public class FileDemo06 {
    public static void main(String[] args) throws IOException {
        //创建一个文件
        File src=new File("E:\\JAVA\\IdeaProjects\\Study_IO\\IO.txt");
        boolean flag=src.createNewFile();
        System.out.println(flag);
        //删除一个文件
        boolean flag2=src.delete();
        System.out.println(flag2);
    }
}

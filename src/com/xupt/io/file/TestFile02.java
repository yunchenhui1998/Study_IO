package com.xupt.io.file;

import java.io.File;
import java.util.Date;

public class TestFile02 {
    public static void main(String[] args) {
        File f=new File("D:/LOLFolder/LOL.png");
        System.out.println("当前文件是："+f);
        System.out.println("判断是否存在："+f.exists());
        System.out.println("判断是否是文件夹："+f.isDirectory());
        System.out.println("判断是否是文件："+f.isFile());
        System.out.println("获取文件的长度："+f.length());
        long time=f.lastModified();
        Date d=new Date(time);
        System.out.println("文件的最后修改时间为："+d);
        f.setLastModified(0);
        File f2=new File("D:/LOLFolder/DOTA.png");
        System.out.println(f.renameTo(f2));
    }
}

package com.xupt.io.file;

import java.io.File;

public class TestFile01 {
    public static void main(String[] args) {
        File f1=new File("d:/LOLFolder");
        System.out.println("f1的绝对路径："+f1.getAbsolutePath());
        File f2=new File("LOL.png");
        System.out.println("f2的绝对路径："+f2.getAbsolutePath());
        File f3=new File(f1,"LOL.png");
        System.out.println("f3的绝对路径："+f3.getAbsolutePath());
    }
}

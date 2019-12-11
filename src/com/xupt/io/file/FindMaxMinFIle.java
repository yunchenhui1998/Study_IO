package com.xupt.io.file;

import java.io.File;

public class FindMaxMinFIle {
    public static void main(String[] args) {
        File f=new File("C:/WINDOWS");
        File[] allFiles=f.listFiles();
        long min= Long.MAX_VALUE;
        long max=0;
        String maxFile=new String();
        String minFile=new String();
        for(File f1:allFiles){
            if(f1.length()<min){
                min=f1.length();
                minFile=f1.getAbsolutePath();
            }
            if(f1.length()>max){
                max=f1.length();
                maxFile=f1.getAbsolutePath();
            }
        }
        System.out.println("最大的文件是："+maxFile+"，其大小是"+min+"字节。");
        System.out.println("最小的文件是："+minFile+"，其大小是"+max+"字节。");
    }
}

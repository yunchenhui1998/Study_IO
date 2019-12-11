package com.xupt.io.file;

import java.io.File;

public class DirDemo04 {
    public static void main(String[] args) {
        File dir=new File("E:\\JAVA\\IdeaProjects\\Study_IO");
        count(dir);
        System.out.println(len);
    }
    public static long len=0;
    private static void count(File src){
        if(src!=null&&src.exists()){
            if(src.isFile()){
                len+=src.length();
            }else{
                for(File f:src.listFiles()){
                    count(f);
                }
            }
        }
    }
}

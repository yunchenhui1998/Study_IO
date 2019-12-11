package com.xupt.io.file;

import java.io.File;

/*
递归打印子孙级目录和文件名车给
 */
public class DirDemo03 {

    public static void main(String[] args) {
        File dir=new File("E:\\JAVA\\IdeaProjects\\Study_IO");
        printName(dir,0);
    }
    private static void printName(File src,int deep){
        for(int i=0;i<deep;i++){
            System.out.print("-");
        }
        System.out.println(src.getName());
        if(src==null||!src.exists()){
            return;
        }else if(src.isDirectory()){
            for(File s:src.listFiles()){
                printName(s,deep+1);
            }
        }
    }
}

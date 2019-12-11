package com.xupt.io.file;

import java.io.File;

/*
列出下一级
1.list():列出下级名称
2.listFiles():列出下级File对象
3.listRoots();列出所有盘符
 */
public class DirDemo02 {
    public static void main(String[] args) {
        File dir=new File("E:\\JAVA\\IdeaProjects\\Study_IO");
        //下级名称 list()
        String[] subNames=dir.list();
        for(String s:subNames){
            System.out.println(s);
        }
        //下级对象 listFiles()
        File[] subFiles=dir.listFiles();
        for(File f:subFiles){
            System.out.println(f.getAbsolutePath());
        }
        //所有盘符
        File[] roots=dir.listRoots();
        for(File f:roots){
            System.out.println(f.getAbsolutePath());
        }
    }
}

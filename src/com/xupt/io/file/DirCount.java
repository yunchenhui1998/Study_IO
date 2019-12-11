package com.xupt.io.file;

import java.io.File;

/*
使用面向对象统计文件大小
 */
public class DirCount {
    private long len;
    private int dirSize;
    private int fileSize;
    private  String path;
    private File src;
    public DirCount(String path){
        this.path=path;
        this.src=new File(path);
        count(this.src);
    }
    private void count(File f){
        if(f!=null&&f.exists()){
            if(f.isFile()){
                len+=f.length();
                this.fileSize++;
            }else{
                this.dirSize++;
                for(File d:f.listFiles()){
                    count(d);
                }
            }
        }
    }

    public long getLen() {
        return len;
    }

    public int getDirSize() {
        return dirSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public static void main(String[] args) {
        DirCount dir=new DirCount("E:\\JAVA\\IdeaProjects\\Study_IO");
        System.out.println(dir.getLen() );
        System.out.println(dir.getDirSize());
        System.out.println(dir.getFileSize());
    }
}

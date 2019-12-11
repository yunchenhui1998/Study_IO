package com.xupt.io.file;

import java.io.File;

/*
文件状态
1.是否存在：exists()
2.是否是文件：isFile()
3.是否是文件夹：isDirectory()
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File src=new File("d:\\java\\io_study\\IO.png");
        System.out.println("是否存在"+src.exists());
        System.out.println("是否文件"+src.isFile());
        System.out.println("是否文件夹"+src.isDirectory());
        //文件状态
        src=new File("xxx");
        if(src==null||!src.exists()){
            System.out.println("文件不存在");
        }else{
            if(src.isFile()){
                System.out.println("文件操作");
            }else{
                System.out.println("文件夹操作");
            }
        }
    }
}

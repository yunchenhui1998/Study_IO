package com.xupt.io.file;

import java.io.File;

/*
构建File对象
绝对路径与相对路径
1.存在盘符：绝对路径
2.不存在盘符：相对路径，相对于当前目录
 */
public class FileDemo02 {
    public static void main(String[] args) {
        String path="d:\\java\\io_study\\IO.png";
        //绝对路径
        File src=new File(path);
        System.out.println(src.getAbsolutePath());
        //获取当前目录
        System.out.println(System.getProperty("user.dir"));
        //相对路径
        src=new File("IO.png");
        System.out.println(src.getAbsolutePath());
        //可以构建一个不存在的文件
    }
}

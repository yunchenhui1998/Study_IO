package com.xupt.io.file;

import java.io.File;

public class PathDemo01 {
    public static void main(String[] args){
        String path="D:\\java\\..";
        System.out.println(File.separator);
        //建议
        //1.\
        path="d:\\java\\io_study";
        System.out.println(path);
        //2.常量拼接
        path="D:"+File.separator+"java"+File.separator+"io_study";
        System.out.println(path);
    }
}

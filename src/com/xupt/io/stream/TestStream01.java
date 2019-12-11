package com.xupt.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestStream01 {
    public static void main(String[] args) {
        try {
            File f=new File("D:/lol.txt");
            FileInputStream fis=new FileInputStream(f);
            byte[] all=new byte[(int)f.length()];
            fis.read(all);
            for(byte b:all){
                System.out.println(b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

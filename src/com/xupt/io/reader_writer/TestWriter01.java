package com.xupt.io.reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriter01 {
    public static void main(String[] args) {
        File f=new File("D:lol.txt");
        String data="abcdefg1234567890";
        char[] all=data.toCharArray();
        try(FileWriter fw=new FileWriter(f)){
            fw.write(all);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

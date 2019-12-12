package com.xupt.io.reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestReader01 {
    public static void main(String[] args) {
        FileReader fr=null;
        try {
            File f = new File("D:/lol.txt");
            fr = new FileReader(f);
            char[] all = new char[(int) f.length()];
            fr.read(all);
            for(char a:all){
                System.out.println(a);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fr!=null){
                try {
                    fr.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

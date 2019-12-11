package com.xupt.io.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream02 {
    public static void main(String[] args) {
        try {
            File f=new File("D:/lol.txt");
            FileOutputStream fos=new FileOutputStream(f);
            byte[] data={88,89};
            fos.write(data);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

package com.xupt.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//将上一个文件中拆分的文件合并
public class PracticeStream03 {
    private static final int numbers=6;
    public static void combineFiles(File[] files) throws IOException {
        File fo=new File("D:/test.exe");
        try(FileOutputStream fos=new FileOutputStream(fo)) {
            int n;
            for (File f : files) {
                byte[] buffer = new byte[(int) f.length()];
                try(FileInputStream fis = new FileInputStream(f)) {
                    fis.read(buffer);
                    fos.write(buffer);
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        File[] files=new File[numbers];
        for(int i=0;i<numbers;i++){
            files[i]=new File("D:/test"+(i+1)+".exe");
        }
        try{
            combineFiles(files);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

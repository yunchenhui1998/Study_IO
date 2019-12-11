package com.xupt.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//将一个文件以100kb为单位拆分
public class PracticeStream02 {
    public static void main(String[] args)  {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            File fi = new File("D:/test.exe");
            fis = new FileInputStream(fi);
            byte[] buffer = new byte[100 * 1024];
            int i = 1;
            int n;
            while ((n = fis.read(buffer)) != -1) {
                File fo = new File("D:/test" + i + ".exe");
                if (!fo.exists()) {
                    fo.createNewFile();
                }
                try {
                    fos = new FileOutputStream(fo);
                    fos.write(buffer, 0, n);
                    fos.close();
                    i++;
                }catch(IOException e){
                    e.printStackTrace();
                }finally {
                    if(fos!=null){
                        fos.close();
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(fis!=null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

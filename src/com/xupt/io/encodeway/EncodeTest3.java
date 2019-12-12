package com.xupt.io.encodeway;

import java.io.*;
import java.nio.charset.Charset;

public class EncodeTest3 {
    public static void main(String[] args) {
        File f=new File("D:/lol.txt");
        System.out.println("默认编码方式为："+Charset.defaultCharset());
        try(FileReader fr=new FileReader(f)){
            char[] c=new char[(int)f.length()];
            fr.read(c);
            System.out.println("默认编码方式识别出的字符是"+new String(c));
        }catch (IOException e){
            e.printStackTrace();
        }
        try(InputStreamReader isr=new InputStreamReader(new FileInputStream(f),Charset.forName("GBK"))){
            char[] cs=new char[(int)f.length()];
            isr.read(cs);
            System.out.println("指定编码格式GBK读取出的字符是:"+new String(cs));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

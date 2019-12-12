package com.xupt.io.encodeway;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class EncodeTest2 {
    public static void main(String[] args) {
      File f=new File("D:/lol.txt");
      try(FileInputStream fis=new FileInputStream(f)){
          byte[] all=new byte[(int)f.length()];
          fis.read(all);
          System.out.println("文件读出的数据是：");
          for(byte b:all){
              int i=b&0xff;
              System.out.println(Integer.toHexString(i));
          }
          System.out.println("把这个数字放到UTF-8棋盘中去");
          String str=new String(all,"UTF-8");
          System.out.println(str);
      }catch(IOException e ){
          e.printStackTrace();;
      }
    }
}

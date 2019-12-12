package com.xupt.io.Data;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        write();
        read();
    }
    private static void write(){
        File f=new File("D:/lol.txt");
        try(FileOutputStream fis=new FileOutputStream(f); DataOutputStream dos=new DataOutputStream(fis)){
            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeUTF("123,this is gareen.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void read(){
        File f=new File("D:/lol.txt");
        try(FileInputStream fis=new FileInputStream(f);DataInputStream dis=new DataInputStream(fis)){
            boolean b=dis.readBoolean();
            int i=dis.readInt();
            String str=dis.readUTF();
            System.out.println("读取到的布尔值为:"+b);
            System.out.println("读取到的整数:"+i);
            System.out.println("读取到的字符串:"+str);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

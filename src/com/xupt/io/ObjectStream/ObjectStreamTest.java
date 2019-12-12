package com.xupt.io.ObjectStream;

import java.io.*;

public class ObjectStreamTest {
    public static void main(String[] args) {
        Hero h=new Hero("gailun",616);
        write("D:/garen.lol",h);
        read("D:/garen.lol");
    }
    private static void write(String path,Hero h){
        File f=new File(path);
        try(FileOutputStream fos=new FileOutputStream(f); ObjectOutputStream oos=new ObjectOutputStream(fos)){
            if(!f.exists()){
                f.createNewFile();
            }
            oos.writeObject(h);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void read(String path){
        File f=new File(path);
        try(FileInputStream fis=new FileInputStream(f);ObjectInputStream ois=new ObjectInputStream(fis)){
            Hero h=(Hero)ois.readObject();
            System.out.println(h.getName());
            System.out.println(h.getHp());
        }catch (IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

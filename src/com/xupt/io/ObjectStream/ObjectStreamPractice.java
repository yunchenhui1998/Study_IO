package com.xupt.io.ObjectStream;

import java.io.*;

public class ObjectStreamPractice {
    public static void main(String[] args) {
        boolean flag=true;
        Hero[] heroes=new Hero[5];
        heroes[0]=new Hero("GaiLun",700);
        heroes[1]=new Hero("Jie",650);
        heroes[2]=new Hero("Timo",637);
        heroes[3]=new Hero("AiXi",600);
        heroes[4]=new Hero("Aike",645);
        write("D:/heros.lol",heroes);
        Hero[] newHeros=read("D:/heros.lol");
        for(int i=0;i<5;i++){
            if(!heroes[i].getName().equals(newHeros[i].getName())||heroes[i].getHp()!=newHeros[i].getHp()){
                System.out.println(heroes[i].getName());
                System.out.println(newHeros[i].getName());
                System.out.println(heroes[i].getHp());
                System.out.println(newHeros[i].getHp());
                flag=false;
            }
        }
        System.out.println(flag);
    }
    private static void write(String path,Hero[] heroes){
        File f=new File(path);
        try(FileOutputStream fos=new FileOutputStream(f); ObjectOutputStream oos=new ObjectOutputStream(fos)){
            if(!f.exists()){
                f.createNewFile();
            }
            for(Hero h:heroes){
                oos.writeObject(h);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static Hero[] read(String path){
        File f=new File(path);
        Hero[] heroes=new Hero[5];
        try(FileInputStream fis=new FileInputStream(f);ObjectInputStream ois=new ObjectInputStream(fis)){
            for(int i=0;i<5;i++){
                heroes[i]=(Hero) ois.readObject();
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return heroes;
    }
}

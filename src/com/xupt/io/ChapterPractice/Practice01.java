package com.xupt.io.ChapterPractice;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

/*
自动创建有一个属性的类文件。
通过控制台，获取类名，属性名称，属性类型，根据一个模板文件，自动创建这个类文件，并且为属性提供setter和getter
public class @class@ {
    public @type@ @property@;
    public @class@() {
    }
    public void set@Uproperty@(@type@  @property@){
        this.@property@ = @property@;
    }

    public @type@  get@Uproperty@(){
        return this.@property@;
    }
}
 */
public class Practice01 {
    public static void main(String[] args) {
        File fi=new File("D:/classmodel.java");
        File fo=new File("D:/Dog.java");
        Scanner in =new Scanner(System.in);
        System.out.println("请输入类的名称");
        String className=in.nextLine();
        System.out.println("请输入属性的类型");
        String propertyType=in.nextLine();
        System.out.println("请输入属性的名称");
        String propertyName=in.nextLine();
        String uProerty=propertyName.replaceFirst(String.valueOf(propertyName.charAt(0)),String.valueOf((char)(propertyName.charAt(0)-32)));
        StringBuffer sb=new StringBuffer();
        try(FileReader fr=new FileReader(fi); BufferedReader br=new BufferedReader(fr)){
            String line;
            while((line=br.readLine())!=null){
                if (line.contains("@class@")) {
                    line = line.replace("@class@", className);
                }
                if (line.contains("@type@")) {
                    line = line.replace("@type@", propertyType);
                }
                if (line.contains("@property@")) {
                    line = line.replace("@property@", propertyName);
                }
                if (line.contains("@Uproperty@")) {
                    line = line.replace("@Uproperty@", uProerty);
                }
                sb.append(line+"\r\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try(FileWriter fw=new FileWriter(fo);PrintWriter pw=new PrintWriter(fw)){
            if(!fo.exists()){
                fo.createNewFile();
            }
            pw.write(sb.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

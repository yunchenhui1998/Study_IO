package com.xupt.io.Data;

import java.io.*;

/*
练习-向文件中写入两个数字，然后把这两个数字分别读取出来
要求
第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。
注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。

第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字
 */
public class DataStreamPractice {
    public static void main(String[] args) {
//        printWrite("D:/lol.txt","3115");
//        bufferedRead("D:/lol.txt");
          dataOutput("D:/lol.txt");
          dataInput("D:/lol.txt");
    }
    private static void printWrite(String path,String s){
        File f=new File(path);
        try(FileWriter fw=new FileWriter(f);PrintWriter bw=new PrintWriter(fw)){
            fw.write(s);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void bufferedRead(String path){
        File f=new File(path);
        try(FileReader fr=new FileReader(f);BufferedReader br=new BufferedReader(fr)){
            String nums=br.readLine();
            String[] strs=nums.split("@");
            for(String s:strs){
                System.out.println(s);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void dataOutput(String path){
        File f=new File(path);
        try(FileOutputStream fos=new FileOutputStream(f);DataOutputStream dos=new DataOutputStream(fos)){
            dos.writeInt(221);
            dos.writeInt(225);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void dataInput(String path){
        File f=new File(path);
        try(FileInputStream fis=new FileInputStream(f);DataInputStream dis=new DataInputStream(fis)){
            System.out.println(dis.readInt());
            System.out.println(dis.readInt());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

package com.xupt.io.BufferedReader_PrintWriter;

import java.io.*;

public class Practice01 {
    private static void removeComments(String path){
        File f=new File(path);
        StringBuffer sb=new StringBuffer();
        try(FileReader fr=new FileReader(f); BufferedReader br=new BufferedReader(fr)){
            while(true){
                String s=br.readLine();
                if(s==null){
                    break;
                }
                if(!s.trim().startsWith("//")){
                    sb.append(s).append("\r\n");
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try(FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw)){
            pw.write(sb.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String path="D:/lol.txt";
        removeComments(path);
    }
}

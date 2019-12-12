package com.xupt.io.BufferedReader_PrintWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest01 {
    public static void main(String[] args) {
        File f=new File("D:/lol.txt");
        try(
                FileWriter fw=new FileWriter(f);
                PrintWriter pw=new PrintWriter(fw);
            ){
            pw.println("garen kill teemo");
            pw.flush();
            pw.println("teemo revives after 1 minutes");
            pw.flush();
            pw.println("teemo try to garen,but kulled again");
            pw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

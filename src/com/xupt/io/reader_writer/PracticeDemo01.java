package com.xupt.io.reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//将一个文件加密后输出到另一个文件中
public class PracticeDemo01 {
    private File fi;
    private File fo;
    private static boolean flag=false;
    public PracticeDemo01(String pathFI,String pathFO){
        this.fi=new File(pathFI);
        this.fo=new File(pathFO);
        if(flag==false){
            encode(fi,fo);
        }
    }
    private static void encode(File fi,File fo){
        try(FileReader fr=new FileReader(fi); FileWriter fw=new FileWriter(fo)){
            char[] all=new char[(int)fi.length()];
            char[] encodedAll=new char[(int)fi.length()];
            fr.read(all);
            for(int i=0;i<all.length;i++){
                if(all[i]>='0'&&all[i]<='9'){
                    if(all[i]=='9'){
                        all[i]='0';
                    }else {
                        all[i]+=1;
                    }
                }else if(all[i]>='a'&&all[i]<='z'){
                    if(all[i]=='z'){
                        all[i]='a';
                    }else {
                        all[i] += 1;
                    }
                }else if(all[i]>='A'&&all[i]<='Z'){
                    if(all[i]=='Z'){
                        all[i]='A';
                    }else{
                        all[i]+=1;
                    }
                }else{
                    all[i]=all[i];
                }
            }
            fw.write(all);
            flag=true;
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public static void main(String[] args) {
        PracticeDemo01 p=new PracticeDemo01("D:/encoding.txt","D:/encoded.txt");
        System.out.println(p.isFlag());
    }
}

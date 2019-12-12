package com.xupt.io.reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//以下程序将PracticeDemo01中加密的文件解密
public class PracticeDemo02 {
    private File fi;
    private File fo;
    private static boolean flag=false;
    public PracticeDemo02(String fiPath,String foPath){
        fi=new File(fiPath);
        fo=new File(foPath);
        if(flag==false){
            decode(fi,fo);
        }
    }
    private void decode(File fi,File fo){
        try(FileReader fr=new FileReader(fi); FileWriter fw=new FileWriter(fo)){
            char[] all=new char[(int)fi.length()];
            fr.read(all);
            for(int i=0;i<all.length;i++){
                if(all[i]>='0'&&all[i]<=9){
                    if(all[i]=='0'){
                        all[i]='9';
                    }else{
                        all[i]-=1;
                    }
                }else if(all[i]>='a'&&all[i]<='z'){
                    if(all[i]=='a'){
                        all[i]='z';
                    }else{
                        all[i]-=1;
                    }
                }else if(all[i]>='A'&&all[i]<='Z'){
                    if(all[i]=='A'){
                        all[i]='Z';
                    }else{
                        all[i]-=1;
                    }
                }
            }
            fw.write(all);
            flag=true;
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static boolean isFlag() {
        return flag;
    }

    public static void main(String[] args) {
        PracticeDemo02 p2=new PracticeDemo02("D:/encoded.txt","D:/encoding.txt");
        System.out.println(p2.isFlag());
    }
}

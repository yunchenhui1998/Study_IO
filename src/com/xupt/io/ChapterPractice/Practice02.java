package com.xupt.io.ChapterPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice02 {
    public static void main(String[] args) {
        search(new File("D:/target01"),"Magic");
    }
    private static void copyFile(String srcFile,String destFile){
        File fi=new File(srcFile);
        File fo=new File(destFile);
        byte[] all=new byte[(int)fi.length()];
        int len=-1;
        try(FileInputStream fis=new FileInputStream(fi); FileOutputStream fos=new FileOutputStream(fo)){
            if(!fo.exists()){
                fo.createNewFile();
            }
            while((len=fis.read(all))!=-1){
                fos.write(all,0,len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void copyFolder(String srcFolder,String destFolder){
        File fi=new File(srcFolder);
        File fo=new File(destFolder);
        for (File f : fi.listFiles()) {
            String newPath = destFolder + "/" + f.getName();
            if (f.isFile()) {
                copyFile(f.getAbsolutePath(), newPath);
            } else {
                new File(newPath).mkdirs();
                copyFolder(f.getAbsolutePath(), newPath);
            }
        }
    }
    private static void search(File folder,String search){
        if(folder.isFile()){
            searchFileKey(folder,search);
        }else{
            for(File f:folder.listFiles()){
                search(f,search);
            }
        }
    }
    private static void searchFileKey(File f,String key){
        int len=-1;
        try(FileInputStream fis=new FileInputStream(f)){
            byte[] all=new byte[(int)f.length()];
            while((len=fis.read(all))!=-1){
                String tmp=new String(all);
                if(tmp.contains("Magic")){
                    System.out.println(f.getAbsolutePath());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

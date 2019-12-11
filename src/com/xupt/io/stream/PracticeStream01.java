package com.xupt.io.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//如下程序输出一个文件，如目录不存在则创建
public class PracticeStream01 {
    public static void main(String[] args) throws IOException {
        File f=new File("D:/xyz/abc/LOL.txt");
        if(!f.exists()){
            f.getParentFile().mkdirs();
            f.createNewFile();
        }
        FileOutputStream fos=new FileOutputStream(f);
        byte[] data={48,65,97};
        fos.write(data);
        fos.close();
    }
}

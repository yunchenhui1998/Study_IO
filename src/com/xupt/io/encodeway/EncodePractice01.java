package com.xupt.io.encodeway;

import java.io.IOException;

//找出 E5 B1 8C 这3个十六进制对应UTF-8编码的汉字
public class EncodePractice01 {
    public static void main(String[] args) {
        byte[] all={(byte) 0xe5,(byte) 0xb1,(byte) 0x8c};
        try {
            System.out.println(new String(all, "UTF-8"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

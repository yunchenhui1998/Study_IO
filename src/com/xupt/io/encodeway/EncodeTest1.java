package com.xupt.io.encodeway;

import java.io.UnsupportedEncodingException;

public class EncodeTest1 {
    public static void main(String[] args) {
        String str="中";
        encode(str);
    }
    private static void encode(String str){
        String[] encodes={"BIG5","GBK","GB2312","UTF-8","UTF-16","UTF-32"};
        for(String s:encodes){
            encode(str,s);
        }
    }
    private static void encode(String str,String encodeways){
        System.out.printf("字符：\"%s\"在编码方式%s下的十六进制是：",str,encodeways);
        try{
            byte[] res=str.getBytes(encodeways);
            for(byte b:res){
                int i=b&0xff;
                System.out.print(Integer.toHexString(i)+"\t");
            }
            System.out.println();
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}

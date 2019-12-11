package com.xupt.io.file;

import java.io.File;

public class FindMaxMinFile2 {
    private long maxSize;
    private long minSize=Long.MAX_VALUE;
    private File maxFile;
    private File minFile;
    private File dir;
    public FindMaxMinFile2(String path){
        this.dir=new File(path);
        findMaxMinFile(this.dir);
    }
    private void findMaxMinFile(File dir){
        if(dir!=null&&dir.exists()) {
            if (dir.isFile()) {
                if (dir.length() > maxSize) {
                    maxSize = dir.length();
                    maxFile = dir;
                }
                if (dir.length() < minSize) {
                    minSize = dir.length();
                    minFile = dir;
                }
            } else {
                File[] nextDir = dir.listFiles();
                if (nextDir == null) {
                    return;
                }
                for (File f : nextDir) {
                    findMaxMinFile(f);
                }
            }
        }
    }

    public long getMaxSize() {
        return maxSize;
    }

    public long getMinSize() {
        return minSize;
    }

    public File getMaxFile() {
        return maxFile;
    }

    public File getMinFile() {
        return minFile;
    }

    public static void main(String[] args) {
        FindMaxMinFile2 find=new FindMaxMinFile2("E:\\JAVA");
        System.out.println("最大的文件是："+find.getMaxFile().getAbsolutePath()+",其大小是"+find.getMaxSize()+"字节。");
        System.out.println("最小的文件是："+find.getMinFile().getAbsolutePath()+",其大小是"+find.getMinSize()+"字节。");
    }
}

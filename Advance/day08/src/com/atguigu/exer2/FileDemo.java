package com.atguigu.exer2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Chris Jin
 * @create 2022-04-23 10:41 AM
 */
public class FileDemo {
    @Test
    public void test1() throws IOException {
        File file = new File("D:\\workspaces\\hello.txt");
        File destFile = new File(file.getParent(),"haha.txt");
        destFile.createNewFile();
    }
}

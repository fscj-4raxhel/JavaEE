package com.atguigu.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author Chris Jin
 * @create 2022-04-26 8:46 PM
 */
public class FileUtilsTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("day10\\dbcp.txt");
        File destFile = new File("day10\\dbcp_copy.txt");


        FileUtils.copyFile(srcFile,destFile);
    }
}

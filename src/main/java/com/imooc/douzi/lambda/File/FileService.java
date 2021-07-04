package com.imooc.douzi.lambda.File;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ：lujinlong
 * @date ：Created in 2019/11/14 23:27
 * @modified By：
 */
public class FileService {


    public static void fileHandle(String url,FileConsumer fileConsumer) throws IOException {
        //创建文件读取流
         BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(new FileInputStream(url)));
        //定义行变量和内容sb
        String line;
         StringBuilder stringBuilder = new StringBuilder();
         //循环读取文件内容
         while(null != (line = bufferedReader.readLine())){
             stringBuilder.append(line+"\n");
         }
         //调用函数式方法，将文件内容传递给lambda表达式，实现业务去求
        fileConsumer.fileHandler(stringBuilder.toString());
    }
}

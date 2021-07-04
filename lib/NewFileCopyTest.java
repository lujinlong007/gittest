package com.imooc.douzi.Resource;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ：lujinlong
 * @date ：Created in 2019/11/15 16:15
 * @modified By：
 */
public class NewFileCopyTest {

    @Test
    public  void copyFile(){

        String originalUrl="F:\\996\\lib\\FileCloseTest.java";
        String targetUrl="F:\\996\\target\\targetTest\\testNew.txt";

            try(FileInputStream originalStream = new FileInputStream(originalUrl);
                FileOutputStream targetStream = new FileOutputStream(targetUrl);){


                //读取的字节信息
                int content;

                //迭代 读取、写入字节
                while((content=originalStream.read())!=-1){
                    targetStream.write(content);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

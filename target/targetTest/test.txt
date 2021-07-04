package com.imooc.douzi.Resource;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ：lujinlong
 * @date ：Created in 2019/11/15 16:00
 * @modified By：
 * jdk7之前的文件拷贝功能
 */
public class FileCloseTest {
    @Test
  public  void copyFile() {


      /**
      *@Description:
      *@Param:
      *@return:
      *@Author: your name
      *@date:
       * 1创建输入输出流
       * 2执行文件拷贝 读取文件内容，写入到另一个文件中
       * 3关闭文件流资源
      */

      String originalUrl="F:\\996\\lib\\FileCloseTest.java";
      String targetUrl="F:\\996\\target\\targetTest\\test.txt";
      FileInputStream originaleFileInputStream=null;
      FileOutputStream targetFileOutputStream=null;

      try{


          originaleFileInputStream = new FileInputStream(originalUrl);
          targetFileOutputStream=new FileOutputStream(targetUrl);

          //读取的字节信息
          int content;

          //迭代 读取、写入字节
          while((content=originaleFileInputStream.read())!=-1){
                  targetFileOutputStream.write(content);
          }


      }catch (FileNotFoundException e){
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }finally {
          //关闭流资源
          if(targetFileOutputStream!=null){
              try {
                  targetFileOutputStream.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          if(originaleFileInputStream!=null){
              try {
                  originaleFileInputStream.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }


  }


}

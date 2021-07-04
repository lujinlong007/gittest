package com.imooc.douzi.lambda.File;


@FunctionalInterface
public interface FileConsumer {
   void fileHandler(String fileContent);
}

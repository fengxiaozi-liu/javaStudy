package com.javaOthers4;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
java文件流和IO操作
1. 描述
    1. java.io包几乎包含了所有操作输入, 输出需要的类. 所有这些流类代表了输入源和输出目标
    2. 一个流可以理解为一个数据的序列, 输入流表示从一个源读取数据, 输出流表示向一个目标写数据
2. 读取控制台的输出
    1. java的控制台输入由System.in完成
    2. 为了获得一个绑定到控制台的字符流, 你可以把System.in包装在一个BufferedReader对象中来创建一个字符流
    3. 从BufferReader对象读取一个字符要使用read()方法, 每次调用read()方法, 它从一个输入流读取一个字符并把该字符作为整数
       值返回.当流结束的时候返回-1.该方法抛出IOException
    4. 读取控制台输入的步骤
        1. 创建一个BufferReader对象
            BufferReader br = new BufferedReader(new InputStreamReader(System.in))
        2. int read() throws IOException方法
            1. read()方法可以将输入的字符串转换成单个字符并输入
            2. read()方法抛出了一个异常那么它的外部方法必须也要抛出有一个IO异常
        3. String readLine() throws IOException
            1. readLine()是从标准输入中读取一个字符串
            2. 同样它也定义了一个抛出异常,那么它的包装他的外部方法也必须抛出一个异常

3. 文件流
    1. 文件读取
        1. 创建文件读取对象
            1. 使用字符串类型的对象来创建一个输入流对象来读取数据
                InputStream f = new FileInputStream("文件路径");
            2. 使用文件对象创建一个输入流对象来读取文件
                File f = new File("文件路径")
                InputStream in = new FileInputStream(f)
            3. 使用最多的一种形式
                1. 创建一个文件对象
                    FileInputStream f = new FileInputStream("文件路径");
                2. 创建一个读取文件的对象
                    InputStreamFile reader = new InputStreamFile(f, "utf-8");
                3. 创建一个StringBuffer对象将读取到的数据都加到这个对象里面
                    StringBuffer sb = new StringBuffer();
                4. 循环将文件里面的数据加入到StringBuffer对象里面去
                    while (reader.ready()){
                        sb.append((char) reader.read())
                    }
                5. 返回得到的对象
                    return sb
        2. inputSteam对象的相关方法
            1. public int read(int r)throws IOException{}:这个方法从InputStream对象读取指定字节的数据.返回为整数值.返回下一字节数据,
               如果已经到结尾则返回-1.
            2. public int read(byte[] r) throws IOException{}:这个方法从输入流读取r.length长度的字节.返回读取的字节数.
               如果是文件结尾则返回-1.
            3. public int available() throws IOException{}:返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取的字节数.
               返回一个整数值.
            4. protected void finalize()throws IOException{}: 这个方法清除与该文件的连接.确保在不再引用文件输入流时调用其close方法.
            5. public void close() throws IOException{}:关闭此文件输入流并释放与此流有关的所有系统资源
    2. 文件写入
        1. 创建文件写入的对象
            1. 使用字符串类型的对象创建一个输出流的对象用来写入数据
                OutputStream f = new FileOutputStream("文件路径")
            2. 使用文件对象来创建一个输出流对象用来写入数据
                File f = new File("文件路径")
                InputStream out = new FileInputStream(f)
            3.
        2. OutputStream对象的相关方法
            1. public void write(int w)throws IOException{}: 这个方法把指定的字节写到输出流中
            2. public void write(byte[] w): 把指定数组中w.length长度的字节写到OutputStream中
            3. protected void finalize()throws IOException{}: 这个方法清除与该文件的连接,确保在不再引用文件输入流时调用其close方法
            4. public void close() throws IOException{}: 关闭此文件输入流并释放与此流有关的所有系统资源

 */
public class javaFileStream4 {
    public static void main(String[] args) throws IOException{
        // 控制台流的学习测试
//        studyConsoleStream();
        // 文件读取的如何完成
//        System.out.println(studyFileStreamRead());
        // 文件写入如何完成
        studyFileStreamWrite();
    }

    public static void studyConsoleStream() throws IOException {
        char c;
        String str;
        // 创建一个BufferReader对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 调用read()方法来从标准输入中读取单个字符
        do{
            c = (char) br.read();
            System.out.println(c);
        }while (c != 'q');

        // 调用readLine()方法来读取字符串
        while (true){
            str = br.readLine();
            if (str.equals("end")){
                break;
            }
            System.out.println(str);
        }
    }

    public static StringBuffer studyFileStreamRead() throws IOException{
        /*
        // 以字符串类型的对象常见一个文件输入流, 不建议使用这种方式, 因为会出现乱码的情况
        InputStream reader = new FileInputStream("src/com/javaOthers4/testRead.txt");
        int size = reader.available();
        for (int i=0; i<size; i++){
            if (i < size -1){
                System.out.printf("%s ", (char) reader.read());
            }
            System.out.println((char) reader.read());
        }
        */
        /*
        // 使用创建文件对象的方式来读取文件内容, 这种方式也不建议
        File f = new File("src/com/javaOthers4/testRead.txt");
        InputStream reader = new FileInputStream(f);
        int size = reader.available();
        for (int i=0; i<size; i++){
            System.out.println((char) reader.read());
        }
         */

        // 最常用的一种方式
        // 1. 创建一个文件对象
        FileInputStream f = new FileInputStream("src/com/javaOthers4/testRead.txt");
        // 2. 创建一个输入流读取对象
        InputStreamReader reader = new InputStreamReader(f, StandardCharsets.UTF_8);

        // 创建一个StringBuffer
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            // 将读取到的数据转换成char类型, 然后再加入到StringBuffer对象中
            sb.append((char) reader.read());
        }
        // 关闭读取流, 释放内存资源
        reader.close();
        // 关闭输入流, 释放资源
        f.close();
        // 读取得到的StringBuffer对象
        return sb;
    }

    public static void studyFileStreamWrite() throws IOException{
        // 我们采用最常见的一种形式

        // 创建一个文件写入对象
        FileOutputStream f = new FileOutputStream("src/com/javaOthers4/testWriter.txt");
        // 创建一个文件输出流对象
        OutputStreamWriter writer = new OutputStreamWriter(f, StandardCharsets.UTF_8);
        // 写入对象
        writer.append("这是一个文件写入的测试\n");
        writer.append("已经写入成功可以开始测试了");
        // 关闭写入流,释放资源
        writer.close();
        // 关闭输出流释放资源
        f.close();
    }
}


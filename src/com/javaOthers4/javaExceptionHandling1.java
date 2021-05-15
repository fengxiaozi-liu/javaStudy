package com.javaOthers4;

import java.rmi.RemoteException;

/*
java异常处理
1. java异常发生的原因有
    1. 用户输入了非法数据
    2. 要打开的文件不存在
    3. 网络通信连接中断, 或者JVM内存溢出
2. java三种类型异常
    1. 检查性异常: 最具代表性异常是用户错误或问题引起的异常, 这是程序员无法预见的.例如, 如果要打开一个不存在的文件时, 一个异常就发生了, 这些异常
       不能被简单的忽略
    2. 运行时异常: 运行时异常最可能被程序员避免的异常. 与检查性异常相反, 运行时异常可以在编译时被忽略
    3. 错误: 错误不是异常, 而是脱离程序员控制的问题. 错误在代码中通常被忽略. 例如当栈异常时,一个错误就发生了, 他们在编译时也检查不到
3. 异常类
    - Throwable: 所有异常和错误的父类
        1. Exception: 是Throwable类的子类
            1. IOException: io异常
                1. FileNotFoundException: 文件未找到的异常
            2. RuntimeException: 运行时间异常
                1. NullPointerException: 空指针异常
        2. Error: 是错误的类
            1. OutOfMemoryError: 内存溢出错误
            2. IOError: IO错误
4. 捕获异常
    1. 描述
        使用try...catch...关键字来捕获异常, try...catch...代码块中的代码称为保护代码
        2. finally关键字用来创建在try代码块后面执行的代码块, 无论异常是否发生这段代码都会执行
    2. 格式
        try{
            // 程序代码
        }catch(ExceptionName e1){
            //Catch 块
        }catch(异常类型3 异常的变量名3){
            // 程序代码
        }finally{
            // 程序代码
        }
5. 异常方法
    1. public String getMessage(): 返回发生异常的详细信息, 这个消息在Throwable类的构造函数中初始化了
    2. public Throwable getCause(): 返回一个Throwable对象代表异常原因
    3. public String toString(): 使用getMessage的结果返回类的串级名字
    4. public void printStackTrace(): 打印toString()结果和栈层次到System.err, 即错误输出流
6. throws/throw关键字
    1. 如果一个方法没有捕获到一个检查性异常, 那么该方法必须使用throws关键字来声明
    2. throws关键字放在方法签名的尾部.
    3. 也可以使用throw关键字抛出一个异常, 无论是新实例化的还是刚捕获到的
 */
public class javaExceptionHandling1 {
    public static void main(String[] args) throws RemoteException {
        studyException();
        studyThrows();
    }

    //try...catch...捕获异常
    public static void studyException(){
        try {
            int[] a = new int[2];
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    // throws/throw关键字抛出异常
    public static void studyThrows() throws RemoteException {
        throw new RemoteException();
    }
}

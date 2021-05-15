package com.javaOthers4;

import java.util.Scanner;

/*
java中与用户的交互使用java Scanner类
1. 基本语法
    1. Scanner s = new Scanner(System.in)
2. Scanner类中的方法
    1. next()
        1. 一定要读取到有效字符后才会结束输出
        2. 对输入有效字符之前遇到空白, next()方法会自动将其去掉
        3. 只有输入有效字符后才将其后面输入的空白作为分隔符或结束符
        4. next()不能得到带有空格的字符串
    2. nextLine()方法
        1. 以Enter为结束符, 也就是说nextLine()方法返回的是输入回车之前的所有字符
        2. 可以获得空白字符
 */
public class javaUserinput3 {
    public static void main(String[] args) {
        // 使用nextLine的形式接收输入的值
//        studynextLine();

        // 使用next的方式来接收用户输入
        studynext();

    }

    public static void studynextLine() {
        Scanner scan = new Scanner(System.in);
        System.out.println("nextLine的形式进行接收");
        if (scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println(str);
        }
        scan.close();
    }

    public static void studynext() {
        Scanner scan = new Scanner(System.in);
        System.out.println("以next的方式接收");
        if (scan.hasNext()) {
            String str = scan.next();
            System.out.println(str);
        }
        scan.close();
    }
}

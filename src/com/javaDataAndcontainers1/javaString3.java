package com.javaDataAndcontainers1;

import java.util.Arrays;

/**
1. 字符串中的相关方法
    1. obj.length():返回字符串的长度
    2. obj.concat(string2):拼接两个字符串,一般用+
    3. 格式化字符串
       1. 使用printf
       2. string.format()方法
    4. string.charAt(int index) 返回指定索引的值
    5. string.split(String regex):给定正则表达是来拆分字符串
    6. string.replace(char a, char b):字符串的替换
    7. string.replaceAll(String regex, String regex):进行正则替换

 */
public class javaString3 {
    public static void main(String[] args) {
        String str1 = "hello world, I am jack";

        // 查看字符串的长度
        int x = str1.length();
        System.out.println(x);

        // 字符串的分割
        String[] str_list  = str1.split(", ");
        // 将列表转换成字符串可以观看的样式
        System.out.println(Arrays.toString(str_list));
        // 取出分割后的第一数据
        String st2 = str_list[0];
        System.out.println(st2);

        // 字符串的替换
        String str3 = str1.replace("h", "x");
        System.out.println("str3="+str3);
        System.out.println("str1="+str1);

        //返回字符串的索引
        int current_index = str1.indexOf("w");
        System.out.println("当前索引是"+current_index);
    }
}

package com.javaDataAndcontainers1;

/**
java中数据类型
1. 内置数据类型
    1. byte
    2. short
    3. int
    4. long
    5. float
    6. double
    7. boolean
    8. char
2. 引用数据类型
    1. 对象和数组都是引用数据类型
    2. 所有引用类相关的默认值是null
    3. 一个引用变量可以用来引用任何与之兼容的类型
3. 自动类型转换
    低  ------------------------------------>  高
    byte,short,char—> int —> long—> float —> double
    1. 类型的转换必须满足如下规则
        1. 不能对boolean类型进行类型转换
        2. 不能把对象类型转换不相关类的对象
        3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换
        4. 转换过程中可能导致一处或损失精度
    2. 自动类型转换
        1. 必须满足转换前的数据类型的位数要低于转换后的数据类型，
           例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，
           同样float数据类型的位数为32，可以自动转换为64位的double类型。
    3. 强制类型转换
        1. 条件是转换的数据类型必须是兼容的。
        2. 格式：(type)value type是要强制类型转换后的数据类型 实例：

 */

public class javaDataType1 {
    public static void DataConversion(){
        // 类型转换
        int i = 128;
        byte b = (byte) i;
        System.out.println(b);

        // 将浮点数据转换成int类型
        int x = (int) 23.7;
        System.out.println(x);

        // 字符串转化成int类型
        String str_num = "22";
        int num = Integer.parseInt(str_num);
        int number = 26;
        String str_number = String.valueOf(number);
        System.out.println("字符串转换成int类型数据"+num);
        System.out.println("int类型转换成字符串"+str_number);
    }

    public static void main(String[] args) {
        DataConversion();
    }
}

package com.javaBaseFunction2;
/**
方法
1. 描述
    1. java方法是语句的集合, 他们在一起执行一个功能
    2. 方法是解决一类问题的步骤的有序组合
    3. 方法包含在类或者对象中
    4. 方法在程序中被创建, 在其他地方被引用
2. 命名规则
    1. 方法的名字的第一个单词应以小写字母作为开头,后面的单词则用大写字母开头写,不使用连接符.例如：addPerson。
    2. 下划线可能出现在JUnit测试方法名称中用以分隔名称的逻辑组件.一个典型的模式是:test<MethodUnderTest>_<state>,
       例如 testPop_emptyStack.
3. 方法的定义
    1. 描述
        1. 方法包含一个方法头和一个方法体
        2. 方法的所有组成部分有
            1. 修饰符：修饰符,这是可选的,告诉编译器如何调用该方法.定义了该方法的访问类型.
            2. 返回值类型:方法可能会返回值.returnValueType是方法返回值的数据类型.有些方法执行所需的操作,但没有返回值.
               在这种情况下，returnValueType 是关键字void。
            3. 方法名：是方法的实际名称.方法名和参数表共同构成方法签名.
            4. 参数类型:参数像是一个占位符.当方法被调用时,传递值给参数.这个值被称为实参或变量.参数列表是指方法的参数类型、顺序
               和参数的个数.参数是可选的,方法可以不包含任何参数。
            5. 方法体：方法体包含具体的语句，定义该方法的功能。
    2. 格式
        修饰符 返回值类型 方法名(参数类型 参数名){
            ...
            方法体
            ...
            return 返回值;
        }
 4. 方法的调用
    1. 描述
        1. java支持两种调用方法的方式, 根据方法是否返回值来选择
        2. 当程序调用一个方法时, 程序的控制权交给被调用的方法.当被调用方法返回语句执行或者到达方法闭括号时候交还控制权给程序
        3. 当方法返回一个值的时候,方法调用通常当做一个值
        4. 方法的返回值是void, 方法的调用一定是一条语句

 */
public class javaFunctions3 {
    public static void main(String[] args) {
        // 调用方法
        int result = max(3, 4);
        // 没有返回值的方法,方法调用是一个语句
        System.out.println(result);
    }

    // 学习一个方法
    /* 返回两个整型变量数据的较大值 */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}

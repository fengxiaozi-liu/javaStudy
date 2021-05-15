package com.javaClassAndObject3;
/**
java中的封装
1. 概念
    1. 在面向对象程式设计方法中,封装(Encapsulation)是指一种将抽象性函式接口的实现细节部分包装,隐藏起来的方法
    2. 封装可以被认为是一个保护屏障,防止类的代码和数据被外部类定义的代码随机访问
    3. 要访问该类的代码和数据,必须通过严格的接口控制
    4. 封装最主要的功能在于我们能修改自己的实现代码, 而不用修改那些调用我们代码的程序片段
    5. 适当的封装可以让程式码更容易理解与维护, 也加强了程式码的安全性
2. 实现java封装的步骤
    1. 修改属性的可见性限制对属性的访问(一般限制为private)
    2. 对每个值提供对外的公共方法访问,也就是创建一对赋值方法, 用于对私有属性的访问
    3. 使用public来修饰访问私有变量的方法, 这些访问或者设置私有变量的方法, 被称为getter和setter方法
 */
public class javaClassEncapsulation2 {
    public static void main(String[] args) {
        EncapTest et = new EncapTest();
        // 设置age的值
        et.setAge(18);
        System.out.println(et.getAge());

        // 设置name的值
        et.setName("伍六七");
        System.out.println(et.getName());
    }
}

// 创建一个类里面设置私有变量
class EncapTest{
    private String name;
    private int age;

    // 设置age的getter方法和setter
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    // 设置name的getter和setter方法
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}

package com.javaClassAndObject3;
/**
java包
1. 包的作用
    1. 把功能相似或相关的类或者接口组织在同一个包中, 方便类的查找和使用
    2. 如同文件夹一样, 包也采用了树型目录的存储方法.同一个包中类的名字是不同的, 不同包中类的名字是可以相同的, 当同时调用两个包中相同类名
       的类时, 应该加上包名加以区分
    3. java.lang是打包的基础类, java.io是包含输入输出功能的函数
2. 包语句的语法格式
    1. package pkg1.pkg2.pkg3: 给包进行命名
    2. import pkg1.pkg2.pkg3: 导入包
3. 类放在包中会有两个主要的结果:
    1. 包名称为类名的一部分
    2. 包名必须与响应的字节码所在的目录接口相吻合
4. 根据包对java进行编译和运行
    1. 编译
        javac -d . .java文件所在路径: 这时会生成一个.class文件
    2. 运行
        java 生成的.class文件
 */
public class javaPackage6 {
}

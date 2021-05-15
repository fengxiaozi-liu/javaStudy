package com.javaClassAndObject3;
/**
java接口
1. 描述
    1. 接口在java中是一个抽象类型,抽象方法的集合,接口通常以interface来声明.一个类通过继承接口的方式,从而来继承接口的抽象方法
    2. 接口并不是类, 编写接口的方式和类方式, 但是它们属于不同的概念.类描述对象的属性和方法, 接口则包含类要实现的方法
    3. 除非实现接口的类是抽象类, 否则该类要定义接口中的所有方法
    4. 一个实现接口的非抽象类要实现接口的所有方法
2. 接口特性
    1. 接口也有多个方法,但是接口不能用于实例化对象
    2. 接口没有构造方法, 接口的所有方法都是抽象方法, 接口的方法不能在接口中实现, 只能由实现接口的类实现接口中的方法
    3. 接口不能包含成员变量, 除了static和final变量
    4. 接口支持多继承
    5. 接口的每一个方法也是隐式抽象的,接口的方法会被隐式的指定为public abstract
    6. 接口可以含有变量, 但是接口的变量会被隐式指定为public static final变量
3. 接口和抽象类的区别
    1. 抽象类的方法可以有方法体, 就是实现方法的具体功能, 但是接口的方法不行
    2. 抽象类的成员变量可以是各种类型的, 而接口的成员变量只能是public static final
    3. 接口中不能含有静态代码块以及静态方法, 而抽象类中可以有静态代码块和静态方法
    4. 一个类只能继承一个抽象类, 而一个类
4. 接口的声明
    1. 格式
        [可见度] interface 接口名称 [extends 其他的接口名] {
            // 声明变量
            // 抽象方法
        }
 */
public class javaInterface5 {
    public static void main(String[] args) {
        // 根据类创建一个实例对象
        SportClass sc = new SportClass();
        sc.run();
        sc.run(100);
        sc.swing();
    }
}

// 创建一个接口
interface Sports{
    public void run();
    // 接口中实现方法的重载
    public void run(int number);

    // 实现一个有返回值类型的接口方法
    public int swing();
}

// 创建一个接口的实现类
// 类要实现接口中的所有方法
class SportClass implements Sports{
    public void run(){
        System.out.println("跑步运动");
    }

    // 在类中实现接口的方法,要有相同的返回值类型和参数
    public void run(int number){
        System.out.println("跑步"+number+"米");
    }

    public int swing(){
        return 100;
    }

}

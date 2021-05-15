package com.javaClassAndObject3;
/**
类的继承
1. 继承的概念
    1. 继承是java面向对象变成技术的一块基石,因为它允许创建分等级层次的类
    2. 继承就是自雷继承父类的行为和属性,使得子类对象具有父类的实例域和方法, 或子类从父类继承方法,使得子烈具有父类相同的行为
2. 类继承的格式
    class 父类 {
    }

    class 子类 extends 父类 {
    }
3. 类继承的类型
    1. 单继承: B继承A
    2. 多重继承: C继承B, B继承A
    3. 不同类继承同一个类: C继承A, B继承A
    4. java不能够进行多继承
4. 继承的特性
    1. 子类拥有父类非private的属性,方法
    2. 子类可以拥有自己的属性和方法,即子类可以对父类进行扩展
    3. 子类可以用自己的方式实现父类的方法
    4. java的继承是单继承,可以多重继承, 但是不能够多继承
    5. 继承提高了类的耦合性
5. 继承的关键字
    1. extends
        1. extends用来继承父类
        2. 形式
            class A extends B
    2. implements
        1. implements是用来继承接口的,使用了implement可以多继承接口
        2. 形式
            class A implements interfaceA, interfaceB
6. super与this关键字
    1. super关键字: super关键字实现对父类成员的访问,用来引用当前对象的父类
    2. this关键字: this关键字是表示当前类
7. 构造器
    1. 当一个对象被创建的时候,构造方法用来初始化该对象
    2. 构造器不能有返回值即使是void也是不允许的, 构造器方法的名称必须和当前类的名称一样
    3. 不管你是否定义了构造方法, 所有类都有构造方法, 因为java提供了一个默认的构造方法,但是当你定义了一个自己的构造方法, 那么默认的构造方法就会失效
    4. 默认构造方法的访问修饰符合类的访问修饰符相同
    5. 子类是不继承父类的构造器(构造方法或者构造函数的), 它只是调用(隐式或显式).
    6. 如果父类的构造器带有参数,则必须在子类的构造器中显式的通过super关键字来调用父类的构造器并配以适当的参数列表
    7. 如果父类的构造器没有参数, 则子类的构造器不需要使用super关键字调用父类的构造器,系统会自动调用父类的无参构造器
 */
public class javaClassInherit1 {
    public static void main(String[] args) {
        // 创建一个无参的对象
        Dog d = new Dog();
        d.name = "小强";
        // 调用父类中eat方法
        String food = d.eat("排骨");
        System.out.println(d.name+"爱吃"+food);

        // 创建一个有参的对象
        Dog d2 = new Dog("小花", 1, "女");
        // 调用子类中的eat()方法
        d2.eat();
        // 调用lookMessage方法
        d2.lookMessage();

    }
}
// 定义一个父类
class Animal{
    // 定义一个无参的构造方法
    String type = "这是一个动物";
    String  name;
    int age;

    // 定义一个无参的构造器
    Animal(){
        System.out.println(this.type);
    }

    // 定义一个有参的构造器
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 定义一个方法
    public String eat(String food){
        return food;
    }

    // 定义一个相似的方法
    public void eat(){
        String food = eat("饲料");
        System.out.println("动物吃"+food);
    }
}

class Dog extends Animal{

    // 调用父类的成员方法
    String food = super.eat("骨头");

    // 定义一个新的变量
    String gender;

    // 重写父类的方法
    public void eat(){
        System.out.println(this.name+"爱吃"+this.food);
    }

    // 自动调用父类的无参构造器
    Dog(){
        System.out.println("自动继承父类的无参构造器");
    }

    public Dog(String name, int age, String gender){
        // 调用父类的有参构造器
        super(name, age);
        this.gender = gender;
    }

    public void lookMessage(){
        System.out.format("小狗的名字是%s, 年龄是%s岁, 性别是%s", this.name, this.age, this.gender);
    }

}


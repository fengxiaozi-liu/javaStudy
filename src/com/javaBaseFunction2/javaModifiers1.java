package com.javaBaseFunction2;
/**
1. java修饰符描述
    1. java提供了很多修饰符,包括访问修饰符与非访问修饰符
    2. 修饰符用来定义类、方法或者变量, 通常放在语句的最前端
2. java的访问修饰符
    1. 描述
        1. java中可以使用访问控制符来保护类、变量、方法和构造方法的访问
    2. 权限访问修饰符
        1. default(默认,什么也不写): 在同一个包中可见, 不使用任何修饰符.使用对象: 类, 接口， 变量， 方法
            1. 使用默认访问修饰符声明的变量和方法, 对同一个包内的类是可见的.
            2. 接口的变量都隐式声明为public static final,而接口里的方法默认情况下访问权限为public
        2. public: 对所有类可见. 使用对象: 类, 接口, 变量, 方法
            1. public声明的类, 方法, 构造方法和接口能够别其他类访问
            2. 如果public类不在同一个包中,则需要导入相应的public类所在的包。
            3. 类所有的共有方法和变量都能够被子类继承
            4. 父类声明为public的方法, 子类必须声明为public
        3. protected: 对同一包内的类和所有子类可见. 使用对象: 变量, 方法. 不能够修饰类(外部类)
            1. 接口不能够用protected来修饰
            2. protected可以修饰变量和方法, 不能够修饰类
            3. 子类和基类在同一个包的中: 被声明为protected的变量, 方法和构造器能被同一个保重的任何其他类访问
            4. 子类和基类不在同一包中: 创建子类实例之后, 子类实例可以访问从基类继承而来的protected方法
            5. 父类声明为protected的方法, 子类可以声明为protected或者是public方法
        4. private:
            1. 在同一类内可见. 使用对象: 变量, 方法。 不能够修饰类(外部类)
            2. private修饰的变量,方法和构造方法只能被所属类访问, 并且接口和类不能声明为private
            3. 声明为私有访问类型的变量只能够通过类中的公共的getter方法被外部类访问
            4. 父类声明为private的方法不能被继承
2. 非访问修饰符
    1. 描述
        1. java为了实现一些其他的功能, 也提供了非访问修饰符
    2. 非访问修饰符
        1. static修饰符
            1. static可以用来声明变量和方法
            2. static关键字用来声明独立于对象的静态变量, 无论实例化多少对象, 它的静态变量只有一份拷贝.
            3. 静态变量也叫做类变量
            4. static关键字也用来声明独立于对象的静态方法.静态方法不能使用类的非静态变量和方法,但是可以通过实例化之后再访问
        2. final修饰符
            1. final可以用来声明变量,方法与类
            2. final修饰符,意思是最后的意思, 一旦被赋值后, 就不能够重新赋值, final修饰的实例变量必须显示指定的初始值
            3. final修饰符通常和static修饰符一起用来创建常量
            4. 父类中的final方法可以被子列继承, 但是不能够被子类重写
            5. 声明为final方法的主要目的是防止该方法和内容被修改
            6. final类不能够被继承, 没有类能够继承final类的任何特性
        3. abstract修饰符
            1. abstract可以修饰类和方法, 被abstract修饰的类称为抽象类, 被abstract修饰的方法称为抽象方法
            2. 抽象类不能够用来实例化对象, 声明抽象类的唯一目的是为了将来对该类进行扩展
            3. 一个类不能同时被abstract和final修饰
            4. 如果一个类中包含抽象方法,那么一定把这个类声明为抽象方法, 抽象类中可以包含抽象方法和非抽象方法
            -----------------------------------------------------------------------------
            1. 抽象方法是一种没有任何实现的方法,该方法的实现由子类提供
            2. 抽象方法不能够被声明为final和static
            3. 任何继承抽象类的子类必须实现父类所有的抽象方法,除非该子类也是抽象方法
            4. 抽象方法的声明以分号结尾, 如: public abstract sample();
        4. transient修饰符
            1. transient修饰符用来修饰变量
            2. 序列化的对象包含被transient修饰的实例变量, java虚拟机(jvm)跳过该特定的变量
            3. 该修饰符包含在定义变量的语句,用来做预处理类和变量类型的判断
        5. volatile修饰符
            1. volatile修饰符用来修饰变量
            2. volatile修饰的成员变量在每次被线程访问的时,都强制从共享内存中重新读取该成员变量的值。
               当成员变量发生变化时,会强制线程将变化值回写到共享内存中,这样在任何时刻,两个不同的线程看到的都是看到成员变量的一个值
            3. 一个volatile对象的引用可能是null
        6. synchronize修饰符
            1. synchronized用来修饰方法
            1. synchronized关键字声明的方法同一时间只能被一个现场访问
 */

public class javaModifiers1 {

    public String testPublic = "我是Public变量";
    private String testPrivate = "我是Private变量";
    protected String testProtected = "我是Protected变量";
    public static void main(String[] args) {
        // default修饰符修饰变量
        int a = 1;
        // public不能够修饰变量
        // protected不能够修饰变量

        // 创建一个对象用来访问非静态方法
        javaModifiers1 jm = new javaModifiers1();
        jm.testPublic();
        jm.testProtected();
        jm.testPrivate();
    }
    // default修饰符修饰方法
    static void add(int a, int b){
        System.out.println(a+b);
    }

    // public修饰方法
    public void testPublic(){
        System.out.println(this.testPublic);
    }

    public void testPrivate(){
        System.out.println(this.testPrivate);
    }

    public void testProtected(){
        System.out.println(this.testProtected);
    }

}

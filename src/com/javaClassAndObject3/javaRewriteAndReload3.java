package com.javaClassAndObject3;
/**
重写
    1. 描述
        1. 重写是子类对父类的允许访问的方法的实现过程进行编写, 返回值和形参都不能改变. 即外壳不变, 核心重写
        2. 重写的好处在于子类可以根据需要,定义特定于自己的行为. 也就是说子类能够根据需要实现父类的方法
        3. 重写的方法不能抛出新的检查异常,或者比重写方法声明更为宽泛的异常
        4. 在面向对对象里,重写意味着重写任何现有的方法
    2. 方法重写的规则
        1. 参数列表与被重写方法的参数列表必须相同
        2. 返回类型与被重写方法的返回类型可以不相同,但是必须是父类返回值的的派生类
        3. 访问权限不能比父类中被重写的方法的访问权限更低.如果一个父类的方法被声明为public, 那么子类中重写该方法就不能声明protected
        4. 父类的成员方法只能被它的子类重写
        5. 声明为final的方法不能重写
        6. 声明为static的方法不能重写,但是能够被再次声明
        7. 子类和父类在同一个包内,那么子类可以重写父类的所有方法,除了private和final方法
        8. 子类和父类不在同一个包内, 子类只能够重写父类声明的public和protected方法
        9. 构造方法不能被重写
        10. 重写的方法能够抛出任何非强制异常,无论被重写的方法是否抛出异常.但是,重写的方法不能抛出新的强制性异常,
            或者比被重写方法声明的更广泛的强制性异常,反之则可以.
2. 重载
    1. 描述
        1. 重载是方法的重载
        2. 重载是在一个类里面, 方法名字相同, 返回类型不同或者是参数不同
        3. 每个重载的方法(或者构造方法)都必须有一个独一无二的参数类型的列表, 最常用的重载就是构造器的重载
    2. 重载的规则
        1. 别重载的方法必须改变参数列表(参数个数或者是类型不同)
        2. 被重载的方法可以改变返回类型
        3. 被重载的方法可以声明新的或者是更加广泛的检查异常
        4. 方法能够在同一个类或者一个子类中被重载
        5. 不能以返回值类型作为重载函数的的区分
 */
public class javaRewriteAndReload3 {
    public static void main(String[] args) {
        // 实例化一个ChinesePeople对象
        ChinesePeople cp = new ChinesePeople();
        // 调用重写的eat()方法
        System.out.println(cp.eat("饺子"));
        // 调用重写的move()方法
        cp.move();

        // 创建一个学习重载的实例对象
        StudyOverloading so = new StudyOverloading();
        // 调用一个参数的eat方法
        System.out.println(so.eat("馒头"));
        //调用两个参数的eat方法
        System.out.println(so.eat("馒头", 3));
    }
}

// 创建爱一个父类
class People{

    // 方法1
    public void move(){
        System.out.println("人可以走");
    }

    // 方法2
    public String eat(String food){
        return "人吃"+food;
    }
}

class ChinesePeople extends People{
    // 继承父类中到move()方法
    // 1. 在同一个包内,子类可以重写父类的所有方法, 除了private和final方法
    // 2. 不在同一个包内, 子类可以重写父类的public和protected方法
    public void move(){
        System.out.println("中国人喜欢多走走路");
    }

    // 重写父类中的eat方法
    // 1. 重写父类的方法时, 参数的个数必须和父类参数的个数相同,不然不能够称为重写
    // 2. 返回值必须是父类的派生类
    public String eat(String food){
        return "中国人喜欢吃" + food;
    }
}

class StudyOverloading{
    //定义一个方法
    public String eat(String food){
        return "吃了" + food;
    }

    // 重载这个方法
    public String eat(String food, int number){
        return "吃了" + number + "个" + food;
    }
}

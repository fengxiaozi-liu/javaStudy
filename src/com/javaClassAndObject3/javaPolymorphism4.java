package com.javaClassAndObject3;
/**
java多态
1. 描述
    1. 多态是同一个行为具有多个不同表现形式或者形态的能够
    2. 多态就是同一个接口,使用不同的实例而执行不同的操作
    3. 多态是对象多种表现形式的体现, 同一个事件发生在不同的对象上会产生不同的结果
        现实中,比如我们按下F1键这个动作
        如果当前在Flash界面下弹出的就是AS3的帮助文档；
        如果当前在Word下弹出的就是Word帮助
        在Windows下弹出的就是 Windows 帮助和支持.
2. java多态存在的三个必要条件
    1. 继承
    2. 重写
    3. 父类引用指向子类的对象
3. java多态的调用方式
    1. 当使用多态调用方法时,首先检查父类中是否有该方法, 如果没有, 则编译错误, 如果有,则去调用子类同名的方法
4. java多态的目的
    1. 可以使程序有良好的扩展,并可以对所有类的对象进行通用处理
 */
public class javaPolymorphism4 {
    public static void main(String[] args) {
        // 向上转型, 生成PetDog对象向上转为Pet对象
        Pets p = new PetDog();
        // 调用狗的eat方法
        p.eat();
        // 向下转型创建实例, p对象转为PetDog的具体对象
        PetDog p1 = (PetDog) p;
        // 调用狗的work方法, 这样即使父类中没有依然可以调用子类中特有的方法不会报错
        p1.work();

        System.out.println("用PetDog类调用show方法");
        show(new PetDog());
        System.out.println("用PetCat类调用show方法");
        show(new PetCat());
    }

    public static void show(Pets p){
        // 因为父类中有这个方法,因此继承父类的子类可以直接调用
        p.eat();
        if(p instanceof PetDog){
            // 向下转型为dog类
            PetDog pd = (PetDog) p;
            pd.work();
        }else if(p instanceof PetCat){
            // 向下转型为PetCat类
            PetCat pc = (PetCat) p;
            pc.work();
        }
    }
}

//定义一个宠物类
class Pets{
    public void eat(){
        System.out.println("宠物吃东西");
    }
}

// 定义一个子类继承自宠物类,并重写父类的方法
class PetDog extends Pets{
    // 必须实现抽象类的所有方法
    public void eat(){
        System.out.println("宠物狗喜欢吃骨头");
    }

    public void work(){
        System.out.println("宠物狗的工作是汪汪叫");
    }
}

// 定义一个宠物猫类继承自宠物类,并重写父类的方法
class PetCat extends Pets{
    public void eat(){
        System.out.println("宠物猫喜欢吃鱼");
    }

    public void work(){
        System.out.println("宠物猫的工作是卖萌");
    }
}

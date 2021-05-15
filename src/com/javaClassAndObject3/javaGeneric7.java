package com.javaClassAndObject3;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
java泛型
1. 描述
    1. 泛型提供了编译时类型安全检测机制, 该机制允许程序员在编译时检测到非法类型
    2. 泛型的本质是参数化类型, 也就是说操作的数据类型被指定为一个参数
    3. 作用
        既是限定又是解放参数的传递类型
2. 泛型类
    1. 泛型类的声明和非泛型类的声明类似,除了在类后面添加了类型参数声明部分
    2. 泛型类的类型参数声明部分也包含一个或多个类型参数, 参数之间用逗号隔开
    3. 一个泛型参数也称为一个类型变量, 是用于指定一个泛型类型名称的标识符. 以为他们接受一个或多个参数, 这些类被称为参数化的类或参数化的类型

3. 泛型方法
    1. 描述
        1. 你可以写一个泛型方法, 该方法在被调用时可以接受不同类型的参数. 根据传递给泛型方法的参数类型, 编译器适当的处理每一个方法的调用
    2. 泛型方法定义规则
        1. 所有泛型方法声明都有一个类型参数声明部分(用尖括号),该类型参数声明部分在方法返回类型之前, 一般是以<E>的形式出现
        2. 每一个类型参数舍命包含一个或多个类型参数, 参数间用逗号隔开.
        3. 一个泛型参数, 也被称为一个类型变量, 用于指定一个泛型类型的数据
        4. 类型参数能被用来声明返回值类型, 并且能作为泛型方法得到的实际参数类型的占位符
        5. 泛型方法的声明和其他方法一样.
        6. 类型参数只能代表引用类型不能是原始类型
4. 有界类型参数
    1. 有界类型参数限制那些允许传递到一个类型参数的类型种类范围.例如, 一个操作数字的方法可能只希望接受Number或者Number子类的实例, 这时候就可以
       使用有界类型参数
    2. 要声明有界类型参数, 首先列出类型参数的名称, 后跟上extends, 最后紧跟它的上界
5. 通配符
    1. 类型通配符一般是使用?代替具体的类型参数
       例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类
    2. 统配符一般和泛型类配置一起使用
 */
public class javaGeneric7 {
    public static void main(String[] args) {

        // 实例化一个泛型类
        StudyGenericClass<String> sgc = new StudyGenericClass<>();
        sgc.add("这是泛型类里面的变量");
        System.out.println(sgc.get());


        // 创建一个整型数组
        Integer[] number_array = {1, 3, 4, 5, 8, 6};
        // 创建一个char类型的数组
        Character[] charArray = {'h','e', 'l', 'l', 'o' };

        // 实例化一个带有泛型方法的类
        StudyGenericMethod sgm = new StudyGenericMethod();
        // 调用printArray方法
        sgm.printArray(number_array);
        sgm.printArray(charArray);

        // 调用通配符方法
        sgm.studyWildcard();
    }
}

// 创建一个泛型类
class StudyGenericClass<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

class StudyGenericMethod{
    // 定义一个泛型方法<E>
    // 泛型方法也可以用访问修饰符或者非访问修饰符修饰
    public <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // 有界类型参数
    // 限制传递参数的类型范围, 这里限定好传递参数的类型只能是T类型
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        // 假设x是初始最大值
        T max = x;
        if ( y.compareTo( max ) > 0 ){
            //y 更大
            max = y;
        }
        if ( z.compareTo( max ) > 0 ){
            // 现在 z 更大
            max = z;
        }
        return max; // 返回最大对象
    }

    // 定义一个含有通配符的参数？表示通配符？可以代表任何一种数据
    public void getData(List<?> data){
        System.out.println("data:" + data.get(0));
    }

    public void studyWildcard(){
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);
    }
}



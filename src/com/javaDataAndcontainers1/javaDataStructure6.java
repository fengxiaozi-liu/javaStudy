package com.javaDataAndcontainers1;

import java.util.Enumeration;
import java.util.Vector;
import java.util.*;

/**
1. java工具包提供了强大的数据结构.在java中的数据结构主要包括一下几种接口和类
    1. 枚举
        1. 描述
            1. 枚举接口虽然它本身不属于数据结构,但它在其他数据接口的范畴里应用很广.枚举接口定义了一种从数据结构中取出连续元素的方式
            2. 这种传统接口已被迭代器取代，虽然Enumeration 还未被遗弃，但在现代代码中已经被很少使用了.尽管如此，
               它还是使用在诸如Vector和Properties这些传统类所定义的方法中
        2. 枚举的相关方法
            1. boolean hasMoreElements(): 测试枚举是否包含更多元素
            2. Object nextElement(): 如果此枚举对象至少还有一个可提供的元素就会返回枚举元素的下一个对象
    2. 位集合
        1. 描述
            1. 位集合类实现了一组可以单独设置和清除的位和标识
            2. 一个Bitset类创建的一种特殊类型的数组来保存位值.Bitset中数组大小会随需要增加
            3. 位集合主要是设置True或者是False的值
        2. 位集合的方法
            1. BitSet(): 位集合有两个构造方法
            2.
    3. 向量
        1. 描述
            1. 向量类和传统数组非常相似,但是Vector的大小能够根据需要动态变化,它也可以通过索引访问对象的元素
            2. 向量主要用在事先不知道数组的大小,或者只是需要一个可以改变大小的数组情况
        2. 向量的方法
            1. Vector(): 四个构造方法
            2. void add(Object o)/void add(int index, object element):在向量中插入元素
            3. Object get(int index): 返回向量中指定元素的位置
            3. boolean addAll(Collection c)/boolean addAll(int index, Collection): 将Collection中的所有元素添加到向量中
            4. addElement(Object obj): 将指定的组件添加到向量的末尾,将其大小增加1
            5. int capacity(): 返回向量的当前容量
            6. void clear(): 从此向量中移除所有元素
            7. object clone(): 返回向量一个副本
            8. boolean contains(object elem): 判断向量中是否包含指定的元素
            9. boolean contains(Collection c): 判断向量包含指定的Collection中所有的元素
            10. void ensureCapacity(int minCapacity): 增加此向量的容量（如有必要），以确保其至少能够保存最小容量参数指定的组件数
    4. 栈
        1. 栈实现了一个后进先出(LIFO)的数据结构,你可以把栈理解为对象的垂直分布的栈,当你添加一个新元素时,就将新元素放在其他元素的顶部
           当你从栈中取出元素的时候,就可以从栈中取出一个元素
    5. 字典
        1. 字典类是一个抽象类,它定义了键映射到值得数据结构
    6. 哈希表
        1. Hashtable类提供了一种在用户定义键结构的基础上来组织数据的手段,哈希表的具体含义完全取决于哈希标的使用情景和它包含的数据
    7. 属性
        1. Properties继承于Hashtable.Properties类表示了一个持久的属性集,属性列表中的每一个键对应值都是一个字符串
 */
public class javaDataStructure6 {
    public static void main(String[] args) {
        // 枚举类型学习
        // studyEnumeration();
        studyVector();

    }

    public static void studyEnumeration(){
        // 声明一个枚举类型的对象
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("one");
        dayNames.add("two");
        dayNames.add("three");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }

    public static void studyBitSet(){
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for(int i=0; i<16; i++) {
            if((i%2) == 0) bits1.set(i);
            if((i%5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }

    public static void studyVector(){
        // 创建一个向量可以用下面的方式,一般情况下要指明向量的存储类型
        // Vector vector = new Vector()
        Vector<String> vector = new Vector<String>();

        // 查看此向量的初始大小与容量
        System.out.println("此向量的容量="+vector.capacity());

        // 在向量中增加元素
        vector.add("星期一");
        vector.add("星期2");
        vector.addElement("sss");
        // vector.add(1); 在没有指明类型的时候就可以用这个方法
        System.out.println("此向量的初始大小="+vector.size());

        // 获取向量中指定位置的元素
        String each_v = vector.get(1);
        System.out.println("索引为1是的元素为："+each_v);

        // 用枚举的方式来遍历向量中的元素
        Enumeration<String> enums = vector.elements();
        while (enums.hasMoreElements()){
            System.out.println(enums.nextElement());
        }
    }
}

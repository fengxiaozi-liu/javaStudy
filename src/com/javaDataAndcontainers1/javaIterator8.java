package com.javaDataAndcontainers1;
import com.sun.xml.internal.fastinfoset.stax.events.StAXEventReader;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

/*
迭代器
1. 描述
    1. java Iterator(迭代器)不是一个集合,它是一种访问集合的方法
    2. Iterator是java迭代器最贱的实现方式, ListIterator是Collection API中的接口, 它扩展了Iterator接口
    3. 导入Iterator：import java.util.Iterator
2. 迭代器的方法
    1. next(): 返回下一个元素, 并且更新迭代器的状态
    2. hasNext(): 用于检查集合中是否还有元素
    3. remove(): 将迭代器返回的元素删除
 */
public class javaIterator8 {
    public static void main(String[] args) {
        ArrayList<String> str_list = new ArrayList<>();
        str_list.add("one");
        str_list.add("two");
        str_list.add("three");
        str_list.add("four");
        str_list.add("five");

        // 根据str_list创建一个迭代器
        Iterator<String> a_str = str_list.iterator();

        while (a_str.hasNext()){
            System.out.println(a_str.next());
        }

        //使用foreach遍历ArrayList中的元素
        System.out.println("使用str_list的forEach来遍历元素");
        str_list.forEach(each->System.out.println(each));

        // 创建一个整型列表
        ArrayList<Integer> number_list = new ArrayList<>();
        number_list.add(1);
        number_list.add(2);
        number_list.add(9);
        number_list.add(7);
        number_list.add(11);
        Iterator<Integer> num_iterator = number_list.iterator();
        while (num_iterator.hasNext()){
            // 如果当前元素大于10就移除它
            Integer i = num_iterator.next();
            if (i > 10) {
                num_iterator.remove();
            }
        }
        System.out.println(number_list);
    }
}

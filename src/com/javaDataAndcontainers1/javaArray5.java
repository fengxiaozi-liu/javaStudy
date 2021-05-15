package com.javaDataAndcontainers1;
// 导入操作数组的类

import java.util.Arrays;
/**
1. 描述
    1. 数组是Java语言提供的一种容器,存储固定大小的同类型元素
    2. 数组的元素类型和大小都是确定的
    3. 使用java.util.Arrays类能够方便的操作数组,它提供的方法都是静态的
2. 数组中的创建
    1. new dataType[arraySize]: 创建一个数组
    2. dataType[] arrayName = {arg1, arg2, ...} : 同样是创建一个数组更常用一些
    2. arrayName[index]: 访问数组元素
3. Arrays类的方法
    1. void fill(int[] a, int val): 给数组赋值
    2. void sort(object[] a): 按照升序的方式给数组排序
    3. boolean equal(long[] a, long[] b): 判断两个数组是否相等
    4. int binarySearch(Object[] a, Object key): 用二分查找算法在给定数组中搜索给定的对象, 二分查找之前数组必须是排序好的
    5. String toString(int[] a): 将数组转换成字符串的形式查看
    6. asList(Object a): 将数组转换成列表元素
 */
public class javaArray5 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] number_array1 = new int[10];
        // 创建一个数组
        int[] number_array = {1, 3, 5, 7, 4, 6, 8};
        System.out.println(Arrays.toString(number_array));
        // 创建一个字符串数组
        String[] str_array = {"hello", "world", "i am", "jack"};

        // 查看数组的长度
        System.out.println(number_array1.length);

        // 批量给数组赋值, 只能给int类型的数组赋值
        Arrays.fill(number_array1, 11);

        // 将数组转化成字符串的形式观看
        System.out.println(Arrays.toString(number_array1));

        // 改变数组中的值, 数组中元素类型和大小都是固定的,不能够进行改变
        str_array[2] = "java";
        System.out.println(Arrays.toString(str_array));

        // 使用for-each的形式来遍历数组中的元素
        for(int a:number_array){
            System.out.println(a);
        }

        // 对数组进行排序
        Arrays.sort(number_array);
        System.out.println("排序之后数组"+Arrays.toString(number_array));

        //二分查找数组中给定的对象
        int index = Arrays.binarySearch(number_array, 5);
        System.out.println("索引的位置是"+index);
        System.out.println(Arrays.toString(str_array));
        int str_index = Arrays.binarySearch(str_array, "jack");
        System.out.println(str_index);

    }
}

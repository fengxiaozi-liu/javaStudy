package com.javaDataAndcontainers1;

import java.util.*;

/**
1. 集合框架的描述
    1. 虽然java提供了特设类, Dictionary, Vector, Stack和Properties这些用来存储或者是存储数组对象
       但是它们缺少一个核心的,统一的主题.
    2. 集合框架的设计
        1. 该框架必须是高性能的.基本集合(动态数组, 链表, 树, 哈希表)的实现必须是高效的
        2. 该框架允许不同类型的集合,以类似的方式工作,具有高度的互操作性
        3. 对一个集合的扩展和适应必须是简单的
        4. 因此整个集合框架就围绕一组标准接口设计.你可以直接使用这些接口的标准实现, 如: LinkedList, HashSet, TreeSet
    3. 集合框架是一个用来代表和操作集合的同一框架,所有集合框架都必须包含一下内容
        1. 接口: 是代表集合的抽象数据类型.例如Collection, List, Set, Map等, 定义多个接口的原因是为了以不同的方式操作集合对象
        2. 实现(类): 是接口的具体实现. 从本质上讲他们是可重复使用的数据结构, 如: ArrayList, LinkedList, HashSet, HashMap
        3. 算法: 是实现集合接口的对象里的方法指定的一些有用计算, 例如: 搜索和排序.
2. 结合接口的描述
    1. Collection接口
        Collection 是最基本的集合接口,一个 Collection代表一组 Object,即 Collection 的元素,Java不提供直接继承自Collection的类,
        只提供继承于的子接口(如List和set).Collection接口存储一组不唯一,无序的对象。
    2. List接口
        List接口是一个有序的 Collection,使用此接口能够精确的控制每个元素插入的位置,能够通过索引(元素在List中位置,类似于数组的下标)
        来访问List中的元素，第一个元素的索引为 0，而且允许有相同的元素.List接口存储一组不唯一,有序（插入顺序）的对象。
    3. Set接口
        Set具有与Collection完全一样的接口,只是行为上不同,Set 不保存重复的元素.Set接口存储一组唯一,无序的对象.
    4. SortedSet接口
        继承于Set保存有序的集合
    5. Map接口
        Map接口存储一组键值对象,提供key键到value值的映射
    6. Map.Entry接口
        描述在一个Map中的一个元素键/值对.是一个Map的内部接口
    7. SortedMap接口
        继承于Map,使Key保持在升序排列
3. java中主要的集合框架
    1. Collection: 存储一个元素集合,Collection包括三种子类型:
        1. List
           1. ArrayList
           2. LinkedList
        2. Set
            1. HashSet
            2. LinkedHashSet
        3. Queue
    2. Map: 存储键值对的映射
        1. HashMap
        2. LinkedHashMap
4. List集合框架
    1. ArrayList
        1. 描述
            1. ArrayList是一个可以动态修改的数组,与普通的数组的区别就是它没有固定大小的限制.我们可以添加或者删除元素
            2. ArrayList类位于java.util包中,使用时提前引用它
                import java.util.ArrayList
        2. ArrayList的创建
            ArrayList<E> objectName = new ArrayList<>();
                E: 泛型数据类型, 用于设置objectName的数据类型, 只能为引用数据类型
                    1. Boolean
                    2. Byte
                    3. Short
                    4. Integer
                    5. Long
                    6. Float
                    7. Double
                    8. Character
                    9. String
                objectName: 对象名.
        3. ArrayList的相关方法
            常用方法
            -------------------------------------------------
            1. add(): 将元素插入到指定的ArrayList中
            2. addAll(): 添加集合中的所有集合到ArrayList中
            3. get(): 通过索引值获取ArrayList中元素
            4. set(): 替换ArrayList中指定元素的值
            5. indexOf(): 返回ArrayList中元素的索引值
            6. remove(): 删除ArrayList里元素的数量
            7. removeRange(): 删除指定索引元素
            8. removelf(): 删除满足特定条件的元素
            9. removeAll(): 删除存在于指定集合中的ArrayList里的所有元素
            10. clear(): 删除ArrayList中的所有元素
            11. size(): 返回ArrayList里元素的数量
            12. isEmpty(): 判断元素是否为空
            13. sort(): 对ArrayList元素进行排序
            14. contains(): 判断是否在ArrayList中
            15. forEach(): 遍历ArrayList中的每一个元素并执行特定操作
            ---------------------------------------------------

            转换操作
            ---------------------------------------------------
            1. toArray(): 将ArrayList转换为数组
            2. toString(): 将ArrayList转换为字符串
            ---------------------------------------------------

            切片操作
            ---------------------------------------------------
            subList(): 截取部分ArrayList中的元素
    2. LinkedList
        1. 链表是一种常见的数据结构,是一种线性表,但是并不会按照线性顺序存储数据, 而是在每一个节点里存储下一个节点的位置
        2. 链表做增加和删除操作的效率比较高,但是对于查找和修改的操作效率低
        3. 这里暂时略过

2. Map
    1. HashMap
        1. 描述
            1. HashMap是一个散列表, 它存储的内容时键值对的映射
            2. HashMap实现了Map接口, 根据HashCode值存储数据, 具有很快的访问速度, 最多用于一条记录的键为null, 不支持线程同步
            3. HashMap是无序的
        2. HashMap的创建
            import java.util.HashMap
            HashMap<dataType, dataType> objectName = new HashMap<dataType, dataType>()
        3. HashMap中的方法
            常用方法
            ------------------------------------------
            1. get(): 获取指定key的value
            2. getOrDefault():获取指定key对应的value, 如果找不到key, 则返回设置的默认值
            3. values(): 返回HashMap()所有的value值
            3. put(): 将键值对添加HashMap中
            4. merge(): 将键值对添加到HashMap中
            5. remove(): 删除HaspMap中指定键key的映射关系
            6. size(): 计算HashMap键值得对应关系
            7. replace(): 替换HashMap中指定key对应的value
            8. isEmpty(): 判断HashMap中键值对是否为空
            -------------------------------------------
            循环遍历
            --------------------------------------------
            1. forEach(): 对HashMap中的每个映射执行指定的操作
            2. keySet(): 返回HashMap中所有映射项的集合视图
            3. entrySet(): 返回HashMap中所有映射项的集合视图
3. Set
    HashSet
        1. 描述
            1. HashSet是基于HashMap实现的, 不允许有重复元素的集合
            2. HashSet允许有null值
            3. HashSet是无序的
            4. HashSet不是线程安全的,如果多个线程同时修改HashSet，最终结果不确定
 */
public class javaCollectionFrame7 {
    public static void main(String[] args) {
//        studyArrayList();
        studyHashMap();

    }
    public static void studyArrayList(){

        // 创建一个ArrayList
        ArrayList<String> str_list = new ArrayList<>();

        // 增加元素
        str_list.add("hello");
        str_list.add("world");
        str_list.add("I am Jack");
        str_list.add("welcome to java");

        // 转化成元组, 需要创建一个和ArrayList一样大小的元组
        String[] str_array = new String[str_list.size()];
        str_list.toArray(str_array);
        System.out.println(Arrays.toString(str_array));

        // 转换成字符串
        String str = str_list.toString();
        System.out.println(str);

        // 通过索引值获得元素
        String current_value = str_list.get(2);
        System.out.println("索引为2的元素是"+ current_value);

        // 查看指定元素的索引
        int index = str_list.indexOf("world");
        System.out.println("world的索引="+index);

        // 改变指定位置的索引值
        str_list.set(2, "I am Marry");
        System.out.println(str_list);

        // 对元素进行切片
        System.out.println("索引1到索引2的值为"+str_list .subList(1, 3));

        // 移除指定位置的元素, 可以根据元素也可以根据索引
        str_list.remove("hello");
        str_list.add(0, "hi");

        // 查看ArrayList中包含元素的个数
        int num = str_list.size();
        System.out.printf("当前ArrayList中有%s个元素\n", num);

        // 判断元素是否为空
        Boolean content_status = str_list.isEmpty();
        System.out.println(content_status);

        // 遍历列表元素
        str_list.forEach((each)->System.out.println(each));

        // 判断元素是否包含某个值
        if (str_list.contains("hi")){
            System.out.println("str_list包含元素hi");
        }
    }

    public static void studyHashMap(){
        //创建一个HashMap()
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("name", "zhangsan");
        testMap.put("age", "18");
        testMap.put("gender", "男");
        testMap.put("婚配关系", "未婚");
        testMap.put("薪水", "8000");

        // 查看当前HashMap
        System.out.printf("当前HashMap是\n%s\n", testMap);

        // 查看HashMap()中的所有值
        Collection<String> val_list = testMap.values();
        System.out.println(val_list);

        // 返回key与value的集合
        Set<Map.Entry<String,String>> key_value_set = testMap.entrySet();
        System.out.println(key_value_set);

        // 返回所有key的集合
        Set<String> key_set = testMap.keySet();
        System.out.println(key_set);

        // 获取数组中到某key的值
        String val = testMap.get("gender");
        System.out.println(val);

        // 重新设置某个key的值
        testMap.replace("age", "22");
        System.out.println("替换后的HashMap为\n"+testMap);

        // 将键值对添加到HashMap中
        testMap.merge("女朋友", "郑爽", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("更新之后的HasMap是"+testMap);

        // 遍历HashMap
        testMap.forEach((key, value) -> System.out.format("当前的key值是%s, 当前的value值是%s  ", key, value));

        // 使用for循环遍历HashMap列表
        System.out.println("使用for循环遍历的列表如下");
        for(String value: testMap.values()){
            System.out.println(value);
        }

        // 删除指定的key值
        testMap.remove("薪水");
        System.out.println(testMap);

        // 判断HashMap是否为空
        if(!testMap.isEmpty()){
            System.out.println("当前HashMap不为空");
        }
    }
}

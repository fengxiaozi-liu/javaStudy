package com.javaDataAndcontainers1;
/**
1. 描述
    1. 当字符串进行修改的时候,需要使用StringBuffer和StringBuild类
    2. 和String类不同的是,StringBuffer和StringBuilder类的对象能够被多次修改,并且不产生新的对象
    3. 在使用 StringBuffer类时，每次都会对StringBuffer对象本身进行操作，而不是生成新的对象，所以如果需要对字符串进行修改推荐使用 StringBuffer
    4. StringBuilder类和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的, 即资源不能够共享
    5. 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类
2. StringBuffer的方法
    1. StringBuffer append(String s): 将指定的字符串追加到此字符序列
    2. StringBuffer reverse(): 将字符串序列用其反转形式取代
    3. delete(int start, int end): 将此序列的子字符串中的字符移除
    4. insert(int offset, int i): 将int参数的字符串形式插入此序列中
    5. replace(int start , int end, String str): 使用给定String中的字符替换此序列中的子字符串
    6. int capacity(): 返回当前容量
 */

public class javaStringBuffer4 {
    public static void main(String[] args) {
        // 创建一个StringBuffer类型的字符串,设定好一个容量,如果增加的字符串容量大于初始化的容量,会自动增加
        StringBuffer sb = new StringBuffer(10);

        // 使用append方法来增加字符串
        sb.append("hello world, i am jack, welcome to java school");
        System.out.println(sb);

        // 查看字符串当前容量
        System.out.println(sb.capacity());

        // 删除指定的子字符串, 因为是只对一个对象操作sb字符串发生了改变
        sb.delete(5, 8);
        System.out.println(sb);

        // 返回指定字符串的索引
        System.out.println(sb.indexOf("a"));

        // 在指定的位置插入字符串
        sb.insert(5, "被插入位置");
        System.out.println(sb);

        // 对给定的String中的字符替换此序列中的子字符串
        sb.replace(5, 8, "被替换");
        System.out.println(sb);

        // 返回字符串的长度
        System.out.println(sb.length());

        // 查看StringBuffer的指向问题
        String test = sb.toString();
        System.out.println(test);
        // 改变sb的值, 同时查看test
        sb.delete(5, 8);
        System.out.println("当前sb的值为\n"+sb);
        System.out.println("改变sb的值查看test\n"+test);
        System.out.println("因此是copy");
    }

}

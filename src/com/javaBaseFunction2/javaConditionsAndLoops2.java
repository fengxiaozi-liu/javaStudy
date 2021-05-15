package com.javaBaseFunction2;

import java.util.Arrays;

/**
1. 条件判断
    1. if 条件判断
        1. 描述
            当条件为真时执行代码块里面的语句
        2. 格式
            if(布尔表达式){
                //如果布尔表达式为true将执行的语句
            }
    2. if...else...条件判断
        1. 描述
            1. 当条件为真时执行if里面的语句, 当条件为假时执行else里面的语句
            2. 格式
                if(布尔表达式){
                    //如果布尔表达式的值为true
                }else{
                    //如果布尔表达式的值为false
                }
    3. if...else if...else...条件判断
        1. 描述
            1. if语句后面可以根else...if...else语句,这种语句可以检测到多种可能的情况
            2. if语句至多有一个else语句, else语句在所有的else if语句之后
            3. if语句可以有若干个else if语句, 他们必须在else语句之前
            3. 一旦一个else语句检测为True,其他的else语句不再执行
2. switch case语句
    1. 描述
        1. switch case语句判断一个变量与一些列值中的某个值是否相等,每个值称为一个分支
        2. switch case语句规则
            1. switch语句中的变量类型可以是byte,short,int或者char
            2. switch语句可以拥有多个case语句,每一个case后面要一个比较的值和符号
            3. case语句中的值得数据类型必须与变量的数据类型相同,而且只能是常量或者字面变量
            4. 当变量的值与case语句的值相等时,那么case语句之后的语句开始执行, 知道break语句出现才会跳出switch语句
            5. 当遇到break语句时,switch语句终止.序跳转到switch语句后面的语句执行.case语句不必须要包含break语句.
               如果没有break语句出现,程序会继续执行下一条case语句,直到出现break语句.
            6. switch语句可以包含一个default分支,该分支一般是switch语句的最后一个分支(可以在任何位置，但建议在最后一个)
               default在没有case语句的值和变量值相等的时候执行.default分支不需要break语句
            7. switch case执行时,一定会先进行匹配,匹配成功返回当前case的值,再根据是否有break,判断是否继续输出,或是跳出判断
        3. 格式
            switch(expression){
                case value :
                    //语句
                    break; //可选
                case value :
                   //语句
                   break; //可选
                //你可以有任意数量的case语句
                default : //可选
                   //语句
            }
2. 循环
    1. for循环
        1. 描述
            1. for循环执行的次数是在执行前就确定的
            2. 最先执行初始化步骤.可以声明一种类型,但可初始化一个或多个循环控制变量,也可以是空语句.
            3. 然后,检测布尔表达式的值.如果为true,循环体被执行.如果为false,循环终止,开始执行循环体后面的语句.
            4.执行一次循环后,更新循环控制变量.
            5.再次检测布尔表达式,循环执行上面的过程.
        2. 格式
            1. 格式1
                for(初始化; 布尔表达式; 更新) {
                    //代码语句

                }
            2. 格式2
                for(声明语句 : 表达式){
                    //代码句子
                }
    2. while循环
        1. 描述
            1. while是最基本的循环
            2. 条件为true时会一直循环
        2. 格式
            while( 布尔表达式 ) {
                //循环内容
            }
    3. do...while循环
        1. 描述
            1. 即使不满足条件,也至少执行一次
            2. 布尔表达式在循环体的后面,所以语句块在检测布尔表达式之前已经执行了.如果布尔表达式的值为true,则语句块一直执行,
               直到布尔表达式的值为 false.
        2. 格式
            do {
                //代码语句
            }while(布尔表达式);
 */
public class javaConditionsAndLoops2 {
    public static void main(String[] args) {
//        studyConditions();
//        studySwitchCase();
        studyLoops();
    }
    public static void studyConditions(){
        int a = 2;
        String str = "这是一个字符串";

        // 使用if语句
        if (a==2){
            System.out.println(a);
        }

        // 使用if...else...语句
        if (a == 1){
            System.out.println("a的值是1");
        }else{
            System.out.format("当前a的值是%s\n", a);
        }

        // 使用if...else if...else...语句
        if (a == 1){
            System.out.println("a=1");
        }else if(a == 2){
            System.out.println("a的值是2");
        }else{
            System.out.println(str);
        }
    }

    public static void studySwitchCase(){
        String st = "d";
        switch (st){
            case "a":
                System.out.println("当前值是a");
                break;
            case "b":
                System.out.println("当前值是b");
                break;
            case "c":
                System.out.println("当前值是c");
                break;
            default:
                System.out.println("未匹配到当前选项");
        }
    }

    public static void studyLoops(){
        // 创建一个数组
        Integer[] integer_array = {1, 3, 4, 6, 7, 9, 11, 33};
        System.out.println(Arrays.toString(integer_array));

        // 使用for循环来遍历数组元素
        System.out.println("for循环遍历数组");
        for(int i = 0; i<integer_array.length; i++){
            if (i == integer_array.length -1){
                System.out.printf("%s\n", integer_array[i]);
            }else{
                System.out.printf("%s ", integer_array[i]);
            }
        }

        // 使用while循环遍历列表
        System.out.println("while循环遍历数组");
        int array_length = integer_array.length;
        int j = 0;
        while (j < array_length){
            if (j == array_length -1){
                System.out.printf("%s\n",integer_array[j]);
            }else{
                System.out.printf("%s ",integer_array[j]);
            }
            j++;
        }

        // 使用do...while的方式来循环列表
        System.out.println("do...while循环遍历数组");
        int x = 0;
        do{
            if (x == array_length -1) {
                System.out.printf("%s\n",integer_array[x]);
            }
            else{
                System.out.printf("%s ", integer_array[x]);
            }
            x++;
        }while (x<array_length);
    }
}

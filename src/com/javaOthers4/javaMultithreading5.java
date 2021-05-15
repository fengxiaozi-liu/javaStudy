package com.javaOthers4;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
线程
1. 描述
    1. 一条线程是进程中一个单一的顺序控制流, 一个进程可以并发多个线程, 每条线程并行执行不同的任务
    2. 多线程是多任务的一种表现形式, 多线程的使用更小的资源开销
2. 一个线程的声明周期
    1. 新建状态
        1. 使用new关键字和Thread类或子类创建一个线程对象后, 该线程对象就处于新建状态
    2. 就绪状态
        1. 当线程对象调用了start()方法之后, 该线程就进入了就绪状态. 就绪状态的线程处于就绪队列中, 要等待JVM里线程调度器调度
    3. 运行状态
        1. 如果就绪状态的线程获取CPU资源, 就可以以执行run()方法进入运行状态, 处于运行状态的线程最复杂, 它可以变成阻塞状态
           就绪状态和死亡状态
    4. 阻塞状态
        1. 如果一个线程执行了sleep, suspend等方法之后, 失去所占用资源之后,该线程就从运行状态变成了阻塞状态. 在睡眠时间已到或者
           获得设备资源后可以重新进入就绪状态
        2. 阻塞状态分类
            1. 等待阻塞: 运行状态执行wait()方法, 使线程进入等待阻塞状态.
            2. 同步阻塞: 线程在获取synchronized同步锁失败(这时同步锁正在被其他资源占用)
            3. 其他阻塞: 通过调用线程的sleep()或join()发出了I/0请求之后, 线程就会进入到阻塞状态.当sleep()超时, join()等线程
               终止超时, 或者I/O处理完毕, 线程重新转入就绪状态
    5. 死亡状态
        1. 一个运行状态的线程完成任务或者其他终止条件发生时, 该线程就切换到终止状态
3. 线程的优先级
    1. 每一个java线程都有一个优先级,优先级是为了帮助操作系统确定线程的调度顺序
    2. java的优先级是一个整数, 其值范围是1(最小优先级)到10(最大优先级)
    3. 每一个线程都会分配到一个默认的优先级5
    4. 高优先级的线程更重要, 并且应该在低优先级的线程之前分配处理器资源, 但是, 线程优先级不能保证线程的执行顺序
4. java创建线程的方法
    1. 通过实现Runnable接口
        1. 必须实现一个public void run()方法: 可以重写该方法, run()方法可以调用其他方法, 使用其他类, 并声明变量, 和主线程一样
        2. 实例化一个线程方法Thread(Runnable threadObject, String threadName)
        3. 新创建的Thread对象需要调用它的start()方法才会运行
    2. 通过继承Thread类本身
        1. 该类继承Thread类, 然后创建一个该类的实例对象
        2. 继承类必须重写run()方法, 该方法是新线程的入口点
        3. 该类的实例对象需要调用start()方法才能执行
        4. 该方法本质上也是Runnable接口的一个实例
    3. 通过callable和Future创建线程
        1. 创建Callable接口的实现类, 并实现call()方法, 该call()方法将作为线程的执行体, 并且要有返回值
        2. 创建Callable实现类的实例对象, 使用FutureTask类来包装Callable对象, 该FutureTask对象封装了该Callable对象的call()方法的返回值
        3. 使用FutureTask对象作为Thread对象的target创建并启动新线程
        4. 调用FutureTask对象的get()方法来获得子线程执行结束后的返回值
 */
public class javaMultithreading5 {
    public static void main(String[] args) {
        // =============用Runnable接口实现多线程===================
//        // 创建两个个线程
//        StudyRunnable sr1 = new StudyRunnable("Runnable接口线程1");
//        StudyRunnable sr2 = new StudyRunnable("Runnable接口线程2");
//        // 运行这个线程
//        ArrayList<StudyRunnable> sr_list = new ArrayList<>();
//        sr_list.add(sr1);
//        sr_list.add(sr2);
//        for (StudyRunnable sr: sr_list){
//            sr.start();
//        }

//        // ======================继承Thread类来实现多线程===========
//        // 创建继承类的实例对象
//        StudyThread st1 = new StudyThread("Thread继承类线程1");
//        StudyThread st2 = new StudyThread("Thread继承类线程2");
//
//        // 运行线程
//        ArrayList<StudyThread> stList = new ArrayList<>();
//        stList.add(st1);
//        stList.add(st2);
//        for (StudyThread st: stList){
//            st.start();
//        }

        // ===============================使用Callable和Future来创建线程=======================
        // 创建一个StudyCallable的对象
        StudyCallable sc = new StudyCallable("Callable线程1");
        sc.start();
    }
}

// 使用实现Runnable接口来创建线程
class StudyRunnable implements Runnable{
    // 创建实例变量
    private Thread thread;
    private String threadName;

    // 创建一个构造方法
    StudyRunnable(String name){
        this.threadName = name;
    }

    // 实现run()方法
    public void run(){
        System.out.println("当前正在调用"+this.threadName);
        try {
            for (int i=0; i<4; i++){
                System.out.println("Thread: "+ this.threadName + "," + i);
                // 使用阻塞操作
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }
    public void start(){
        System.out.println(this.threadName+"已经就绪");
        if (this.thread == null){
            this.thread = new Thread(this, this.threadName);
            this.thread.start();
        }
    }
}
// 使用继承Thread类的方式来创建一个多线程
class StudyThread extends Thread{
    private Thread thread;
    private String threadName;

    StudyThread(String name){
        this.threadName = name;
    }

    // 重写run()方法
    public void run(){
        System.out.println("正在运行"+this.threadName);
        try {
            for (int i=4; i<9; i++){
                Thread.sleep(10);
                System.out.println("当前线程"+threadName+" "+i);
            }
        }catch (InterruptedException e){
            System.out.println("线程出现中断");
        }
        System.out.println(this.threadName+"退出");
    }

    // 创建一个让线程运行的方法
    public void start(){
        if (this.thread == null){
            // 新建一个线程
            this.thread = new Thread(this, this.threadName);
            // 让线程运行起来
            System.out.println(this.threadName+ "已经准备就绪");
            thread.start();
        }
    }
}

// Callable创建多线程学习
class StudyCallable implements Callable<Integer>{
    // 一定要实现call()方法, 并且要有一个返回值, 并且返回值的类型, 一定要是Callable泛型中指定的类型
    private String threadName;
    StudyCallable(String name){
        this.threadName = name;
    }
    public Integer call() throws Exception{
        int i = 0;
        for (; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }

    public void start(){
        // 使用FutureTask类来包装Callable对象, 该FutureTask对象封装了该Callable对象的call()方法的返回值
        FutureTask<Integer> ft = new FutureTask<>(this);
        Thread test = new Thread(ft, this.threadName);
        test.start();
        try {
            System.out.println("子线程的返回值"+ft.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
package com.atguigu.java1;

/**
 * 使用同步机制将单利模式中的懒汉式改写为线程安全的
 *
 * @author Chris Jin
 * @create 2022-03-22 3:35 PM
 */
public class BankTest {
}

class Bank {
    private static Bank instance = null;

    private Bank() {

    }

    public static synchronized Bank getInstance() {
        //方式一:效率稍差,因为所有的线程都需要进入同步代码块
//        synchronized(Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二:改良版
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;

    }

}
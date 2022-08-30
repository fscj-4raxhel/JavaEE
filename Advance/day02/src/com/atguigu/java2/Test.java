package com.atguigu.java2;

import static java.lang.Thread.sleep;

/**
 * @author Chris Jin
 * @create 2022-03-22 5:00 PM
 */

class ARunnable implements Runnable{

    private void anotherRun() throws InterruptedException {
        sleep(100);
    }
    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public abstract class Test {
    private void someMethod(){
        System.out.println("This is a bit cool!");
    }

}

package atguigu.exer;

/**
 * 练习:创建两个分线程,其中一个遍历100以内的偶数,另一个线程遍历100以内的奇数
 * @author Chris Jin
 * @create 2022-03-21 4:56 PM
 */

class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {

//        OddThread oddThread = new OddThread();
//        EvenThread evenThread = new EvenThread();
//        oddThread.start();
//        evenThread.start();

        //创建Thread的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
    }
}

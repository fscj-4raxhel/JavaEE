package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Java内置的4大核心函数式接口
 *
 * 消费型接口 Consumer<T>    void accept(T t)
 * 供给型接口 Supplier<T>    T get()
 * 函数型接口 Function<T,R>  R apply(T t)
 * 断定型接口 Predicate<T>   boolean test(T t)
 * @author Chris Jin
 * @create 2022-05-02 2:22 PM
 */
public class LambdaTest2 {

    @Test
    public void test1(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("学习太累了,去天上人间买了瓶矿泉水,价格为" + aDouble);
            }
        });

        System.out.println("***********************");
        happyTime(400, price -> System.out.println("学习太累了,去天上人间" + price));
    }

    public void happyTime(double money, Consumer<Double>con){
        con.accept(money);
    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京","南京","天津","东京","西京","普京");
        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterStrs);
        System.out.println("***********************");
        List<String> filterStrs1 =filterString(list, aString -> aString.contains("京"));
        System.out.println(filterStrs1);
    }

    public ArrayList<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filteredList = new ArrayList<>();

        for(String s: list){
            if(pre.test(s)){
                filteredList.add(s);
            }
        }
        return filteredList;
    }
}

package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Chris Jin
 * @create 2022-04-07 9:48 PM
 */
public class CollectionTest {


    @Test
    public void test1() {
        Collection coll = new ArrayList();

        coll.add(123);
        coll.add(456);
        coll.add(789);
        coll.add(123);
        coll.forEach(System.out::println);
    }
}

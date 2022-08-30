package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections: 操作Collection、Map的工具类
 *
 * 面试题:Collection 和 Collections的区别?
 *
 * @author Chris Jin
 * @create 2022-04-17 4:50 PM
 */

public class CollectionsTest {
    /*
    reverse(List): 反转List中元素的顺序
     */

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(1231);
        list.add(4);
        list.add(565);

        System.out.println(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        Collections.sort(list);

    }
}

package com.atguigu.java1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Chris Jin
 * @create 2022-03-31 4:40 PM
 */
public class TreeSetTest {
    /*
        1. 向TreeSet中添加的数据,要求是相同类的对象
        2. 两种排序方式: 自然排序(实现Comparable接口) 和 定制排序(Comparator)

        3. 自然排序中, 比较两个对象是否相同的标准为: compareTo()返回0, 不再是equals().
        4. 定制排序中, 比较两个对象是否相同的标准为: compare()返回0, 不再是equals().
     */
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        //失败: 不能添加不同类的对象
//        set.add(123);
//        set.add("AA");
//        set.add(456);
//        set.add(789);

        set.add(34);
        set.add(-34);
        set.add(8);
        set.add(43);
        set.add(11);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){
        Comparator com = new Comparator() {
            //按照名字的从小到大排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return u1.getName().compareTo(u2.getName());
                }else{
                    throw new RuntimeException("数据类型不匹配");
                }
            }
        };
        TreeSet set = new TreeSet(com);
        set.add(new User("Tom",12));
        set.add(new User("Aom",12));
        set.add(new User("Bom",12));
        set.add(new User("Com",12));
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}

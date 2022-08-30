package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口中声明的方法的测试
 * 向collection接口中的实现类的对象中添加数据obj时,要求obj所在类重写equals()
 * @author Chris Jin
 * @create 2022-03-31 1:08 PM
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        //1. containts(Object obj): 判断当前集合中是否包含obj
        //我们在判断是会调用obj对象所在类的equals()方法
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(new Person("Jerry",20)));

        //2. containsAll(Collection coll1): 判断形参coll1中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123,456);
        coll.containsAll(coll1);
    }

    @Test
    public void test2(){
        //3. remove(Object obj): 从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        boolean remove = coll.remove(1234);
        System.out.println(coll);
        coll.remove(new Person("Jerry",20));

        //4. removeAll(Collections coll1): 差集:从当前集合中移除coll1中的所有的元素
        Collection coll1 = Arrays.asList(123,4556);
        coll.removeAll(coll1);
        System.out.println(coll);
    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //retainAll(Collection coll1): 交集: 获取当前集合和coll1集合的交集,并返回给当前集合
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //equals(Object obj): 要想返回true,需要当前集合和形参集合的元素都相同
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new Person("Jerry",20));
        coll1.add(new String("Tom"));
        coll1.add(false);

    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //7. hashCode(): 返回当前对象的哈希值
        System.out.println(coll.hashCode());
        //8. 集合 --->数组 : toArray()
        Object[] arr = coll.toArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //拓展: 数组 ---> 集合: 调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List list1 = Arrays.asList(new int[]{123, 567});
        System.out.println(list1.size());//1

        List list2 = Arrays.asList(new Integer[]{213, 456});
        System.out.println(list2.size());//2

        //iterator(): 返回Iterator接口的实例,用于遍历集合元素
        //见IteratorTest
    }
}

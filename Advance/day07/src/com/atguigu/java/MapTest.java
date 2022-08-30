package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/**
 * 一、
 * |----Map: 双列数据, 存储key-value pair的数据 --- 类似于高中的函数 y = f(x) 1.2
 *      |----HashMap: 作为Map的主要实现类 1.2 线程不安全的效率高; 存储null的key和value
 *          |----LinkedHashMap: 1.4 保证在遍历map元素是,可以按照添加的顺序实现遍历.
 *                  原因: 在原有的HashMap底层结构基础上,添加了一对指针, 指向前一个元素和后一个元素
 *                  对于频繁的遍历操作, 此类执行效率高于HashMap
 *      |----TreeMap: 1.2 保证按照添加的key-value pair进行排序,实现遍历排序. 此时考虑key的自然排序或定制排序
 *                      底层使用红黑树
 *      |----Hashtable: 作为古老的实现类: 1.0 线程安全的效率低; 不能存储null的key 和value
 *          |----Properties: 常用来处理配置文件.key和value都是String类型
 *
 *      HashMap 底层: 数组 + 链表 (jdk7及之前)
 *                    数组 + 链表 + 红黑树 (jdk8)
 * 面试题:
 * 1. HashMap的底层实现原理?
 * 2. HashMap 和 Hashtable 的异同?
 * 3. CurrentHashMap 与 Hashtable的异同 (暂时不讲)
 *
 * 二、Map结构的理解
 *   Map中的key: 无序的、不可重复的,使用Set存储所有的key ---> key所在的类要重写equals() 和 hashCode() 以HashMap为例
 *   Map中的value: 无序的、可重复的,使用Collection存储所有的value ---> value所在的类要重写equals()方法
 *   一个键值对: key - value pair 构成了一个Entry对象
 *   Map中的entry: 无序的、不可重复的,使用Set存储所有的entry
 * 三、 HashMap的底层实现原理?以jdk 7 为例
 *      HashMap map = new HashMap();
 *      在实例化以后,底层创建了长度为16的一维数组Entry[] table.
 *      ...可能已经执行过多次put了...
 *      map.put(key1,value1);
 *      首先,调用key1所在类的hashCode()计算key1哈希值,此哈希值经过某种算法计算以后,得到在Entry数组中存放的位置
 *      如果此位置上的数据为空,此时的key1-value1添加成功 --- 情况1
 *      如果此位置上的数据不为空,(意味着此位置上存在一个或多个数据(以链表形式存在)),比较key1和已经存在的一个或多个数据的哈希值:
 *          如果key1的哈希值与已经存在的数据的哈希值都不相同,此时key1-value1添加成功. --- 情况2
 *          如果key1的哈希值与已存在的某一个数据(key2-value2)的哈希值相同,继续比较: 调用key1所在类的equals()方法, 比较:
 *                  如果equals()返回false:此时key1-value1添加成功. --- 情况3
 *                  如果equals()返回true:使用value1替换value2
 *
 *          补充: 关于情况2和情况3: 此时key1-value1和原来的数据以链表的方式存储
 *
 *          在不断的添加过程中,会涉及到扩容问题, 默认的扩容方式: 扩容为原来容量的2倍, 并将原来的数据复制过来
 *
 *          jdk8 相较于jdk7在底层实现方面的不同
 *          1. new HashMap(): 底层没有创建一个长度为16的数组
 *          2. jdk 8 底层的数组是: Node[] 而非 Entry[]
 *          3. 首次调用put()方法时,底层创建长度为16的数组
 *          4. jdk7 底层结构只有:数组+链表. jdk8中的底层结构: 数组 + 链表 + 红黑树
 *             当数组的某一个索引位置上的元素以链表形式存在的数据个数 > 8 且当前数组的长度 > 64 时,
 *             此索引位置上的元素改用红黑树存储
 *
 *         DEFAULT_INITIAL_CAPACITY : HashMap 的默认容量, 16
 *         DEFAULT_LOAD_FACTOR: HashMap的默认加载因子 0.75
 *         threshold: 扩容的临界值 = 容量 * 扩容因子 16 *0.75 => 12
 *         TREEIFY_THRESHOLD: Bucket中链表长度大于该默认值,转化为红黑树: 8
 *         MIN_TREEIFY_CAPACITY: 桶中的Node被树化是的hash表容量, 64
 * 四、LinkedHashMap的底层实现原理(了解)
 *
 *      源码中:
 *      static class Entry <K,V> extends HashMap.Node<K,V>{
 *          Entry <K,V> before, after;
 *          Entry(int hash, K key, V value, Node<K,V> next){
 *              super(hash,key,value,next);
 *          }
 *      }
 *
 *  五、Map中定义的方法:
 *添加 、 删除、修改操作
 Object put(Object key,Object value) value)：将 指定 key-value 添加到 或修改 当前 map 对象中
 void putAll(Map m): 将 m 中的所有 key value 对存放到当前 map 中
 Object remove(Object key) key)：移除指定 key 的 key value 对，并返回 value
 void clear()：清空当前 map 中的所有数据
 元素查询的操作：
 Object get(Object key) key)：获取指定 key 对应的 value
 boolean containsKey(Object key) key)：是否包含指定的 key
 boolean containsValue(Object value) value)：是否包含指定的 value
 int size()size()：返回 map 中 key value 对的个数
 boolean isEmpty()isEmpty()：判断当前 map 是否为空
 boolean equals(Object obj) obj)：判断当前 map 和参数对象 obj 是否相等
 元视图操作的方法：
 Set keySet()keySet()：返回所有 key 构成的 Set 集合
 Collection values()values()：返回所有 value 构成的 Collection 集合
 Set entrySet()entrySet()：返回所有 key value 对构成的 Set 集合
 *
 *
 *
 * @author Chris Jin
 * @create 2022-03-31 8:36 PM
 */
public class MapTest {

    @Test
    public void test6(){
        Map map = new HashMap();
        map.put(123,"AA");
        map.put(345,"BB");
        map.put(12,"CC");

        //遍历所有的key的集合: ketSet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历所有的value集: values()
        Collection values = map.values();
        for(Object v: values){
            System.out.println(v);
        }
        //遍历所有的key-value
        //entrySet()
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "======>" + entry.getValue());
        }

    }

    @Test
    public void test5(){
        Map map = new HashMap();
        map.put(123,"AA");
        map.put(345,"BB");
        map.put(12,"CC");

        System.out.println(map.get(234));
        System.out.println(map.get(345));
        boolean exists = map.containsKey("123");
        System.out.println(exists);

        exists = map.containsValue("CC");
        System.out.println(exists);

        map.clear();
        System.out.println(map.isEmpty());

    }

    @Test
    public void test4(){
        Map map = new HashMap();
        //添加
        map.put(123,"AA");
        map.put(345,"BB");
        //修改
        map.put(123,"CC");
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC", 123);
        map1.put("DD",123);

        map.putAll(map1);

        System.out.println(map);

        //remove(Object key)
        Object value = map.remove("CC");
        System.out.println(map);

        //clear()
        map.clear();
        System.out.println(map.size());

    }

    public static class Entry<K,V> implements Map.Entry{

        @Override
        public Object getKey() {
            return null;
        }

        @Override
        public Object getValue() {
            return null;
        }

        @Override
        public Object setValue(Object value) {
            return null;
        }
    }

    @Test
    public void test3(){
        Entry e = new Entry();
        System.out.println(e.getClass());
    }

    @Test
    public void test2(){
        Map map = new LinkedHashMap();
        map.put(123,"AA");
        map.put(345,"BB");
        map.put(12,"CC");
    }
    @Test
    public void test1(){
        Map map = new HashMap();
//        map = new Hashtable();
        map.put(null,123);
    }
}

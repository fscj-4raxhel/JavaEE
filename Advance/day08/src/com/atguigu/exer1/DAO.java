package com.atguigu.exer1;

import java.util.*;

/**
 * @author Chris Jin
 * @create 2022-04-22 7:09 PM
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<>();

    //保存 T 类型的对象到 Map 成员变量中
    public void save(String id,T entity){
        map.put(id,entity);
    }

    //从 map 中获取 id 对应的对象
    public T get(String id){
        return map.get(id);
    }

    //替换map中key为id的内容改为entity对象
    public void update(String id, T entity){
        if(map.containsKey(id)){
            map.put(id,entity);
        }
    }

    //返回 map 中存放的所有 T 对象
    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> res = new ArrayList<>();
        for(T t: values){
            res.add(t);
        }
        return res;
    }

    //删除指定id对象
    public void delete(String id){
        map.remove(id);
    }
}

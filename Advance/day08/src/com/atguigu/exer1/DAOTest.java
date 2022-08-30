package com.atguigu.exer1;

import org.junit.Test;

import java.util.List;

/**
 * @author Chris Jin
 * @create 2022-04-22 7:18 PM
 */
public class DAOTest {
    @Test
    public void test1(){
        DAO<User> dao = new DAO<>();

        dao.save("111",new User(111,111,"111"));
        dao.save("222",new User(222,222,"222"));
        dao.save("333",new User(333,333,"333"));
        dao.save("444",new User(444,444,"444"));

        List<User> list = dao.list();
//        System.out.println(dao.get("112"));
        dao.delete("111");
        list.forEach(System.out::println);
    }
}

package com.atguigu.java1;

import org.junit.Test;

import java.util.List;

/**
 * @author Chris Jin
 * @create 2022-04-21 9:21 PM
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao = new CustomerDAO();
        dao.add(new Customer());
        List<Customer> list = dao.getForList(10);


    }
}

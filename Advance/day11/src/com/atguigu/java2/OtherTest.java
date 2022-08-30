package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Chris Jin
 * @create 2022-04-29 4:22 PM
 */
public class OtherTest {

    /*
    获取构造器
     */
    @Test
    public void test1(){
        Class clazz = Person.class;
        //getConstructors: 获取当前运行是类中声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor c: constructors){
            System.out.println(c);
        }
        System.out.println();
        //declaredConstructors: 获取当前运行时类中声明的所有的构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor c: declaredConstructors){
            System.out.println(c);
        }
    }

    /*
        获取运行时类的父类
     */

    @Test
    public void test2(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    /*
        获取运行时类带泛型的父类
     */

    @Test
    public void test3(){
        Class clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    /*
        获取运行时类带泛型的父类的泛型

        代码: 逻辑性代码 vs 功能性代码
     */

    @Test
    public void test4(){
        Class clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType)genericSuperclass;
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
//        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class) actualTypeArguments[0]).getTypeName());
    }

    /*
        获取运行时类实现的接口

     */

    @Test
    public void test5(){
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();
        for(Class c: interfaces){
            System.out.println(c);
        }
        System.out.println();
    }

      /*
        获取运行时类所在的包

     */

    @Test
    public void test6(){
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();
        for(Class c: interfaces){
            System.out.println(c);
        }
        System.out.println();
    }

     /*
        获取运行时类声明的注解

     */

    @Test
    public void test7(){
        Class clazz = Person.class;
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation a: annotations){
            System.out.println(a);
        }
        System.out.println();
    }
}

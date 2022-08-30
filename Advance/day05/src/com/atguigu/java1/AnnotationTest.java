package com.atguigu.java1;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Date;

/**
 * 注解的使用
 * <p>
 * 1. 理解Annotation:
 * ① jdk 5.0 新增的功能
 * <p>
 * ② Annotation 其实就是代码里的特殊标记,这些标记可以在编译,类加载,运行时被并执行相应的处理
 * 通过使用Annotation程序员可以在不改变原有逻辑的情况下,在源文件中嵌入一些补充信息.代码分析工具
 * 发开工具和部署工具可以通过这些补充信息进行验证或进行部署
 * <p>
 * ③ 在JavaSE中,注解的使用目的比较简单,例如标记过时的功能,忽略警告等.
 * 在JavaEE/Android开发中,注解占据类更重要的角色,例如用来配置应用成语的任何切面,代替JavaEE
 * 旧版中所一流的繁荣代码和XML配置等
 * 2. Annotation的使用示例
 * 示例一: 生成文相关的注解
 * 示例二: 在编译时进行格式检查(JDK内置的三个基本注解)
 *
 * @author Chris Jin
 * @Override: 限定重写父类方法, 该注解只能用于方法
 * @Deprecated: 用于表示所修饰的元素(类, 方法等)已过时.通常是因为所修饰的结构危险或者存在更好的选择
 * @SuppressWarnings: 抑制编译器警告
 * 示例三: 跟踪代码依赖性, 是吸纳替代配置文件功能
 *
 * 3. 如何自定义注解: @SurpressWarnings()
 *      ① 定义新的Annotation类型使用@interface关键字
 *      ② 内部定义成员,通常使用value表示
 *      ③ 如果指定成员的默认值,使用default定义
 *      ④ 如果自定义注解没有成员,表明是一个标识作用.
 *
 *      如果注解有成员,在使用注解时,需要给成员赋值
 *      自定义注解必须配上注解的信息处理流程(使用反射)才有意义
 *      自定义注解通常都会指明两个元注解: Retention、Target
 *
 * 4. jdk提供的四种元注解
 *      元注解: 对现有的注解进行解释说明的注解
 *      @Retention: 指定所修饰的Annotation的生命周期: SOURCE\CLASS(默认行为)\RUNTIME
 *                  只有声明为RUNTIME生命周期的注解,才能通过反射获取
 *      @Target: 用于指定被修饰的Annotation能用于修饰那些程序元素
 * ***********出现频率较低***********
 *      @Documented: 表示所修饰的注解在被javadoc解析时保留下来
 *      @Inherited: 被它修饰的Annotation将具有继承性
 *
 * 5. 通过反射获取注解信息 --- 到反射内容时系统讲解
 *
 * 6. jdk 8 中注解的新特性:可重复注解、类型注解
 *
 * 6.1 可重复注解: ① 在MyAnnotation上声明@Repeatable,成员值为MyAnnotations.class
 *                ② MyAnnotation的@Target和@Retention等元注解与MyAnnotations相同
 * 6.2 类型注解
 *

 *      自定义注解自动继承了java.lang.annotation.Annotation接口
 *
 * @create 2022-03-28 9:30 PM
 */
public class AnnotationTest {
    public static void main(String[] args) {


        int num = 10;
        Person p = new Student();
        p.walk();

        Date date = new Date(2022,10,11);
        System.out.println(date);


    }
    @Test
    public void testGetAnnotation(){
        Class clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (int i = 0; i < annotations.length; i++) {
            System.out.println(annotations[i]);
        }
    }
}

//JDK 8之前你的写法
//@MyAnnotations({@MyAnnotation(value = "hello"),@MyAnnotation(value = "hi")})
@MyAnnotation(value = "hi")
@MyAnnotation(value = "hello")
class Person {
    private String name;
    private int age;

    @MyAnnotation
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("人走路");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}


class Student extends Person {
    @Override
    public void walk() {
        super.walk();
    }
}

class Generic<@MyAnnotation T> {
    public void show()throws @MyAnnotation RuntimeException{

        ArrayList<@MyAnnotation String> lis = new ArrayList<>();
        int num = (@MyAnnotation int) 10L;
    }
}

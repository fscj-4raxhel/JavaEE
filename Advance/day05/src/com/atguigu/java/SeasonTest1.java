package com.atguigu.java;

/**
 * 使用enum关键字定义枚举类
 * 说明:定义的枚举类默认继承于java.lang.Enum类
 * @author Chris Jin
 * @create 2022-03-28 8:49 PM
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);

//        System.out.println(Season1.class.getSuperclass());//class java.lang.Enum
        System.out.println("***************************");
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("***************************");
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }
        System.out.println("***************************");
        //valueOf(String str): 返回枚举类中对象名是objName的对象
        //如果没有objName的枚举类对象,则抛异常
        Season1 winter = Season1.valueOf("WINTER");
//        Season1 winter = Season1.valueOf("WINTER1");//抛异常
        System.out.println(winter);

    }

}
interface Info{
    void show();
}
//使用enum关键字枚举类
enum Season1 implements Info{
    //1. 提供当前枚举类的多个对象, 多个对象之间用","隔开,末尾对象用";"结束
    SPRING("春天","春暖花开"){
        @Override
        public void show() {

        }
    },
    SUMMER("夏天","夏日炎炎") {
        @Override
        public void show() {

        }
    },
    ATUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {

        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {

        }
    };
    //2. 声明Season对象的属性: 用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3. 私有化类的构造器
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4. 其他需求: 获取枚举类的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }

    //提供toString方法

//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}

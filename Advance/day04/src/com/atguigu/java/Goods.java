package com.atguigu.java;

/**
 * @author Chris Jin
 * @create 2022-03-27 2:56 PM
 */
public class Goods implements Comparable{
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //指定商品比较大小的方式: 按照商品的价格从低到高排序
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods = (Goods) o;
//            if(this.price > goods.price){
//                return 1;
//            }else if(this.price < goods.price){
//                return -1;
//            }else{
//                return 0;
//            }
            return Double.compare(this.price,goods.price);

        }
        throw new RuntimeException("输入的数据类型不一致");
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

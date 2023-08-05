package com.yunchen.springbootmall_2.constant;

public class MyTest {
    public static void main(String[] args) {
    ProductCategory category = ProductCategory.FOOD;
    String s = category.name(); //將enum值轉換為字串
    System.out.print(s); //FOOD

    String s2 = "CAR";
    ProductCategory category2 = ProductCategory.valueOf(s2);
    }
}

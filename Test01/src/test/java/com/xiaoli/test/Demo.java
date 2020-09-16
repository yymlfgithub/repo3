package com.xiaoli.test;

import org.junit.Test;

public class Demo {

    private volatile String name;
    
    @Test
    public void T1(){
        String s = reverse3("123456");
        System.out.println(s);


    }

    //递归
    public static String reverse1(String s){
        int length = s.length();
        if(length <= 1){
            return s;//为true时，停止调用
        }
        System.out.println(s);

        String left = s.substring(0,length/2);
        String right = s.substring(length/2,length);
        System.out.println("left："+left+"---"+"right："+right);
        return reverse1(right)+reverse1(left);
    }

    //通过charAt(int index)返回char值进行字符串拼接
    public static String reverse2(String s){
        int length = s.length();
        String reverse = "";
        for(int i=0;i < length;i++)
            reverse = s.charAt(i) + reverse;

        return reverse;
    }

    //调用StringBuffer中的reverse方法
    public static String reverse3(String s){
        return new StringBuffer(s).reverse().toString();
    }


    @Test
    //数组的位置交換
    public void reverse3(){
        String str = "abcdefg";

        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        System.out.println(new String(chars));
    }

    @Test
    public void reverse4(){
        String str = "abcdefg";
        StringBuilder tmp = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            tmp.append(str.charAt(i));
        }
        System.out.println(tmp.toString());
    }

}

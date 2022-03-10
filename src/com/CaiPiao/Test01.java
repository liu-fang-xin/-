package com.CaiPiao;

import org.junit.Test;

import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {

        //模拟大乐透 红 红 红 红 红（1-35）  蓝 蓝 （1-12）
        TreeSet<Integer> redBALL = new TreeSet<>();
        
       while (true){
           redBALL.add(getRedBall());
           if(redBALL.size()==5){
               break;
           }
       }


        TreeSet<Integer> blueBALL = new TreeSet<>();

        while (true){
            blueBALL.add(getBlueBall());
            if(blueBALL.size()==2){
                break;
            }
        }
        System.out.print("RedBALL = " + redBALL+"\t");
        System.out.println("BlueBALL = " + blueBALL);


        int count =0;
        for (int i = 0; i <100000 ; i++) {
            if(getBlueBall()<=6){
                count++;
            }
        }
        System.out.println("count = " + count);
        double d = count/100000.0;
        System.out.println("d = " + d);


    }


    public static int getRedBall(){
        double v = Math.random() * 35 + 1;
        return (int) v;
    }
    public static int getBlueBall(){
        double v = Math.random() * 12 + 1;
        return (int) v;
    }
    @Test
    public static void  demo1(){
        int count =0;
        for (int i = 0; i <100000 ; i++) {
            if(getBlueBall()<=6){
                count++;
            }
        }

    }
}

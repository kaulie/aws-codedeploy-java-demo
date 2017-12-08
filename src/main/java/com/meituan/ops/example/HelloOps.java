package com.meituan.ops.example;

 
public class HelloOps
{

    public static void main(String[] args) {
        for (int i=0;i < 1000; i++) {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
            
            }
            System.out.println("hello");
        }
        
    } 
}

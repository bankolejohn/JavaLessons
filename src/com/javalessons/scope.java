package com.javalessons;

public class scope {
    public static void main(String args[]) {
        int x,y;
        x =10;
        y=20;
        if(x<y) System.out.println("x is less than y");
        x=x*2;
        if(x==y) System.out.println("x now equal to y");
        x=x*2;
        if(x>y) System.out.println("x now greater than Y");

    }
}
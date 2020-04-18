package com.zufrost.learn.quest;

class Base{
    Base(){
        int i = 1;
        System.out.print(i);
    }
}
public class Quest extends Base{
    static int i;
    public static void main(String [] args){
        Quest ob = new Quest();
        System.out.print(i);
    }
}
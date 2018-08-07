package com.bright.mavendemo.helloworld;

public class HelloWorld {
    public String sayHello() {
        return "hello new World!";
    }
    public static void main(String args[]){
        System.out.print(new HelloWorld().sayHello());
    }
}

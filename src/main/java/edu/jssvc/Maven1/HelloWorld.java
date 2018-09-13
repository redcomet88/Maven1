package edu.jssvc.Maven1;

/**
 * 我的第一个maven工程
 * redcomet88
 * 2018-09-13-8:46
 */

public class HelloWorld {
    public String sayHello()
    {
        return "Hello Maven";
    }

    public static void main(String[] args)
    {
        System.out.println(new HelloWorld().sayHello());
    }
}

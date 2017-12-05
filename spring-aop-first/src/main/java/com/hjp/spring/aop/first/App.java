package com.hjp.spring.aop.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/hjp/spring/aop/first/aop.xml");
        HelloWorld helloWorld1=(HelloWorld)context.getBean("helloWorldImpl1");
        HelloWorld helloWorld2=(HelloWorld)context.getBean("helloWorldImpl2");
        
        helloWorld1.printHelloWorld();
        System.out.println();
        helloWorld1.doPrint();
        
        System.out.println("--------------------------------------------");
      
        helloWorld2.printHelloWorld();
        System.out.println();
        helloWorld2.doPrint();

        

    }
}

package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Andrew on 3/15/2015.
 */
public class Main {
    public static void main (String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com/springinaction/springidol/spring-idol.xml");

        Performer performer4 = (Performer) ctx.getBean("poeticDuke");
        Poem sonnet29 = new Sonnet29();
        Performer duke = new PoeticJuggler(15, sonnet29);
        performer4.perform();

        Performer performer = (Performer) ctx.getBean("hank");
        performer.perform();

        Performer performer1 = (Performer) ctx.getBean("kenny");
        performer1.perform();

        Performer performer2 = (Performer) ctx.getBean("david");
        performer2.perform();

        Performer performer3 = (Performer) ctx.getBean("duke");
        performer3.perform();

        Performer performer5 = (Performer) ctx.getBean("taylor");
        performer5.perform();

        Performer performer6 = (Performer) ctx.getBean("stevie");
        performer6.perform();

        Performer magician = (Performer) ctx.getBean("harry");
        magician.perform();



        }
}

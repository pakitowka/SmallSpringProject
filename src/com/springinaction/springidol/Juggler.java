package com.springinaction.springidol;

/**
 * Created by Andrew on 3/15/2015.
 */
public class Juggler implements Performer {
    private int beanBags = 3;
    public Juggler() {
    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    public void perform(){
        System.out.println("");
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
        System.out.println();
    }
}

package com.springinaction.springidol;

/**
 * Created by Andrew on 3/17/2015.
 */
public class Vocalist implements Performer {
    public Vocalist(){

    }

    @Override
    public void perform() {
        System.out.println("Singing "+ song + " : ");
        System.out.println();
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }


}

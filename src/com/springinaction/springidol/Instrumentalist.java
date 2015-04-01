package com.springinaction.springidol;

/**
 * Created by Andrew on 3/16/2015.
 */
public abstract class Instrumentalist implements Performer {
    public Instrumentalist() {
    }
    public void perform() {
         System.out.print("Playing " + song + " : ");
        instrument.play();
        System.out.println();
    }
    private String song;

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;

    }
    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }
    private Instrument instrument;
    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмента
    }

    public void setAge(String age) {
    }

    public abstract Instrument getInstrument(); // Внедряемый метод
}

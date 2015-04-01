package com.springinaction.springidol;

/**
 * Created by Andrew on 3/17/2015.
 */
public class Magician implements Performer{
    public Magician() {}
    public void perform() {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents()); // Исследует содержимое
    } // ящика
    // внедрение
    private MagicBox magicBox;
    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox; // Внедрение волшебного ящика
    }
    private String magicWords;
    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}

package com.springinaction.springidol;

import java.util.Map;
import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;

/**
 * Created by Andrew on 3/17/2015.
 */
public class OneManBand implements Performer {
    public OneManBand(){
    }
    public void perform(){
        for(String key : instruments.keySet()){
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }

    }
    private Map<String, Instrument> instruments;
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде
    } // отображения
}

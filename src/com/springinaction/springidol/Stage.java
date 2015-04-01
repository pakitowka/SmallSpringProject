package com.springinaction.springidol;

/**
 * Created by Andrew on 3/15/2015.
 */
public class Stage {
    private Stage() {
    }
    private static class StageSingletonHolder {
        static Stage instance = new Stage(); // Создание экземпляра
    }
    public static Stage getInstance() {
        return StageSingletonHolder.instance; // Возвращает экземпляр
    }
}

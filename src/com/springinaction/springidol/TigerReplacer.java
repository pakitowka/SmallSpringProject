package com.springinaction.springidol;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Andrew on 3/17/2015.
 */
public class TigerReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "Tiger in the box?!!\nWTF?O_o";
    }
}

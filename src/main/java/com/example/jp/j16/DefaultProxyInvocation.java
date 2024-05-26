package com.example.jp.j16;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DefaultProxyInvocation {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object prox = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{ InterfaceExample.class},(proxy,method, arg)->{
            if (method.isDefault()) {
                return InvocationHandler.invokeDefault(proxy, method, arg);
            }
            return proxy;
        });
        Method m = prox.getClass().getDeclaredMethod("call");
        m.invoke(prox,null);
    }
}

package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class BeanUtilsTest {
    @Test
    public void test1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        From from = new From(123,"ToString");
        To to = new To();
        System.out.println(to.toString());
        BeanUtils.assign(to,from);
        System.out.println(to.toString());
        assertEquals(from.toString(),to.toString());
    }
}
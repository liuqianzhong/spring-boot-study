package com.dinglit.controller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * http://localhost:8080/
 * Created by Administrator on 2017/11/7.
 */
public class HelloWorldControllerTest {

    @Test
    public void getHello() throws Exception {
        assertEquals("Hello,World!",new HelloWorldController().getHello());
    }

}
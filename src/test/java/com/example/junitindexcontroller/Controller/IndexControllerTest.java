package com.example.junitindexcontroller.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    @Test
    public void welcomeTest(){

        IndexController indexController = new IndexController();
        String[] paramArray = null;
        String resultActual = "El array está vacio";
        String resultReal = indexController.welcome(paramArray);
        assertEquals(resultActual, resultReal);
    }

    @Test
    public void arrayWithoutDataTest() {

        IndexController indexController = new IndexController();
        String[] paramArray = new String[3];
        String resultActual = "param[0]null\n" + "param[1]null\n" + "param[2]null\n";
        String resultReal = indexController.welcome(paramArray);
        assertEquals(resultActual, resultReal);
    }

    @Test
    public void arrayWithDataTest(){

        IndexController indexController = new IndexController();
        String[] paramArray = new String[] {"java", "desde" , "0"};
        String resultActual = "param[0]java\n" + "param[1]desde\n" + "param[2]0\n";
        String resultReal = indexController.welcome(paramArray);
        assertEquals(resultActual, resultReal);
    }

}
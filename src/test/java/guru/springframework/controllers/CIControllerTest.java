package guru.springframework.controllers;

import guru.springframework.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CIControllerTest {

    private CIController ciController;

    @Before
    public void setUp() {
        this.ciController = new CIController(new GreetingsServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingsServiceImpl.HELLO_GURUS, ciController.sayHello());
    }

}
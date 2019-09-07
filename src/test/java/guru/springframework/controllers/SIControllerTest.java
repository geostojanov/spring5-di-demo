package guru.springframework.controllers;

import guru.springframework.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SIControllerTest {

    private SIController siController;

    @Before
    public void setUp() {
        this.siController = new SIController();
        siController.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingsServiceImpl.HELLO_GURUS, siController.sayHello());
    }

}
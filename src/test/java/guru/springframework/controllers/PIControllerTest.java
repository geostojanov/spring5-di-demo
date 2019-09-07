package guru.springframework.controllers;

import guru.springframework.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PIControllerTest {

    private PIController piController;

    @Before
    public void setUp() {
        this.piController = new PIController();
        this.piController.greetingsServiceImpl = new GreetingsServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingsServiceImpl.HELLO_GURUS, piController.sayHello());
    }
}
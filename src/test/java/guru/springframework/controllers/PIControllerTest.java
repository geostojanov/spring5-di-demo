package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PIControllerTest {

    private PIController piController;

    @Before
    public void setUp() {
        this.piController = new PIController();
        this.piController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, piController.sayHello());
    }
}
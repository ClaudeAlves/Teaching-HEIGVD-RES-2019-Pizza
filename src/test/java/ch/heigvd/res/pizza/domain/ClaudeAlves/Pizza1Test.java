package ch.heigvd.res.pizza.domain.ClaudeAlves;

import ch.heigvd.res.pizza.protocol.GreetingsRequest;
import ch.heigvd.res.pizza.protocol.GreetingsResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Pizza1Test {

    @Test
    void aPizzaioloShouldReplyToGreetings() {
        Pizza1 mario = new Pizza1();
        GreetingsRequest request = new GreetingsRequest("Hi there");
        GreetingsResponse response = mario.greet(request);
        assertEquals("hello, how can I help you?", response.getText());
    }

}
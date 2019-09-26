package nl.craftsdemo.java13demo;

import org.junit.Test;

public class SwitchExpressionDemo {

    @Test
    public void switchExpressions() {
        System.out.println(switchExpression("hi"));
        System.out.println(switchExpression("hiStart"));
        System.out.println(switchExpression("noHiStart"));
    }

    private String switchExpression(String input) {
        String result = switch (input) {
            case "hi" -> "hiResponse";
            default -> {
                if (input.startsWith("h")) {
                    yield "startsWithH";
                } else {
                    yield "doesNotStartWitH";
                }
            }
        };
        return result;

    }
}

package introduction;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfElse1Test {

    @Test
    public void testOddNumber() {
        String input = "3\n";
        String expectedOutput = "Weird";
        assertEquals(expectedOutput, runTestWithInput(input));
    }

    @Test
    public void testEvenNumberInRange2To5() {
        String input = "4\n";
        String expectedOutput = "Not Weird";
        assertEquals(expectedOutput, runTestWithInput(input));
    }

    @Test
    public void testEvenNumberInRange6To20() {
        String input = "18\n";
        String expectedOutput = "Weird";
        assertEquals(expectedOutput, runTestWithInput(input));
    }

    @Test
    public void testEvenNumberGreaterThan20() {
        String input = "22\n";
        String expectedOutput = "Not Weird";
        assertEquals(expectedOutput, runTestWithInput(input));
    }

    private String runTestWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        IfElse1.main(new String[]{});

        return out.toString().trim();
    }
}
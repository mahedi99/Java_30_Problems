package reverse_text;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Mahedi Hassan
 * 2020-03-31
 */

//Standard jUnit life cycle
class ReverseTextTest {
    private final ReverseText reverseText;

    public ReverseTextTest() {
        System.out.printf("Constructor invoked. Instance: %s%n", this);
        reverseText = new ReverseText();
    }

    @BeforeAll
    public static void beforeClassMethod() {
        System.out.println("@BeforeAll static method invoked.");
    }

    @Test
    public void reverseTextTest() {
        assertEquals("cba", reverseText.reverseText("abc"));
        assertEquals("dcba", reverseText.reverseText("abcd"));
        assertEquals("a", reverseText.reverseText("a"));
        assertTrue(reverseText.reverseText(null).equals(""));
    }

    @BeforeEach
    public void beforeMethod() {
        System.out.printf("@BeforeEach method invoked. Instance: %s%n", this);
    }

    @AfterEach
    public void afterMethod() {
        System.out.printf("@AfterEach method invoked. Instance: %s%n", this);
    }

    @AfterAll
    public static void afterClassMethod() {
        System.out.printf("@AfterAll static method invoked.%n");
    }
}
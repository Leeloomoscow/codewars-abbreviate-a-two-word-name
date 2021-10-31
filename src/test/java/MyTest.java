import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testFixed() {
    assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
    assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
    assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
    assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
    assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
}

    private static class AbbreviateTwoWords {
        public static String abbrevName(String name) {
            return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
        }
    }
}


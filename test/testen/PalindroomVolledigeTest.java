
package testen;

import domein.Palindroom;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PalindroomVolledigeTest
{
    private String palindroom;
    private Palindroom objectPalin;
    private boolean isGoed;
    
    @Before
    public void before()
    {
        objectPalin = new Palindroom();
    }
    
    @Parameters
    public static Collection<String[]> getTestParameters()
    {
        return Arrays.asList(new String[][] {{"1234543212", "false"},{"10012", "false"},{"123456789876543212", "false"},{"tak", "false"},
            {"kot", "false"},{"mol", "false"},{"droom", "false"},{"geef", "false"},{"a12**31a", "false"},{"b1a", "false"},{"APPEL", "false"},
            {"BANAAN", "false"},{"Droom", "false"},{"gEeF", "false"},
            {"123454321", "true"},{"1001", "true"},{"12345678987654321", "true"},{"kok", "true"},{"pap", "true"},{"lol", "true"},
            {"lepel", "true"},{"raar", "true"},{"a12**21a", "true"},{"a1a", "true"},{"LEPEL", "true"},{"RAAR", "true"},{"Lepel", "true"},
            {"rAaR", "true"}});
    }
    
    public PalindroomVolledigeTest(String palin, String status)
    {
        this.palindroom = palin;
        this.isGoed = Boolean.parseBoolean(status);
    }
    
    @Test
    public void isEenSlechtePalindroom()
    {
        Assert.assertEquals(isGoed, objectPalin.isPalindroom(palindroom));
    }
}
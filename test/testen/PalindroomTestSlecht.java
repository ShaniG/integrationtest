
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
public class PalindroomTestSlecht
{
    private String palindroom;
    private Palindroom objectPalin;
    
    @Before
    public void before()
    {
        objectPalin = new Palindroom();
    }
    
    @Parameters
    public static Collection<String[]> getTestParameters()
    {
        return Arrays.asList(new String[][] {{"1234543212"},{"10012"},{"123456789876543212"},{"tak"},{"kot"},{"mol"},
            {"droom"},{"geef"},{"a12**31a"},{"b1a"},{"APPEL"},{"BANAAN"},{"Droom"},{"gEeF"}});
    }
    
    public PalindroomTestSlecht(String palin)
    {
        this.palindroom = palin;
    }
    
    @Test
    public void isEenSlechtePalindroom()
    {
        Assert.assertFalse(objectPalin.isPalindroom(palindroom));
    }
}
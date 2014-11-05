package testen;

import domein.Palindroom;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindroomTest
{
    Palindroom pal;

    @Before
    public void before()
    {
        pal = new Palindroom();
    }

    @Test
    public void testCorrectePalindroom()
    {
        Assert.assertTrue(pal.isPalindroom("12345678987654321"));
    }

    @Test
    public void testIncorrectePalindroom()
    {
        Assert.assertFalse(pal.isPalindroom("zeszes"));
    }
}
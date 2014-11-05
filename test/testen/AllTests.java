package testen;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
{
    testen.PalindroomTestSlecht.class, testen.PalindroomTest.class, testen.PalindroomVolledigeTestMetObjecten.class, testen.PalindroomVolledigeTest.class
})
public class AllTests
{
    
}

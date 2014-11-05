package domein;

public class Palindroom
{
    public boolean isPalindroom(String tekst)
    {
        /*
        if(tekst.matches("([a-zA-Z]|[0-9])*"))
        {
            char[] chars = tekst.toCharArray();
            char[] charsPal = new char[chars.length];
            for (int i = 0; i < chars.length; i++) 
            {
                charsPal[chars.length - 1 - i] = chars[i];
            }
            String pal = new String(charsPal);

            return tekst.equals(pal);
        }
        return false;
        */
        
        StringBuilder builder = new StringBuilder(tekst);
        if(builder.toString().toLowerCase().equals(builder.reverse().toString().toLowerCase()))
            return true;
        return false; 
    }
}
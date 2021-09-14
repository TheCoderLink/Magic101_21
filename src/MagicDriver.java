import java.util.*;
import java.util.ArrayList;

public class MagicDriver
{
    private static int count;

    public static void main(String[] args)
    {
        Bokoblin kyle = new Bokoblin(true, 5);
        count++;
        Bokoblin lenny = new Bokoblin(true, 5);
        count++;
        Dragon luigi = new Dragon(true, 8, 25);
        count++;
        Dragon mario = new Dragon(true, 10, 20);
        count++;
        Talus chair = new Talus(false, Element.ELECTRIC, 40);
        count++;
        Talus table = new Talus(false, Element.FIRE, 29);
        count++;
        Wizzrobe matthew = new Wizzrobe(false, 50);
        count++;
        Wizzrobe william = new Wizzrobe(false, 40);
        count++;

        Enemies[] enemies = {kyle, lenny, luigi, mario, chair, table, matthew, william};

        for(int i = 0; i < enemies.length; i++)
        {
            System.out.println(enemies[i]);
        }

        System.out.println("count: " + count);
    }
}// end of driver

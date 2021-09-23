public class Wizzrobe extends Enemies
{
    private int magicPower;

    public Wizzrobe(boolean hasClaws,  int magicPower)
    {
        super(hasClaws);
        this.magicPower = magicPower;
    }

    public int getMagicPower()
    {
        return magicPower;
    }

    public void setMagicPower(int magicPower)
    {
        this.magicPower = magicPower;
    }

    public void checkMagicPower()
    {
        if(magicPower < 1)
        {
            setMagicPower(11);
        }
    }

    public boolean killWithMagic()
    {
        if(getMagicPower() > 27)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        String output = super.toString();
               output += "This Wizzrobe's magic power stat is " + magicPower;
        return output;
    }
}

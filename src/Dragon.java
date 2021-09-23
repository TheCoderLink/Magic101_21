public class Dragon extends Enemies
{
    //Instance variables
    private int numFangs;
    private int wingSpanLength;

    //Constructor
    public Dragon(boolean hasClaws,
                  int numFangs,
                  int wingSpanLength)
    {
        super(hasClaws);
        this.numFangs = numFangs;
        this.wingSpanLength = wingSpanLength;
    }

    public void checkWingSpan()
    {
        if(wingSpanLength < 1)
        {
            setWingSpanLength(1);
        }
    }

    //getters and setters
    public int getNumFangs()
    {
        return numFangs;
    }

    public int getWingSpanLength()
    {
        return wingSpanLength;
    }

    public void setNumFangs(int numFangs)
    {
        this.numFangs = numFangs;
    }

    public void setWingSpanLength(int wingSpanLength)
    {
        this.wingSpanLength = wingSpanLength;
    }

    //toString
    public String toString()
    {
        String output = super.toString();
        output += "This Dragon has " + numFangs +" fangs, and a wingspan of "
               + wingSpanLength + " feet.";
        return output;
    }
}

public class Bokoblin extends Enemies
{
    //Instance variables
    private int numClaws;

    //Constructor
    public Bokoblin(boolean hasClaws, int numClaws)
    {
        super(hasClaws);
        this.numClaws = numClaws;
    }

    //Getters and Setters
    public int getNumClaws()
    {
        return numClaws;
    }

    public void setNumClaws(int numClaws)
    {
        this.numClaws = numClaws;
    }

    // Brain Methods
    public void checkClaws()
    {
        if(getHasClaws() && numClaws == 0)
        {
            setNumClaws(1);
        }
    }

    //ToString
    public String toString()
    {
        String output = super.toString();
               output += "This Bokoblin has " + numClaws + " claws";
        return output;
    }

}// end of Goblin class

public abstract class Enemies
{
    private boolean hasClaws;

    public Enemies(boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }

    public boolean getHasClaws()
    {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }

    @Override
    public String toString()
    {
        return  "Does this bad boy have claws?: " + hasClaws + "\n";
    }
}

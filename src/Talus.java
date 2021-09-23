enum Element
{
    FIRE, ELECTRIC, ICE
}

public class Talus extends Enemies
{
    private Element element;
    private int height;

    public Talus(boolean hasClaws, Element element, int height) {
        super(hasClaws);
        this.element = element;
        this.height = height;
    }

    public void setElement(Element element)
    {
        this.element = element;
    }

    public Element getElement()
    {
        return element;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    public void checkHeight()
    {
        if(height < 1)
        {
            setHeight(1);
        }
    }

    public String toString()
    {
        String output = super.toString();
        output += "This Talus's element is " + element + ", and it is " + height + " feet tall.";
        return output;
    }
}

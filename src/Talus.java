enum Element
{
    FIRE, ELECTRIC, ICE;
}

public class Golem extends Enemies
{
    private Element element;

    public Golem(boolean hasClaws, Element element) {
        super(hasClaws);
        this.element = element;
    }
}

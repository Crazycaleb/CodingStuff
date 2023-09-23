package Abstract;

public class Chicken extends Animal implements Edible
{
    public String sound()
    {
        return "Chicken: Cluck";
    }
    public String howToEat()
    {
        return "Chicken: Grill it";
    }
}

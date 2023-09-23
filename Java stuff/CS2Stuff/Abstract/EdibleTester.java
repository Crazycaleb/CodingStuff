package Abstract;

public class EdibleTester 
{
    public static void main(String[] args)
    {
        Object[] objs = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        for(Object o : objs)
        {
            if(o instanceof Edible){
                System.out.println(((Edible)o).howToEat());
            }
            
        }
    }
}

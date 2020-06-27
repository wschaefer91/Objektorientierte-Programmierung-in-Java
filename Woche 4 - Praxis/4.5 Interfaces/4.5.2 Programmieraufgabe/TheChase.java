import java.util.LinkedList;

public class TheChase {
    
    LinkedList<Flyable> chasers = new LinkedList<>();
    
    public void chase()
    {
        for(Flyable f : chasers)
        {
            f.fly();
        }
    }

}

public class SuperVillain implements Flyable, Catchable {

    public void fly() {
        System.out.println("Ich fliege mit meinem SuperVillain-Umhang!");
    }
    
    public void tryToCatch(boolean b)
    {
        if(b == true)
        {
            System.out.println("Eike Vil fängt Paco");
        }
        else
        {
            System.out.println("Eike Vil fängt Paco nicht");
        }
    }

}


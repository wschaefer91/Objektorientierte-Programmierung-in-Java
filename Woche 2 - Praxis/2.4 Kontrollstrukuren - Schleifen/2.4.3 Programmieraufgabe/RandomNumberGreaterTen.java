class RandomNumberGreaterTen {

    RandomNumber rand = new RandomNumber();
    
    int zahl = 0;
    
    int greaterTen()
    {
        
        do
        {
            
            int zahl = rand.giveNumber();
            
        } while (zahl <= 10);
        
        return zahl;
    }
    
}

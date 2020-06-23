class DecodeRobot {
    
    public void tap(String input, int numberOutputLines)
    {
        for(int i = 0; i < numberOutputLines; i++)
        {
            System.out.println(input);
        }
    }
    
    public void tap(String input)
    {
        tap(input, 3);
    }


}

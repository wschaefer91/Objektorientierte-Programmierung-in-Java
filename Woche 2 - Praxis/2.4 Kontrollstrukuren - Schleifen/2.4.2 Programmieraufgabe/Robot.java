class Robot {
    String sentence = "Ich kann sprechen!";
    RandomNumber rand = new RandomNumber();
    
    void speakSeveralTimes(int number)
    {
        for(int i = 1; i <= number; i++)
        {
            System.out.println(sentence);
        }
    }
    
    void speak()
    {
        speakSeveralTimes(rand.giveNumber());
    }

}

class Robot {
    String[] clues = {"Boesewicht mag keine Papageien.", "Boesewicht kennt sich mit Computern aus.", 
                        "E-Mail-Adresse des Boesewichts."};
                        
    
    String giveClue(int stelle)
    {
        return clues[stelle];
    }
    
    void printClues()
    {
        for(int i = 0; i < clues.length; i++)
        {
            System.out.println(giveClue(i));
        }
    }


}

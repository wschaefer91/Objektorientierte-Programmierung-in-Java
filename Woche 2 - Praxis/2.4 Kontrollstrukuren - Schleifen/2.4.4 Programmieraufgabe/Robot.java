class Robot {
    EncryptedEMail encryptedEMail = new EncryptedEMail();
    
    void decryptSender()
    {
        
        for(int i = 0; i < 4; i++)
        {
            
            for(int j = 0; j < 28; j++)
            {
                
                System.out.print(encryptedEMail.decryptChar(i, j));
                
            }
            
            System.out.println();
            
        }
        
    }


}

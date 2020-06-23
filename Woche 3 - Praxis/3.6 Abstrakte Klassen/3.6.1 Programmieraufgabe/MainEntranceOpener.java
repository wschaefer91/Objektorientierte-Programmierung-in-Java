class MainEntranceOpener extends AbstractOpener {
    
    @Override
    public boolean open(String type)
    {
        if(type.equals("MainEntrance"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

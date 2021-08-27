public class MammalBat extends MammalClass{
    public void showEnergy()
    {
        int energyLevel=getEnergyLevel();
        System.out.println("The bats's current energy level: "+energyLevel);
    }
    public void fly()
    {
        System.out.println("The bat has flied away, decreasing its energy by 50");
        int energyLevel=getEnergyLevel()-50;
        setEnergyLevel(energyLevel);
    }
    public void eatHumans()
    {
        System.out.println("The bat has eaten a human, increasing its energy by 25");
        int energyLevel=getEnergyLevel()+25;
        setEnergyLevel(energyLevel);
    }
    public void attackTown()
    {
        System.out.println("The bat attacked the town and its burning, decreasing its energy by 100");
        int energyLevel=getEnergyLevel()-100;
        setEnergyLevel(energyLevel);
    }
}

public class PhoneGalaxy extends PhoneClass implements PhoneRingable {
   
    public PhoneGalaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        // your code here
        return "Unlocked Via Finger Scanner";
    }
    @Override
    public void displayInfo() {
        // your code here   
        System.out.println("Galaxy "+this.getVersion());     
        System.out.println("Galaxy "+this.getRingTone());         
        System.out.println("Galaxy "+this.getCarrier());         
        System.out.println("Galaxy "+this.getBattery());             
    }
}

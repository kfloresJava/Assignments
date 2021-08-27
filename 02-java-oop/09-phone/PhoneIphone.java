public class PhoneIphone extends PhoneClass implements PhoneRingable{
    public PhoneIphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
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
        return "Unlocked Via Facial Recognition";
    }
    @Override
    public void displayInfo() {
        // your code here   
        System.out.println("Iphone "+this.getVersion());     
        System.out.println("Iphone "+this.getRingTone());         
        System.out.println("Iphone "+this.getCarrier());         
        System.out.println("Iphone "+this.getBattery());             
    }
}

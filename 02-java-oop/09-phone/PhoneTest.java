public class PhoneTest {
    public static void main(String[]args)
    {
        PhoneIphone g20 = new PhoneIphone("G20x", 55, "hardfull", "ZZZAAAAAppp");
        PhoneGalaxy Fss24 = new PhoneGalaxy("Fss24", 60, "Mechanicus", "Tiiiii beepss");        

        Fss24.displayInfo();
        System.out.println(Fss24.ring());
        System.out.println(Fss24.unlock());
        g20.displayInfo();
        System.out.println(g20.ring());
        System.out.println(g20.unlock());
    }
}

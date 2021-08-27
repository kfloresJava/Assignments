public abstract class PhoneClass {
        private String versionNumber;
        private int batteryPercentage;
        private String carrier;
        private String ringTone;

        public PhoneClass(String versionNumber, int batteryPercentage, String carrier, String ringTone){
            this.versionNumber = versionNumber;
            this.batteryPercentage = batteryPercentage;
            this.carrier = carrier;
            this.ringTone = ringTone;
        }
        // abstract method. This method will be implemented by the subclasses
        public abstract void displayInfo();
        // getters and setters removed for brevity. Please implement them yourself

        public String getVersion()
        {
            return this.versionNumber;
        }
        public void setVersion(String nVersion)
        {
            this.versionNumber=nVersion ;
        }
        public int getBattery()
        {
            return this.batteryPercentage;
        }
        public void setBattery(int battery)
        {
            this.batteryPercentage=battery ;
        }

        public String getCarrier()
        {
            return this.carrier;
        }
        public void setCarrier(String nCarrier)
        {
            this.carrier=nCarrier ;
        }

        public String getRingTone()
        {
            return this.ringTone;
        }
        public void setRingTone(String nRingTone)
        {
            this.ringTone=nRingTone ;
        }
}

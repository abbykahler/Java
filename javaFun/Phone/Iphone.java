public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Iphone " + this.getVersionNumber() + "ring ring";
    }
    @Override
    public String unlock() {
        return "Unlocking phone";
    }
    @Override
    public void displayInfo() {
    System.out.println("Iphone " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}

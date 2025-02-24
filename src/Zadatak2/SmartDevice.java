package Zadatak2;

public abstract class SmartDevice implements RemoteControllable{
    abstract void performAction(String action);
    abstract void displayStatus();

    private String version;

    public String getVersion() {
        return version;
    }

    public void updateFirmware(String version) {
        this.version = version;
        /*"verziju firmvera uređaja.
            koja ažurira*/
    }
}

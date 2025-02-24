package Zadatak2;

// može puštati glazbu, podešavati glasnoću
public class SmartSpeaker extends SmartDevice {
    private float volume = 1.0f;
    private boolean isTurnedOn = false;

    @Override
    public void remoteControl(String command) {

    }

    @Override
    void performAction(String action) {
        switch (action) {
            case "On": {
                this.isTurnedOn = true;
                break;
            }
            case "Off": {
                this.isTurnedOn = false;
                break;
            }
            case "-": {
                volume--;
                break;
            }
            case "+": {
                volume++;
                break;
            }
        }
    }

    @Override
    void displayStatus() {
        System.out.println("Speaker is " + (isTurnedOn? "On" : "Off") +" and volume is " +volume+" version: " + getVersion());
    }
}

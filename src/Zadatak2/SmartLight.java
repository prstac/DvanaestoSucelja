package Zadatak2;
//(može se uključiti/isključiti, podešavati svjetlinu)
public class SmartLight extends SmartDevice {
    private boolean isTurnedOn = false;
    private float brighntess = 1.0f;
    @Override
    public void remoteControl(String command) {
        performAction(command);
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
                brighntess-=0.1f;
                break;
            }
            case "+": {
                brighntess+=0.1f;
                break;
            }
        }
    }

    @Override
    void displayStatus() {
        System.out.println("Light is " + (isTurnedOn?"On" : "Off") + " and brighntess is " + brighntess);
    }
}

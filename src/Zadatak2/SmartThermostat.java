package Zadatak2;

import java.util.stream.DoubleStream;

// može postaviti temperaturu, prikazati trenutnu temperaturu
public class SmartThermostat extends SmartDevice {
    private double temperature = 20;

    @Override
    public void remoteControl(String command) {
        performAction(command);
    }

    @Override
    void performAction(String action) {
        try {
            temperature = Double.parseDouble(action);
        } catch(NumberFormatException e){
            if (action.equals("Show")) {
                System.out.println("Temperature is: " + temperature);
            }
        }

    }

    @Override
    void displayStatus() {
        System.out.println("Temperature is : " + temperature +" version: " + getVersion());
    }
}

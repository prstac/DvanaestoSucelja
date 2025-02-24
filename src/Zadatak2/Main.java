package Zadatak2;

public class Main {
    public static void main(String[] args) {
        /*Kreirajte objekte svakog pametnog uređaja.
Izvršite akcije, prikažite njihov status i daljinski ih kontrolirajte.
Ažurirajte firmver svakog uređaja i prikažite ažurirani status.*/
        var termostat = new SmartThermostat();
        var speaker = new SmartSpeaker();
        var light = new SmartLight();

        termostat.displayStatus();
        termostat.performAction("25");
        termostat.performAction("Show");
        termostat.remoteControl("26");
        termostat.displayStatus();
        speaker.displayStatus();
        speaker.performAction("On");
        speaker.performAction("+");
        speaker.remoteControl("+");
        speaker.displayStatus();
        light.displayStatus();
        light.performAction("On");
        light.performAction("-");
        light.remoteControl("-");
        light.displayStatus();
    }
}

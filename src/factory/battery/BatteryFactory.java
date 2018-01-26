package factory.battery;

public class BatteryFactory {

    // Заметь, везде где только можно возвращается интерфейс!
    public Battery getBattery() {
        return new ChinaBattery();
    }

}
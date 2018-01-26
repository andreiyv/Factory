package factory.flashlight;

import factory.battery.BatteryFactory;

public class FlashLightFactory {

    // простая фабрика знает, какой фонарик и какую батарейку использовать
    // но возвращает интерфейс!
    public Flashlight getFlashlight() {
        return new SomeFlashlight(new BatteryFactory().getBattery());
    }

}
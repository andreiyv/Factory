package factory.flashlight;
import factory.battery.Battery;

// Класс защищен потому что мы не хотим, чтобы кто-то из другого пакета
// вызывал его. Только фабрика, которая находится в том же пакете.
class SomeFlashlight implements Flashlight {

    private Battery battery;
    private boolean swithOn;

    SomeFlashlight(Battery battery) {
        this.swithOn = false;
        this.battery = battery;
    }

    @Override
    public boolean isShines() {
        return (battery != null) && swithOn;
    }

    @Override
    public void swithOn() {
        if (!swithOn && battery != null) {
            swithOn = battery.getVoltage();
        }
    }

    @Override
    public void swithOff() {
        swithOn = false;
    }
}
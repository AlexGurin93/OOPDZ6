package task1;

import task1.Unlocker;

public class PinUnlocker implements Unlocker {
    private int pin;

    public PinUnlocker(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlock() {
        System.out.println(pin);
    }

}
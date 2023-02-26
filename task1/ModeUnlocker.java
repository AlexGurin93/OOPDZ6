package task1;

import task1.Unlocker;

public class ModeUnlocker implements Unlocker {
    private int mode;

    public ModeUnlocker(int mode) {
        this.mode = mode;
    }

    @Override
    public void unlock() {
        System.out.println(mode);
    }

}
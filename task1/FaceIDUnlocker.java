package task1;

import task1.Unlocker;

public class FaceIDUnlocker implements Unlocker {
    private String faceID;

    public FaceIDUnlocker(String faceID) {
        this.faceID = faceID;
    }

    @Override
    public void unlock() {
        System.out.println(faceID);
    }

}
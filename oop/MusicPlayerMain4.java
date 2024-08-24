package oop;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayerObjectData data = new MusicPlayerObjectData();


        data.on();

        data.volumeUp();
        data.volumeUp();

        data.volumeDown();

        data.showStatus();


        data.off();

        data.showStatus();
    }
}

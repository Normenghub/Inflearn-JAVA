package oop;

public class MusicPlayerObjectData {
    boolean isOn = false;
    int volume = 0;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어가 활성화 되었습니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어가 비활성화 되었습니다.");
    }
    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void showStatus(){
        if(isOn){
            System.out.println("음악 플레이어가 켜져있습니다.");
            System.out.println("Volume:" + volume);
        }else{
            System.out.println("음악 플레이어가 꺼져있습니다.");
        }
    }
}

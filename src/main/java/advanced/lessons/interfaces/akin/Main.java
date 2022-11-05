package advanced.lessons.interfaces.akin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AppleTVRemoteController apple = new AppleTVRemoteController();
        apple.powerOn();
        apple.volumeUp();
        apple.volumeDown();
        apple.powerOff();

        SamsungTVRemoteController samsung = new SamsungTVRemoteController();
        samsung.powerOn();
        samsung.volumeUp();
        samsung.volumeDown();
        samsung.powerOff();

        //interfacename variableName = new ClassNameWhichImplementsThisInterface
        RemoteController remoteController = new AppleTVRemoteController();
        remoteController.powerOn();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();


    }
}

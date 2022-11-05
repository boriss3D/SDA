package advanced.lessons.interfaces.boriss;

public class Main {
    public static void main(String[] args) {
        SamsungTVRemoteController samsungTVRemoteController = new SamsungTVRemoteController();
        samsungTVRemoteController.powerOn();
        samsungTVRemoteController.powerOff();
        samsungTVRemoteController.volumeUp();
        samsungTVRemoteController.volumeDown();

        AppleTVRemoteController appleTVRemoteController = new AppleTVRemoteController();
        appleTVRemoteController.powerOn();
        appleTVRemoteController.powerOff();
        appleTVRemoteController.volumeUp();
        appleTVRemoteController.volumeDown();
    }
}

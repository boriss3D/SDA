package advanced.lessons.interfaces.akin;

public class SamsungTVRemoteController implements RemoteController {
    @Override
    public void powerOn() {
        System.out.println("Samsung TV power on");
    }

    @Override
    public void powerOff() {
        System.out.println("Samsung TV power off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Samsung TV volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Samsung TV volume down");
    }
}

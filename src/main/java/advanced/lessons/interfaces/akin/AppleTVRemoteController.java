package advanced.lessons.interfaces.akin;

public class AppleTVRemoteController implements RemoteController {
    @Override
    public void powerOn() {
        System.out.println("Apple TV power on");
    }

    @Override
    public void powerOff() {
        System.out.println("Apple TV power off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Apple TV volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Apple TV volume down");
    }
}

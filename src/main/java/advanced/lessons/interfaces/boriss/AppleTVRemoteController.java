package advanced.lessons.interfaces.boriss;

public class AppleTVRemoteController implements RemoteController {
    @Override
    public void powerOn() {
        System.out.println("Apple powerOn");
    }

    @Override
    public void powerOff() {
        System.out.println("Apple powerOff");
    }

    @Override
    public void volumeUp() {
        System.out.println("Apple volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("Apple volumeDown");
    }
}

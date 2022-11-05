package advanced.lessons.interfaces.boriss;

public class SamsungTVRemoteController implements RemoteController {
    @Override
    public void powerOn() {
        System.out.println("Samsung powerOn");
    }

    @Override
    public void powerOff() {
        System.out.println("Samsung powerOff");
    }

    @Override
    public void volumeUp() {
        System.out.println("Samsung volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("Samsung volumeDown");
    }
}

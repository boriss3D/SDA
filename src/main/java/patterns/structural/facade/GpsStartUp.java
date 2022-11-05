package patterns.structural.facade;

public class GpsStartUp {
    private final GpsOn gpsOn;
    private final GpsTrafficInfoService gpsTrafficInfo;
    private final GpsRouteBuilder gpsRouteBuilder;

    public GpsStartUp(GpsOn gpsOn, GpsTrafficInfoService gpsTrafficInfo, GpsRouteBuilder gpsRouteBuilder) {
        this.gpsOn = gpsOn;
        this.gpsTrafficInfo = gpsTrafficInfo;
        this.gpsRouteBuilder = gpsRouteBuilder;
    }

    public void start() {
        gpsOn.turnOn();
        gpsTrafficInfo.getTraffic();
        gpsRouteBuilder.build();
    }
}

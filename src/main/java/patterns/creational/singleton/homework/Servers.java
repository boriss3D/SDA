package patterns.creational.singleton.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Servers {
    private static Servers instance;
    private List<String> listOfServers;

    private Servers() {}

    public static Servers getInstance() {
        if (instance == null) {
            instance = new Servers();
            instance.listOfServers = new ArrayList<>();
        }
        return instance;
    }

    public boolean addServer(String server) {
        Pattern pattern = Pattern.compile("^(https?)://.*$");
        Matcher matcher = pattern.matcher(server);
        if (!matcher.matches() || instance.listOfServers.contains(server)) {
            return false;
        }
        instance.listOfServers.add(server);
        return true;
    }

    public List<String> getHttp() {
        Pattern pattern = Pattern.compile("^(http)://.*$");
        return instance.listOfServers.stream()
                .filter(server -> pattern.matcher(server).matches()).toList();
    }

    public List<String> getHttps() {
        Pattern pattern = Pattern.compile("^(https)://.*$");
        return instance.listOfServers.stream()
                .filter(server -> pattern.matcher(server).matches()).toList();
    }
}

package patterns.exercises.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Servers {

    INSTANCE;

    private final List<String> listOfServers = new ArrayList<>();

    public boolean addServer(String server) {
        Pattern pattern = Pattern.compile("^(https?)://.*$");
        Matcher matcher = pattern.matcher(server);
        if (!matcher.matches() || INSTANCE.listOfServers.contains(server)) {
            return false;
        }
        INSTANCE.listOfServers.add(server);
        return true;
    }

    public List<String> getHttp() {
        Pattern pattern = Pattern.compile("^(http)://.*$");
        return INSTANCE.listOfServers.stream()
                .filter(server -> pattern.matcher(server).matches()).toList();
    }

    public List<String> getHttps() {
        Pattern pattern = Pattern.compile("^(https)://.*$");
        return INSTANCE.listOfServers.stream()
                .filter(server -> pattern.matcher(server).matches()).toList();
    }
}

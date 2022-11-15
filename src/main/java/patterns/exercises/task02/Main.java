package patterns.exercises.task02;

import java.util.Arrays;

public class Main {
    static Servers servers;
    public static void main(String[] args) {
        servers = Servers.getInstance();

        addNewServerLink("https://github.com");
        addNewServerLink("abc");
        addNewServerLink("https://java.en.sdacademy.pro");
        addNewServerLink("https://java.en.sdacademy.pro");
        addNewServerLink("http://local");

        System.out.println("https -> " + Arrays.toString(servers.getHttps().toArray()));
        System.out.println("http -> " + Arrays.toString(servers.getHttp().toArray()));
    }

    public static void addNewServerLink(String link) {
        if(servers.addServer(link)) {
            System.out.println(link + " added to the server list");
        } else {
            System.out.println("Wrong link format or already in the list");
        }
    }
}

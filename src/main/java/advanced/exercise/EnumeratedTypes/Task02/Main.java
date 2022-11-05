package advanced.exercise.EnumeratedTypes.Task02;

public class Main {
    public static void main(String[] args) {
        PackageSize package01 = PackageSize.getPackageSize(25, 29);
        System.out.println("PackageSize -> " + package01.name());

        PackageSize package02 = PackageSize.getPackageSize(999, 99999);
        System.out.println("PackageSize -> " + package02.name());
    }
}

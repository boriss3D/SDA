package advanced.exercise.EnumeratedTypes.Task02;

public enum PackageSize {
    SMALL(0, 10),
    MEDIUM(11, 19),
    LARGE(20, 100),
    NOPACK(-1, -1);

    private final int minSize;
    private final int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int minSize, int maxSize) {
        if (minSize >= PackageSize.SMALL.minSize && maxSize <= PackageSize.SMALL.maxSize) {
            return PackageSize.SMALL;
        } else if (minSize >= PackageSize.MEDIUM.minSize && maxSize <= PackageSize.MEDIUM.maxSize) {
            return PackageSize.MEDIUM;
        } else if (minSize >= PackageSize.LARGE.minSize && maxSize <= PackageSize.LARGE.maxSize) {
            return PackageSize.LARGE;
        } else {
            return PackageSize.NOPACK;
        }
    }
}
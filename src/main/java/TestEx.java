import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestEx {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "Z");
        System.out.println(list);
        List<String> listSorted = softList(list);
        System.out.println(listSorted);
    }

    public static List<String> softList(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.sort(Comparator.reverseOrder());

        return List.copyOf(arrayList);
    }
}

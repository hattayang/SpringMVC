import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by HattaYang on 2021-04-24.
 */
public class MainTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        Stream<String> list1 = list.stream();
        List<String> list4 = list1.filter(x -> "3333".equals(x)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
        list4.forEach(System.out::println);

        String[] strings = new String[3];

        strings[0] = "11111";
        strings[1] = "22222";
        strings[2] = "33333";
        Stream<String> list2 = Stream.of(strings);
        List<String> list3 = list2.filter(x -> "33333".equals(x)).collect(Collectors.toList());
        list3.forEach(System.out::println);


    }

    private int method(LabTest labTest) {
        Cook.chao("鸡");
        //cook.c
        int i = labTest.sum(10, 100);
        return i;
    }
}

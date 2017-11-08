
import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

public class Code2_10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jerry");
        names.add("William");
        names.add("Bob");

        Observable<String> source = Observable.fromIterable(names);
        source.subscribe(System.out::println);
    }
}

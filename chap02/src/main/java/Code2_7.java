import io.reactivex.Observable;

public class Code2_7 {
    public static void main(String[] args) {
        Integer[] arr = { 100, 200, 300 };
        Observable<Integer> source = Observable.fromArray(arr);
        source.subscribe(System.out::println);
    }
}

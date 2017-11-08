import io.reactivex.Observable;

public class Code2_1 {
    public void emit() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        Code2_1 demo = new Code2_1();
        demo.emit();
    }
}
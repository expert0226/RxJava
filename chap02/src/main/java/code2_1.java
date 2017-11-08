import io.reactivex.Observable;

public class code2_1 {
    public void emit() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        code2_1 demo = new code2_1();
        demo.emit();
    }
}
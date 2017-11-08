import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

public class code2_3 {
    public static void main(String[] args) {
        Observable<Integer> source = Observable.create(
                (ObservableEmitter<Integer> emitter) -> {
                    emitter.onNext(100);
                    emitter.onNext(200);
                    emitter.onNext(300);
                    emitter.onComplete();
                }
        );

        source.subscribe(System.out::println);
    }
}

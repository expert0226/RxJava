

import io.reactivex.Observable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Code2_12 {
    public static void main(String[] args) {
        BlockingQueue<Order> orderQueue = new ArrayBlockingQueue<>();

        orderQueue.add(new Order("ORD-1"));
        orderQueue.add(new Order("ORD-2"));
        orderQueue.add(new Order("ORD-3"));

        Observable<Order> source = Observable.fromIterable(orderQueue);

        source.subscribe(order -> System.out.println(order.getId()));
    }

    private static class Order {
        private String id;

        public Order(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }
}

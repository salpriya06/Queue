
public class Main {
    public static void main(String[] args) {

        Queue queue = Queue.getInstance();

         queue.enqueue(90);
         queue.enqueue(89);
         queue.enqueue(78);
         queue.enqueue(74);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();

    }
}
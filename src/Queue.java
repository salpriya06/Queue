public class Queue {

    private static Queue queue;

    private static int rear;
    private static int front;
    private static int []arr;
   private static int  size;

    private Queue(int size){
        rear = -1;
       // front = -1;
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull(){

        return rear == size - 1;
    }

    public static boolean isEmpty(){

        return rear == -1;
    }

    public boolean enqueue(int data){
        if(isFull()){
            return false;
        }else{
            arr[++rear] = data;
        }
        return true;

    }

    public int dequeue(){
        if(isEmpty()){
            return 0;
        }
        front = arr[0];

        for (int i = 0; i <= rear - 1; i++){

            arr[i] = arr[i+1];
        }
        rear --;
        return front;
    }

    public void display(){
        for (int i = 0; i <= rear; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public static Queue getInstance(){

        if(queue == null){
            queue = new Queue(5);
        }
            return queue;
    }
}



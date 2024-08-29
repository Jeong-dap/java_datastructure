import javax.xml.bind.SchemaOutputResolver;

public class Queue_2 {
    public static void main(String[] args) {
        class CircleQueue{
            int MAX = 1000;
            int front;
            int rear;
            int [] Cqueue;
            public CircleQueue() {
                front = rear = 0;
                Cqueue = new int[MAX];
            }
            public boolean CqueueisEmpty() {
                return front == rear;
            }
            public boolean CqueueisFull() {
                if (((rear + 1) % MAX) == front) {
                    System.out.println("Circlear Queue is Full!");
                    return true;
                }
                else {
                    return false;
                }
            }
            public void push(int value) {
                if (CqueueisFull()) {
                    System.out.println("Cqueue is Full!");
                    return;
                }
                Cqueue[rear++] = value;
            }
            public int pop() {
                if (CqueueisEmpty()) {
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                int popValue = Cqueue[front++];
                return popValue;
            }
            public int peek() {
                if (CqueueisEmpty()) {
                    System.out.println("Cqueue is Empty!");
                    return -1;
                }
                int popValue = Cqueue[front];
                return popValue;
            }
        }
    }
}

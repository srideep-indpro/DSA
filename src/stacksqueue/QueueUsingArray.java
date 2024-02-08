package stacksqueue;

import java.util.Arrays;

public class QueueUsingArray {
    private int capacity;
    private int front, rear;
    private int count;
    private int[] arr;

    QueueUsingArray() {
        this.capacity = 5;
        this.front = -1;
        this.rear = -1;
        this.count = 0;
        arr = new int[capacity];
    }

    @Override
    public String toString() {
        return "QueueUsingArray{" + "capacity=" + capacity + ", front=" + front + ", rear=" + rear + ", count=" + count + ", arr=" + Arrays.toString(arr) + '}';
    }

    void push(int item) throws Exception {
//        if (count == capacity) throw new Exception("Queue full");
        if ((rear + 1) % capacity == front) throw new Exception("Queue full");
        if (front == -1 && rear == -1) {
            front = rear = 0;
            arr[rear] = item;
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = item;
        }
    }

    // Check if the queue is empty
    boolean isEmpty() {
        return  front == -1;
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front = (front + 1) % capacity;
            }
            System.out.println(element);
            return (element);
        }
    }

    public static void main(String[] args) throws Exception {
        QueueUsingArray q = new QueueUsingArray();
        q.push(5);
        q.push(6);
        q.push(7);
        q.push(8);
        q.push(9);

        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
//        q.deQueue();
//        q.pop();
        System.out.println(q.toString());
    }
}

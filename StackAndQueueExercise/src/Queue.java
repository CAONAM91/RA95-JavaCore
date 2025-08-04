public class Queue {
    private int front, rear, capacity, currentSize;
    static final int MAXSIZE = 10;
    String queue[] = new String[MAXSIZE];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = -1;
        currentSize = 0;
        queue = new String[this.capacity];
    }

    public boolean isEmpty() {
        if (currentSize == 0) {
            return true;
        }

        return false;

    }

    public boolean isFull() {
        if (currentSize == capacity) {
            return true;
        }

        return false;
    }

    public boolean enQueue(String item) {
        if (!isFull()) {
            ++rear;
            queue[rear] = item;
            currentSize++;
            return true;
        } else {
            System.out.println("Da day, khong the them");
            return false;
        }
    }

    public String deQueue() {
        if (!isEmpty()) {
            currentSize--;
            return queue[front++];

        } else {
            System.out.println("Mang rong, ko co phan tu");
            return null;
        }
    }

    public StringBuilder print() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= rear; i++) {
            sb.append(queue[i]);
            if (i < rear) {
                sb.append(", ");
            } else {
                sb.append("]");
            }
        }
        return sb;
    }
}

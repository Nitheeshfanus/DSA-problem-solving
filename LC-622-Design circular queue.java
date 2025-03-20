class MyCircularQueue {
    int[] que;
    int front;
    int rear;
    int size;

    public MyCircularQueue(int k) {
        que = new int[k];
        front = -1;
        rear = -1;
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        que[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return true;

    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return que[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return que[rear];
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (front == (rear + 1) % size) {
            return true;
        }
        return false;
    }
}

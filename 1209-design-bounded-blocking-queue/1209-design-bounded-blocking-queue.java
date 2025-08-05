class BoundedBlockingQueue {
    private Semaphore s1;
    private Semaphore s2;
    private Deque<Integer> dq = new ArrayDeque<>();

    public BoundedBlockingQueue(int capacity) {
        s1 = new Semaphore(capacity);
        s2 = new Semaphore(0);
    }
    
    public void enqueue(int element) throws InterruptedException {
        s1.acquire();
        dq.offer(element);
        s2.release();
    }
    
    public int dequeue() throws InterruptedException {
        s2.acquire();
        s1.release();
        return dq.poll();
    }
    
    public int size() {
        return dq.size();
    }
}
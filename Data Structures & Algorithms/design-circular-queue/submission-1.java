class ListNode
{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

class MyCircularQueue {

    int size;
    ListNode left;
    ListNode right;

    public MyCircularQueue(int k) {
        this.size = k;
        this.left = new ListNode(0);
        this.right = this.left;    
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        ListNode curr = new ListNode(value);

        if(isEmpty()){
            this.left.next = curr;
            this.right = curr;
        }
        else {
            this.right.next = curr;
            this.right = curr;
        }
        this.size--;
        return true;

    }
    
    public boolean deQueue() {
        if( isEmpty()) return false;

        this.left.next = this.left.next.next;

        if(this.left.next == null)
        {
            this.right = this.left;
        }

        this.size++;
        return true;
    }
    
    public int Front() {
        return isEmpty()? -1: this.left.next.val;
    }
    
    public int Rear() {
        return isEmpty()? -1: this.right.val;

    }
    
    public boolean isEmpty() {
        return this.left.next == null;
    }
    
    public boolean isFull() {
        return this.size ==0;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
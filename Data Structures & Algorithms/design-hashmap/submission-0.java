class MyHashMap {
    int[] ar;
    public MyHashMap() {
        ar = new int [1000001];
        Arrays.fill(ar,-1);
    }
    
    public void put(int key, int value) {
        ar[key]= value;
    }
    
    public int get(int key) {
        return ar[key];
    }
    
    public void remove(int key) {
        ar[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
class Solution {
    public int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> r = new Stack<Integer>();
        for(String c : operations){
            if(c.equals("+")){
                int a = r.pop();
                int b = a + r.peek();
                r.push(a);
                r.push(b);
            }
            else if(c.equals("D")){
                r.push(2*r.peek());
            }
            else if(c.equals("C")){
                r.pop();
            }
            else {
                r.push(Integer.parseInt(c));
            }
        }
        for(int s : r) {
            res +=s;
        }
        return res;
    }
}
class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] sp = path.split("/");

        for(String a: sp) {
            if(a.equals("..")) {
                if(!s.isEmpty()) s.pop();
            }
            else if(!a.equals("") && !a.equals("."))
            {
                s.push(a);
            }
        }

        return "/" + String.join("/", s);

    }
}
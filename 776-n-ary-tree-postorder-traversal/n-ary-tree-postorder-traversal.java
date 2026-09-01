/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Stack<Node> rev = new Stack<>();
        
        if(root == null)
        {
            return ans;
        }
        st.push(root);
        while(!st.isEmpty())
        {
            Node curr = st.pop();
            rev.push(curr);

            for (Node ch : curr.children)
            {
                st.push(ch);
            }
        }
        while(!rev.isEmpty())
        {
            ans.add(rev.pop().val);
        }
        return ans;
    }
}
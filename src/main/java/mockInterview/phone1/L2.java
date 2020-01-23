package mockInterview.phone1;

public class L2 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        cc(root.left,root.right);
        return root;
    }

    public void cc(Node left,Node right){
        if(left==null)return ;
        cc(left.left,left.right);
        cc(right.left,right.right);
        right.next=null;

        while (left!=null){
            left.next=right;
            left=left.right;
            right=right.left;
        }

    }
}

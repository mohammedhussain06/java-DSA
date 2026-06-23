import java.util.*;

public class TopView {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd;
        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
            if (root == null) {
                return;
            }
            Queue<Info> q = new java.util.LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min = 0, max = 0;
            q.add(new Info(root, 0));
            q.add(null);
            while (!q.isEmpty()) {
                Info currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(currNode.hd)) {
                        map.put(currNode.hd, currNode.node);
                    }
                    if (currNode.node.left != null) {
                            q.add(new Info(currNode.node.left, currNode.hd - 1));
                        }
                    if (currNode.node.right != null) {
                            q.add(new Info(currNode.node.right, currNode.hd + 1));
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topView(root); 
    }
}

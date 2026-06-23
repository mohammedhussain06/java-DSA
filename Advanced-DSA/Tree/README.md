# 🌳 Tree Data Structure - Java Cheat Sheet

## 📌 What is a Tree?

A Tree is a hierarchical data structure consisting of nodes connected by edges.

Example:

        10
       /  \
      20   30
     / \
    40 50

---

## 📖 Terminology

| Term | Description |
|--------|------------|
| Root | Topmost node |
| Parent | Node having children |
| Child | Node connected below parent |
| Leaf Node | Node with no children |
| Sibling | Nodes with same parent |
| Edge | Connection between nodes |
| Height | Longest path from root to leaf |
| Depth | Distance from root |

---

## 📌 Types of Trees

### 1. Binary Tree
Each node has at most 2 children.

### 2. Binary Search Tree (BST)
Left < Root < Right

### 3. AVL Tree
Self-balancing BST.

### 4. Heap
Complete Binary Tree.

### 5. Trie
Stores strings efficiently.

---

# 🌳 Binary Tree Node Implementation

```java
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
```

---

# 🌳 Create Tree

```java
public class BinaryTree {

    Node root;

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
    }
}
```

---

# 🌳 Tree Traversals

## 1. Inorder (LNR)

Left → Root → Right

```java
void inorder(Node root) {
    if(root == null)
        return;

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
```

Output:

```
40 20 50 10 30
```

---

## 2. Preorder (NLR)

Root → Left → Right

```java
void preorder(Node root) {
    if(root == null)
        return;

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
```

Output:

```
10 20 40 50 30
```

---

## 3. Postorder (LRN)

Left → Right → Root

```java
void postorder(Node root) {
    if(root == null)
        return;

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}
```

Output:

```
40 50 20 30 10
```

---

# 🌳 Level Order Traversal (BFS)

Uses Queue

```java
import java.util.*;

void levelOrder(Node root) {

    Queue<Node> q = new LinkedList<>();

    q.add(root);

    while(!q.isEmpty()) {

        Node temp = q.poll();

        System.out.print(temp.data + " ");

        if(temp.left != null)
            q.add(temp.left);

        if(temp.right != null)
            q.add(temp.right);
    }
}
```

Output:

```
10 20 30 40 50
```

---

# 🌳 Binary Search Tree (BST)

## Insertion

```java
Node insert(Node root, int value) {

    if(root == null)
        return new Node(value);

    if(value < root.data)
        root.left = insert(root.left, value);

    else if(value > root.data)
        root.right = insert(root.right, value);

    return root;
}
```

---

## Search

```java
boolean search(Node root, int key) {

    if(root == null)
        return false;

    if(root.data == key)
        return true;

    if(key < root.data)
        return search(root.left, key);

    return search(root.right, key);
}
```

---

# 🌳 Find Height of Tree

```java
int height(Node root) {

    if(root == null)
        return 0;

    return 1 + Math.max(
        height(root.left),
        height(root.right)
    );
}
```

Time Complexity:

```
O(n)
```

---

# 🌳 Count Nodes

```java
int countNodes(Node root) {

    if(root == null)
        return 0;

    return 1 +
           countNodes(root.left) +
           countNodes(root.right);
}
```

---

# 🌳 Count Leaf Nodes

```java
int countLeaves(Node root) {

    if(root == null)
        return 0;

    if(root.left == null &&
       root.right == null)
        return 1;

    return countLeaves(root.left)
         + countLeaves(root.right);
}
```

---

# 🌳 Time Complexities

| Operation | Binary Tree | BST |
|------------|------------|------|
| Search | O(n) | O(log n) Avg |
| Insert | O(n) | O(log n) Avg |
| Delete | O(n) | O(log n) Avg |
| Traversal | O(n) | O(n) |

Worst Case BST:

```
O(n)
```

---

# 🎯 DSA Interview Tips

### Traversals

```text
Inorder   → Left Root Right
Preorder  → Root Left Right
Postorder → Left Right Root
LevelOrder→ BFS
```

### BST Rule

```text
Left < Root < Right
```

### Height Formula

```java
1 + max(leftHeight, rightHeight)
```

### Leaf Node

```text
left == null && right == null
```

---

# 🚀 Quick Revision

✔ Tree = Hierarchical Structure

✔ Root Node

✔ Parent & Child

✔ Leaf Node

✔ Binary Tree

✔ Binary Search Tree

✔ Inorder, Preorder, Postorder

✔ Level Order (BFS)

✔ Height Calculation

✔ Node Counting

✔ BST Search & Insert

✔ Time Complexity Analysis

Happy Coding! 🌳☕
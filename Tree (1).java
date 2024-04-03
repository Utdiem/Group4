/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newTree;

/**
 *
 * @author udiem
 */
class TNode {

    int data;
    TNode left, right;

    TNode(int x) {
        data = x;
        left = right = null;
    }

    TNode(int x, TNode ll, TNode rr) {
        data = x;
        left = ll;
        right = rr;
    }
}

class MyBinaryTree {

    TNode root;

    void taocayT() {
        TNode A = new TNode(7, new TNode(2), new TNode(6));
        TNode B = new TNode(5, null, new TNode(9));
        root = new TNode(2, A, B);
    }

    void duyet1(TNode T) {
        if (T != null) {
            System.out.println(" " + T.data);
            duyet1(T.left);
            duyet1(T.right);
        }
    }

    void duyettientu() {
        duyet1(root);
    }

    void duyet2(TNode T) {
        if (T != null) {
            duyet2(T.left);
            System.out.println(" " + T.data);
            duyet2(T.right);
        }
    }

    void duyettrungtu() {
        duyet2(root);
    }

    int cao(TNode T) {
        if (T == null) {
            return 0;
        } else {
            return 1 + Math.max(cao(T.left), cao(T.right));
        }
    }

    int cao() {
        return cao(root);
    }

    int countNodes(TNode root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return 1 + leftCount + rightCount;
    }

    int countNodes() {
        return countNodes(root);
    }

    int sumNodes(TNode root) {      
        if (root == null) {
            return 0;
        }       
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);
        return root.data + leftSum + rightSum;
    }   
    int sumNodes() {
        return sumNodes(root);
    }

    public static void main(String[] args) {
        MyBinaryTree T = new MyBinaryTree();
        T.taocayT();
        T.duyettientu();
        T.duyettrungtu();
    }

}

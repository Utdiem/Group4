package duyet;

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
}

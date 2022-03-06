package treesProblem;

public class InsertionInTree {
	static class Node{
		Node left;
		Node right;
		int data;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	Node root;
	InsertionInTree(){
		root=null;
	}
	public Node insert(Node root, int dataToBeInserted) {
		if(root==null) {
			root= new Node(dataToBeInserted);
			return root;
		}
		if(root.data> dataToBeInserted) {
			root.left= insert(root.left, dataToBeInserted);
		}
		else if(root.data<dataToBeInserted) {
			root.right =insert(root.right, dataToBeInserted);
		}
		return root;
	}
	public void insertIntoTree(int dataToBeInserted) {
		root = insert(root, dataToBeInserted);		
	}
	public void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	public void inOrderTraversal() {
		inOrder(root);
	}
	public static void main(String args[]) {
		InsertionInTree tree =new InsertionInTree();
		tree.insertIntoTree(1);
		tree.insertIntoTree(20);
		tree.insertIntoTree(10);
		tree.insertIntoTree(2);
		tree.inOrderTraversal();
	}

}

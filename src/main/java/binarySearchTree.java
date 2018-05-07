package main.java;

/*		A BST is a binary tree in symmetric order, is a property of permutations. Each node has a key, keys have comparable values[<,>]
 * 
 * The recursive algorithm for searching a binary tree: key field value of the root node is greater than the key field values of all the node's in the root left subtree and 
 *  less then the key values of all the node's in the root's right subtree. each subtree is also a binary search tree. 
 * If the current node is null, then the item is not in the tree.  
 * A node has 4 fields: a Key, a Value, a Reference to the left, a Reference to the right subtree
 * Operations: Insert, Delete, Search
 * Performance: average case - if N distinct keys are inserted into BST in random order, the expected number of compares  for search, insert is aprox. 2 ln N 
 * 				worst case - is o(n)
 * 				best case - o(logn) - is perfect balanced 
 * Reasonable model will be to insert keys in random order.
*/
public class binarySearchTree<Key extends Comparable<Key>, Value> {
	
	private Node root;
	private int key;
	private Value val;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {
		
		/*binarySearchTree tree = new binarySearchTree();
		
		tree.put("AN", "Ana");
		tree.put("AL", "Alina");
		tree.put("AR", "Ariana");
		tree.put("AM", "Amanada");
		*/
		binarySearchTree<String, Double> tree = new binarySearchTree<String, Double>();
		
		//for(String key : tree.keys())
			//System.out.println(key + " " + tree.get(key));
		
		
		
	}
//create a new node with a given Key and value
private class Node
{
	private Key key;
	private Value val;
	private Node left, right;
	public Object count;
}
public void Node(int key, Value val)
{
	this.key = key;
	this.val = val;
}
//retrieving the value associated with a given key   numbers of compares is equal to 1 + depth of the node
public Value get(Key key)
{

	return get(root, key);
}
public Value get(Node x, Key key){
	
	if(x == null)
		return null;

	int comp = key.compareTo(x.key);
	if(comp < 0)
		x = x.left;
	else if(comp > 0)
		x = x.right;
	else if(comp == 0)
		return x.val;
	return val;

} 

// Insert(recursive code): if key is in tree -> reset value, if key in not in the tree -> add new node
public void put(Key key, Value val)
{
	root = put(root, key, val);
}
private Node put(Node x, Key key, Value val)
{
	if(x == null)
		return new Node();//create new node
	int comp = key.compareTo(x.key);
	
	if(comp < 0)
		x.left = put(x.left, key, val);
	else if(comp > 0)
		x.right = put(x.right, key, val);
	else if(comp == 0)
		x.val = val;
	return x;
}

public void delete(Key key)
{
	root = delete(root, key);
}
private Node delete(Node x, Key key)
{	
	
	if(x == null)
		return null;
	int comp = key.compareTo(x.key);
	if(comp < 0) 
		x.left = delete(x.left, key);//search for key
	else if(comp > 0)
		x.right = delete(x.right, key);
	else{ 
		if(x.right == null) //right have no child
			return x.left;
		
	Node t = x;
	x = min(t.right);
	x.right = deleteMin(t.right);//replace with successor
	x.left = t.left;
		
	}
		x.count = size(x.left) + size(x.right) +1;//update subtree counts
		return x;
}
private binarySearchTree<Key, Value>.Node deleteMin(binarySearchTree<Key, Value>.Node right) {
	
	return null;
}
private binarySearchTree<Key, Value>.Node min(binarySearchTree<Key, Value>.Node right) {
	
	return null;
}
private int size(binarySearchTree<Key, Value>.Node left) {
	
	return 0;
}

}

package BST;

import java.util.Random;

public class BinarySearchTree {
	
    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    
    public Node getRoot() {
        return root;
    }
    
    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;

        if (currentNode.value == value) return true;

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value) { 
        
        return rContains(root, value); 
    
    }

    public void searchingRandomNode(int count) {

        int[] numberArray = new int[count+1]; 

        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt();
        }
        
        
        for (int i = 0; i < numberArray.length; i++) {
            rContains( numberArray[i]); 
        }
    }


    
    
   private Node rInsert(Node currentNode, int value){
        if(currentNode == null){
            return new Node(value);            
        }
        if(value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);
        }else if(value > currentNode.value){
            currentNode.right=rInsert(currentNode.right, value);
        }
        return currentNode;
    }
    
    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }    
    public static void shuffleArray(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public void insertRandomNode(int count) {
        int[] numberArray = new int[count+1]; // -50'den +50'ye kadar 101 eleman var

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = -(count/2) + i;
        }

        shuffleArray(numberArray);
        
        for (int i = 0; i < numberArray.length; i++) {
            root = rInsert(root, numberArray[i]);
        }
    }

    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public void printInorder() {
        System.out.println("BST Inorder Traversal:");
        inorderTraversal(root);
        System.out.println();
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    private Node deleteNode(Node currentNode, int value){
        if(currentNode == null) return null;
        if(value < currentNode.value){
            currentNode.left = deleteNode( currentNode.left, value);
        }
        else if(value > currentNode.value){
            currentNode.right = deleteNode(currentNode.right, value);
        }
        else{
            if(currentNode.left == null && currentNode.right == null){
                return null;
            }
            else if(currentNode.left == null){
                return currentNode.right;
            }
            else if (currentNode.right == null) {
                return currentNode.left;
            }else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin); 
            }
        }
        return currentNode;
    }
    public void deleteNode(int value){
        deleteNode(root, value);
    }

    public void deleteRandomNode(int count) {
        int[] numberArray = new int[count+1]; // -50'den +50'ye kadar 101 eleman var

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = -(count/2) + i;
        }
        shuffleArray(numberArray);
        
        // Array'i yazdırma
        System.out.println("Number Array Elemanları:");
        for (int i = 0; i < numberArray.length; i++) {
            root = deleteNode(root, numberArray[i]);
        }
    }
      

}
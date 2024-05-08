package AvlTree;

public class AvlTreeTester {
    public static void main(String[] args) {
       
        AVLTree avl = new AVLTree();

        long start = System.currentTimeMillis();

        avl.insertRandomNode(10000000);

        long finish = System.currentTimeMillis();
        long timeElapsed = (long)(finish - start);
        double seconds = (double) timeElapsed / 1000;
        System.out.println("Time:");
        System.out.println(seconds);

         long start2 = System.currentTimeMillis();

        avl.deleteRandomNode(10000000);

        long finish2 = System.currentTimeMillis();
        long timeElapsed2 = (long)(finish2 - start2);
        double seconds2 = (double) timeElapsed2 / 1000;
        System.out.println("Time:");
        System.out.println(seconds2); 
/* 
        long start3 = System.currentTimeMillis();
        
        avl.searchingRandomNode(10000000);
        
        long finish3 = System.currentTimeMillis();
        long timeElapsed3 = (long)(finish3 - start3);
        double seconds3 = (double) timeElapsed3 / 1000;
        System.out.println("Time:");
        System.out.println(seconds3);*/



        /* 
        avl.inOrder(avl.root);
       
        avl.insert(avl.root, 6);
        System.out.println(" ");
        avl.inOrder(avl.root);
         avl.deleteNode(avl.root, 6);
         System.out.println(" ");
         System.out.println("Inorder after deletion:");

         avl.deleteRandomNode(5);

         avl.inOrder(avl.root);*/

    
        
        
    

    }
}

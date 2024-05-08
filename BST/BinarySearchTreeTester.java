package BST;

public class BinarySearchTreeTester {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        
        
        long start = System.currentTimeMillis();

        bst.insertRandomNode(10000000);

        long finish = System.currentTimeMillis();
        long timeElapsed = (long)(finish - start);
        double seconds = (double) timeElapsed / 1000;
        System.out.println("Time of inserting:");
        System.out.println(seconds);

         long start2 = System.currentTimeMillis();

        bst.deleteRandomNode(10000000);

        long finish2 = System.currentTimeMillis();
        long timeElapsed2 = (long)(finish2-start2);
        double seconds2 = (double) timeElapsed2 / 1000;
        System.out.println("time of deletion: ");
        System.out.println(seconds2);  

        /*  long start3 = System.currentTimeMillis();

        bst.searchingRandomNode(10000000);
        
        long finish3 = System.currentTimeMillis();
        long timeElapsed3 = (long)(finish3 - start3);
        double seconds3 = (double) timeElapsed3 / 1000;
        System.out.println("time of existing method");
        System.out.print(seconds3 );
*/
        
       // System.out.println(bst.rContains(128273));
        //bst.printInorder();
       // bst.rInsert(6);
        //System.out.println();
        //System.out.println( bst.rContains(-2));
        //bst.deleteNode(-2);
        //System.out.println(bst.rContains(-2));
        //bst.printInorder();
        //bst.deleteRandomNode(9);
        //bst.printInorder();
        

    }
}

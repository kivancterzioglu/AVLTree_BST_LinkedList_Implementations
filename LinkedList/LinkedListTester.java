package LinkedList;

public class LinkedListTester {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(0);

        long start = System.currentTimeMillis();

        myLinkedList.insertRandomNode(1000000);

        long finish = System.currentTimeMillis();
        long timeElapsed = (long)(finish - start);
        double seconds = (double) timeElapsed / 1000;
        System.out.println("Time of insertion:");
        System.out.println(seconds);

        
        long start2 = System.currentTimeMillis();

        myLinkedList.deleteRandomNode(1000000);

        long finish2 = System.currentTimeMillis();
        long timeElapsed2 = (long)(finish2 - start2);
        double seconds2 = (double) timeElapsed2 / 1000;
        System.out.println("Time of deletion:");
        System.out.println(seconds2); 
/* 
        long start3 = System.currentTimeMillis();

        myLinkedList.searchingRandomNode(500000);
        
        long finish3 = System.currentTimeMillis();
        long timeElapsed3 = (long)(finish3 - start3);
        double seconds3 = (double) timeElapsed3 / 1000;
        System.out.println("Time of searching:");
        System.out.println(seconds3);
*/
        
        /* 
        myLinkedList.insertRandomNode(10);
        myLinkedList.printAll();
        myLinkedList.deleteRandomNode(6);
        myLinkedList.printAll(); */




    }
}

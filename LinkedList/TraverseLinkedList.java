public class TraverseLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int i) {
            value = i;
            next = null;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
}

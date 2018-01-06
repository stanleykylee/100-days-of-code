public static Node removeDuplicates(Node head) {
    //Write your code here
    Node cursor = head;
    Node next = head.next;
    while(cursor != null) {
        while(next != null && cursor.data == next.data) {
            if(next.next == null) {
                next = null;
            } else {
                next = next.next;
            }
        }
        cursor.next = next;
        cursor = next;
    }
    return head;
}
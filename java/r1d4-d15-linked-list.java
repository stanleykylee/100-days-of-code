public static  Node insert(Node head,int data) {
    //Complete this method
    Node node = new Node(data);
    Node cursor = head;
    if(cursor == null) {
        return node;
    } else {
        while(cursor.next != null){
            cursor = cursor.next;
        }
        cursor.next = node;
        return head;
    }
}

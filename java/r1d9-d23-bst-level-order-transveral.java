static void levelOrder(Node root){
    //Write your code here
    ArrayDeque<Node> queue = new ArrayDeque<>();
    Node cursor = null;
    queue.push(root);
    while(queue.peekLast() != null){
        cursor = queue.pollLast();
        System.out.print(cursor.data + " ");
        if(cursor.left != null) {
            queue.push(cursor.left);
        }
        if(cursor.right != null) {
            queue.push(cursor.right);
        }
    }
}
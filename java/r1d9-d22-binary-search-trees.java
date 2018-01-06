public static int getHeight(Node root){
    //Write your code here
      int r_height = 0;
      int l_height = 0;
      
      if(root.right != null){
          r_height = getHeight(root.right) + 1;
      }
      if(root.left != null){
          l_height = getHeight(root.left) + 1;
      }
      
      return (r_height > l_height ? r_height : l_height);
  }

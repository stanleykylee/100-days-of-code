    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    static <T> void printArray(T[] a) {
        for (T o : a) {
            System.out.println(o);
        }
    }
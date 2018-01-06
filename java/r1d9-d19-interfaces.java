//Write your code here
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        double square = Math.sqrt(n);
        for(int i = 1; i < square; i++) {
            if(n % i == 0){
                //System.out.println("i: " + i + " n/i: " + n/i);
                sum = sum + i + n / i;
                //System.out.println("sum: " + sum);
            }
        }
        if ((square == Math.floor(square)) && !Double.isInfinite(square)) {
            // add square if it is an integer
            sum += (int) square;
        }
        return sum;
    }
}
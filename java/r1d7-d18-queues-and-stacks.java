public class Solution {
    // Write your code here.
    ArrayDeque<Character> stack = new ArrayDeque<>();
    ArrayDeque<Character> queue = new ArrayDeque<>();
    
    public void pushCharacter(char ch) {
        this.stack.push(ch);
    }
    
    public void enqueueCharacter(char ch) {
        this.queue.push(ch);
    }
    
    public char popCharacter() {
        return this.stack.pop();
    }
    
    public char dequeueCharacter() {
        return this.queue.pollLast();
    }
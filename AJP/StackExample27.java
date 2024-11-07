import java.util.*;

class StackExample27 {
    public static void main(String args[]) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("The stack: " + s1);
        Iterator<Integer> i1 = s1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        int peekElement = s1.peek();
        System.out.println("Top element of the stack is: " + peekElement);
        int poppedElement = s1.pop();
        System.out.println("Popped out element from the stack: " + poppedElement);
        boolean result = s1.empty();
        System.out.println("Result of the stack: " + result);
        System.out.println(s1.search(20));
    }
}
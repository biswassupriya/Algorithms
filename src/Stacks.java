import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(10);
        stack.add(120);
        stack.add(23);
        System.out.println(stack);
        int  x = stack.pop();
        System.out.println(x);
        System.out.println(stack);
        int y = stack.pop();
        System.out.println(y);
        System.out.println(stack);
        System.out.println("LAST IN FIRST OUT");


    }
}

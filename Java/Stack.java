import java.util.Stack;

public class P9x01xStack {
    public static void main(String[] args) {
        Stack<Character> stek = new Stack<Character>();
        stek.push('S');
        stek.push('A');
        stek.push('T');
        stek.push('U');
        stek.push(' ');
        stek.push('D');
        stek.push('U');
        stek.push('A');
        System.out.println(stek);
        stek.getClass();
        System.out.println(stek.getClass());
        System.out.println(stek.peek());

    }
}
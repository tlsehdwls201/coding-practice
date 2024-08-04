import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = r.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n.length(); i++) {
            char current = n.charAt(i);
            stack.push(current);

            // Check for the "PPAP" pattern
            if (stack.size() >= 4) {
                char p1 = stack.pop();
                char a = stack.pop();
                char p2 = stack.pop();
                char p3 = stack.pop();

                // If we find a "PPAP" pattern, replace it with 'P'
                if (p1 == 'P' && a == 'A' && p2 == 'P' && p3 == 'P') {
                    stack.push('P');
                } else {
                    // If not a "PPAP", push them back
                    stack.push(p3);
                    stack.push(p2);
                    stack.push(a);
                    stack.push(p1);
                }
            }
        }

        // If the stack contains only one 'P', it's "PPAP"
        if (stack.size() == 1 && stack.peek() == 'P') {
            w.write("PPAP\n");
        } else {
            w.write("NP\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}
package Homework.bracechecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack stack = new Stack();
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but not opened at " + i);
                    } else if (pop != '(') {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but opened " + (char) pop + " at: " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but not opened at " + i);
                    } else if (pop != '{') {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but opened " + (char) pop + " at: " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but not opened at " + i);
                    } else if (pop != '[') {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but opened " + (char) pop + " at: " + i);
                    }
                    break;

            }
        }
        int last;
        while ((last = stack.pop()) != 0) {
            isValid = false;
            System.err.println("Error: Opened " + (char) last + " but nothing closed");
        }

        if (isValid) {
            System.out.println("Everything is good");
        }
    }
}

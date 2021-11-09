package Homework.firgurePainter;

public class CharArray2Test {
    public static void main(String[] args) {
        CharArray2 charArray2 = new CharArray2();
        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' ', ' ',};
        char[] result = charArray2.trim(text);
        for (char c : result) {
            System.out.print(c);
            
        }
    }
}

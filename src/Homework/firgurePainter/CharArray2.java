package Homework.firgurePainter;

public class CharArray2 {
    public static void main(String[] args) {
        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' ', ' ',};

    }

    char[] trim(char[] text) {
        int startIndex = 0;
        int endIndex = text.length - 1;
        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }

        char[] result = new char[(endIndex - startIndex) + 1];

        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }
        return  result;

    }
}


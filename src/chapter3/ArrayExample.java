package chapter3;

public class ArrayExample {
    public static void main(String[] args) {
        char[] name = { 'p', 'o', 'x', 'o', 's'};

        int count = 0;
        for(int i = 0; i< name.length; i++ ) {
            char c = name[i];
            if(c == 'o') {
                count++;
            }
        }
        System.out.println("count of o = " +count);

    }
}

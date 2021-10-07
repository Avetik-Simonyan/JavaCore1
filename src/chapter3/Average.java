package chapter3;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 14.5, 15.6};
        double results = 0;
        int i;
        for (i = 0; i < 5; i++)

        results = results + nums[i];

        System.out.println("միջինը հավասար է " + results / 5);

    }
}

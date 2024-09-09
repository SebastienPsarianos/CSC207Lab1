public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int j = 0;
        while (i != 0) {
            i = reduce(i);
            j++;
        }
        System.out.println(j);
    }
    public static int reduce(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return n - 1;
    }
}

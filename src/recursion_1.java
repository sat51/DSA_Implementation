public class recursion_1 {
    public static void print(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print(n - 1);
    }
}

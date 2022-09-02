public class Main {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = in.nextInt();
        int n = in.nextInt();
        int a;
        a = n % k;
        out.println(a);

        out.flush();
    }
}
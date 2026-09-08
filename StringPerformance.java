package labtask04;

public class StringPerformance {

    public String buildString(int n) {
        String s = "";

        for (int i = 0; i <= n; i++) {
            s = s + i;
        }

        return s;
    }

    public String buildStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            sb.append(i);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        StringPerformance sp = new StringPerformance();

        int n = 10000;

        long start1 = System.nanoTime();
        String result1 = sp.buildString(n);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        String result2 = sp.buildStringBuilder(n);
        long end2 = System.nanoTime();

        System.out.println("String result length: " + result1.length());
        System.out.println("String time: "
                + (end1 - start1) + " nanoseconds");

        System.out.println();

        System.out.println("StringBuilder result length: " + result2.length());
        System.out.println("StringBuilder time: "
                + (end2 - start2) + " nanoseconds");
    }
}
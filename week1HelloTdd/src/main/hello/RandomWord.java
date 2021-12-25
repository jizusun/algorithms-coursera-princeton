import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 0;
        String champion = "";
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            double p = 1.0/++i;
            boolean selected = StdRandom.bernoulli(p);
            champion = selected ? s : champion;
        }
        StdOut.println(champion);
    }
}

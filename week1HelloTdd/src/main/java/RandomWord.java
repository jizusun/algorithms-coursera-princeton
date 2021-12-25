import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    protected  static String getSurvivingChampion(String previousChampion, String newWord, int i) {
        double p = i == 0 ? 0 : 1.0/i;
        boolean selected = StdRandom.bernoulli(p);
        return selected ? newWord : previousChampion;
    }
    public static void main(String[] args) {
        int i = 0;
        String champion = "";
        while (!StdIn.isEmpty()) {
           String s = StdIn.readString();
           champion = getSurvivingChampion(champion, s, ++i);
        }
        StdOut.println(champion);
    }
}

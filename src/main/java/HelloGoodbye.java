public class HelloGoodbye {
    public static void main(String[] args) {
//        firstName = args[0];
//        secondName = args[1];
        String names = String.format("%s and %s", args[0], args[1]);
        String[] greetings = {"Hello", "Goodbye"};
        for (String g: greetings) {
            String output = String.format("%s %s.", g, names);
            System.out.println(output);
        }
    }
}

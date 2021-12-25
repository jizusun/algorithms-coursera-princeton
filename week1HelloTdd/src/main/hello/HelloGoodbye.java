public class HelloGoodbye {
    public static void main(String[] args) {
        String firstName = args[0];
        String secondName = args[1];
        String hello = String.format("Hello %s and %s.", firstName, secondName);
        String goodbye = String.format("Goodbye %s and %s.", secondName, firstName);
        System.out.println(hello);
        System.out.println(goodbye);
    }
}

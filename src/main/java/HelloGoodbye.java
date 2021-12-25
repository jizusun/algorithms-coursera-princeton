public class HelloGoodbye {
    private String firstName;
    private String secondName;
    public HelloGoodbye()  { }
    protected void addNames(String[] twoNames)  {
        firstName = twoNames[0];
        secondName = twoNames[1];
    }
    protected String getHello() {
        return String.format("Hello %s and %s.", firstName, secondName);
    }
    protected String getGoodbye() {
        return String.format("Goodbye %s and %s.", secondName, firstName);
    }
    public static void main(String[] args) {
        System.out.println(args.length);
        HelloGoodbye hg = new HelloGoodbye();
        hg.addNames(args);
        System.out.println(hg.getHello());
        System.out.println(hg.getGoodbye());
    }
}

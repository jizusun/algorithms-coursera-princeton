public class HelloGoodbye {
   private String firstName;
   private String secondName;

   public HelloGoodbye(String[] twoNames)  {
        firstName = twoNames[0];
        secondName = twoNames[1];
   }

    public String getHello() {
       return String.format("Hello %s and %s.", firstName, secondName);
    }

    public String getGoodbye() {
        return String.format("Goodbye %s and %s.", secondName, firstName);
    }

    public static void main(String[] args) {
       HelloGoodbye hg = new HelloGoodbye(args);
       System.out.println(hg.getHello());
       System.out.println(hg.getGoodbye());
    }



}

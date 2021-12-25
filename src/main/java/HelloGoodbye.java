public class HelloGoodbye {
   private String firstName;
   private String secondName;

   public HelloGoodbye(String[] twoNames)  {
        firstName = twoNames[0];
        secondName = twoNames[1];
   }

    public String sayHello() {
       return String.format("Hello %s and %s.", firstName, secondName);
    }

    public String sayGoodbye() {
        return String.format("Goodbye %s and %s.", secondName, firstName);
    }

    public static void main(String[] args) {
       HelloGoodbye hg = new HelloGoodbye(args);
       hg.sayHello();
       hg.sayGoodbye();
    }



}

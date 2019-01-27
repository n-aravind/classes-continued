public class Main{
    public static void main(String[] args) {

        MySecondClass mySecondClass = new MySecondClass("John Doe");

        System.out.println(mySecondClass.getName());

        mySecondClass.setName("Jane Doe");

        System.out.println(mySecondClass.getName());

    }
}
package WEEK_1.OOPS;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUsers kid = new KidUsers(10, "Kids");
        kid.registerAccount();
        kid.requestBook();

        System.out.println();

        AdultUser adult = new AdultUser(23, "Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}

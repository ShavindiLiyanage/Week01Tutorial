public class TutorialWeek02 {
    public static void main(String[] args) {
        // Creating a Person named Ben
        Person p1 = new Person("Ben");
        p1.setSurname("Smith");
        p1.setAge(25);
        p1.displayDetails();

        Person p2 = new Person("Alice");
        p2.setSurname("Johnson");
        p2.setAge(30);
        p2.displayDetails();

        Person p3 = new Person("John");
        p3.setSurname("Doe");
        p3.setAge(40);
        p3.displayDetails();

        Person p4 = new Person("Emma");
        p4.setSurname("Brown");
        p4.setAge(22);
        p4.displayDetails();
    }
}

public class Person {

    private String name;
    private String surname;
    private int age;

    // Constructor to create a new instance of Person with a name
    public Person(String n) {
        name = n;
    }

    //Method to display Name
    public void displayName(){
        System.out.println(name);
    }


    //5.Method to set surname and age
    public void setSurname(String s){
        surname = s;
    }
    public void setAge(int a){
        age = a;
    }

    //6. Method to get surname and age
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name + "  SurName:" + surname + "  Age:" + age);
    }




}

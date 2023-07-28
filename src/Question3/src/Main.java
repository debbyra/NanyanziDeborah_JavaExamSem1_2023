//Question3 REG No.031
public class Main {

    public static void main(String[] args) {
//        instance of the person class
        Person obj = new Person();
//        set method to provide information of the person
        obj.setAge(24);
        obj.setSalary(450_000);
//        get method to retrieve the information
        System.out.println("Person salary: "+obj.getSalary());
        System.out.println("Person age: "+obj.getAge());
    }
}
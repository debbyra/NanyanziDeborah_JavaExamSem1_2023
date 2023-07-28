import java.util.List;
import java.util.Scanner;

//REG.No 031
public class Main {
    List <String> animals;

//    get and set methods for the animal collection
    public List<String> getAnimals() {
        return animals;
    }

    public void setAnimals(List<String> animals) {
        this.animals = animals;
    }

//    method to add animals to the collection
    public String addAnimals(String newAnimal) {
        return newAnimal;
    }

    public static void main(String[] args) {
        //i. display the sum of even numbers less than 8
        Scanner obj = new Scanner(System.in);
        System.out.println("Even number less than 8: ");

//        calculate their sum
        int evenSum = obj.nextInt() + obj.nextInt() + obj.nextInt() ;
        System.out.println("the sum is: " + evenSum);


        // ii. input five numbers from the keyboard and find their average
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number: ");

        //calculate their sum and average
        int sum = myObj.nextInt() + myObj.nextInt() + myObj.nextInt() + myObj.nextInt() + myObj.nextInt();
        int average = sum/5;
        System.out.println("the average is: " + average);


        //iii.
        // a) -5+8*6
        int x=-5,y=8,z=6;
        int m = y*z;
        int k = x + m;
        System.out.println("Output a: " + k );
        //b) (55+9) %9
        int a = (55 + 9 ), p = 9;
        int r = a%p;
        System.out.println("Output b: " + r);
        //c) 20+-3*5/8
        int h = 20, j = -3, l = 5, g = 8;
        int f = l/g;
        int t = j*f;
        int d = h+t;
        System.out.println("Output c: " + d);
        //d) 5+15/3*2-8%3
        int ab = 5, bc = 15, de = 3, fg = 2, hi = -8, jk = 3;
        int lm = hi%jk;
        int no = bc/de;
        int pq = ab+no;
        int rs = fg-lm;
        int tu = pq*rs;
        System.out.println("Output d: " + tu);

        //iv. store an arraylist of animals and print them all

//        animal object
        Main myAnimal = new Main();
        myAnimal.addAnimals("dog");
        myAnimal.addAnimals("cat");
        List myCollection = myAnimal.getAnimals();

        System.out.println(myCollection);
    }


}
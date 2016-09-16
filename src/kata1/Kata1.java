package kata1;

import java.util.Date;


public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Sergio", new Date(90,1,4));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
    
}

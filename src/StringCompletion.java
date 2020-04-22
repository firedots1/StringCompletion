import java.util.Scanner;

public class StringCompletion {
        public static void main( String[] args )
        {
            String name;
            int age;
            Scanner keyboard = new Scanner(System.in);
            System.out.println( "Greetings. What is your pet's name? " );
            name = keyboard.nextLine();
            String breed;
            System.out.println( "What kind of animal is " + name + "? " );
            breed = keyboard.nextLine();
            System.out.println( "How old is " + name + "? ");
            age = keyboard.nextInt();
            System.out.println("'" + name + "'" + " is the name of the pet. " + "It is an breed type of " + breed + " and it is about " + "" + age + "years old. " );
        }
    }

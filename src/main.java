import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        int age;
        String firstName;
        String favoriteFood;
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        System.out.println("Please enter your first name:");
        firstName = scanner2.nextLine();
        System.out.println("Please enter your favorite food:");
        favoriteFood = scanner3.nextLine();
        System.out.println("First name: " + firstName + "\n\n" + "Age: " + age + "\n\n" + "Favorite Food: " + favoriteFood);





    }
}

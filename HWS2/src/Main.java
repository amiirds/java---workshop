import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        final String real_name = "amirreza";
        final int real_id = 98111000;
        String name;
        long id;
        System.out.println("Enter your name ");
        name = scanner.nextLine();
        System.out.println("Enter your id No ");
        id = scanner1.nextLong();
        if (real_name.equals(name)){
            System.out.println("its correct name");
        }
        else {
            System.out.println("its incorrect name ");
        }
        if (real_id == id){
            System.out.println("its correct id");
        }
        else {
            System.out.println("its incorrect id No");
        }
    }
}

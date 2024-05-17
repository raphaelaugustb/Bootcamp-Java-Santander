import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args){
        Scanner getUserData = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Type our height");
        double height = getUserData.nextDouble();
        System.out.println("Type our name");
        String name = getUserData.next();
        System.out.println("Type our age");
        int age = getUserData.nextInt();

        System.out.println(height +  ", "+ name + age);
    }

}

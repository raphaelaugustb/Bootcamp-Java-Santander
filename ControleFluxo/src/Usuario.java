import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static String getUserName (){
        Scanner getUserName = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome:");
        String name = getUserName.nextLine();
        return name;
    }
    public static int getUserAge (){
        Scanner getUserAge = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite sua idade:");
        int age = getUserAge.nextInt();
        return age;
    }
    public static double getUserHeight(){
        Scanner getUserHeight = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite sua altura");
        double height = getUserHeight.nextDouble();
        return height;
    }

    public static void main(String[] args) {
        try{
            String name = getUserName();
            double height = getUserHeight();
            int age = getUserAge();
            String userIdentity = "O nome do usuário é: " + name + ", e sua idade é: " + age + " anos."+ " " +
                    "E tem a altura de: " + height;
            System.out.println(userIdentity);
        } catch (InputMismatchException e){
            String errorMessage = "Os campos Altura e Idade precisam ser numéricos.";
            System.out.println(errorMessage);
        }


    }
}

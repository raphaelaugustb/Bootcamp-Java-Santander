import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho");
        String sigla = scanner.nextLine();
        switch (sigla){
            case "P":{
                System.out.println("Tamanho P selecionado.");
                break;
            }
            case"M":{
                System.out.println("Tamanho M selecionado");
                break;
            }case"G":{
                System.out.println("Tamanho G selecionado");
                break;
            }
            default:{
                System.out.println("Indefinido");
                break;
            }
        }
    }
}

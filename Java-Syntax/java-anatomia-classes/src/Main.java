//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main (String[] args){
        String ano_fabricacao = "teste";
        // Errado: String ano fabricacao = "teste";
        int valorCasa = 1;
        //int errado valorcasa = 1

        //Variavel maiscula nao muda valor
        String BR = "Brasil";
        String firstName = "Raphael";
        String secondName = "Augusto";
        String nomeCompleto = nomeCompleto(firstName, secondName);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String firstName, String secondName){
    return firstName.concat(" ").concat(secondName);
    }

}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class ContarNumeros {
    public static void main(String[] args) {
        int numeros;
        for(numeros = 1; numeros<=5; numeros++){
            if(numeros == 3)
                continue;

            System.out.println(numeros);
        }
    }
}

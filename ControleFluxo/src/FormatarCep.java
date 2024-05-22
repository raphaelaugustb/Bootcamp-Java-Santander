public class FormatarCep {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("2376506");
        }catch (InvalidCepException e){
         System.out.println("Cep invalido menos de oito digitos");
        }

    }
    static String formatarCep(String cep) throws InvalidCepException{
        if (cep.length() != 8){
            throw new InvalidCepException();
        }
        return "23.765-064";
    }
}

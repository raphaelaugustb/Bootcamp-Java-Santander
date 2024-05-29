public class ResultadoEscolar {
    public static void main(String[] args){
        /*if (notaAluno >= 7){

            System.out.println("Aprovado");

        }  else if(notaAluno>= 5 && notaAluno < 7){
            System.out.println("Recuperacao");
        }else {
            System.out.println("Reprovado");
        }
    */
        int notaAluno = 1;
        String resultado = notaAluno >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
}
}

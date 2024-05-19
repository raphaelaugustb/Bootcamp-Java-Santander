public class ResultadoEscolar {
    public static void main(String[] args){
        int notaAluno = 6;
        /*if (notaAluno >= 7){
            System.out.println("Aprovado");

        }  else if(notaAluno>= 5 && notaAluno < 7){
            System.out.println("Recuperacao");
        }else {
            System.out.println("Reprovado");
        }
    */
        String resultado = notaAluno >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
}
}

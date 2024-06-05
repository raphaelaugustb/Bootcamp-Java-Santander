package estadocivil;

public class Pessoa {
    private String nome;
    private EstadoCivil estadoCivil;

   public Pessoa(EstadoCivil estadoCivil, String nome) {
        this.estadoCivil = estadoCivil;
        this.nome = nome;
    }

   public void setNome(String nome){
       this.nome =  nome;
   }
   public String getNome(){
       return nome ;
   }
   public EstadoCivil getEstadoCivil (){
      return estadoCivil ;
   }

}

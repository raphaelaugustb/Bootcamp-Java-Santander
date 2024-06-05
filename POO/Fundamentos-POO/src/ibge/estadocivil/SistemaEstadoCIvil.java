package estadocivil;

public class SistemaEstadoCIvil {
    public static void main(String[] args) {

        Pessoa mateus = new Pessoa(
                EstadoCivil.Casado,
                "Raphael"
        );
        System.out.println(mateus.getNome() + "-" + mateus.getEstadoCivil());
        }


}

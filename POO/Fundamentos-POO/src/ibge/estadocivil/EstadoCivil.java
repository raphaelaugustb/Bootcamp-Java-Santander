package estadocivil;

public enum EstadoCivil {
    Casado("Casado"),
    Solteiro("Solteiro"),
    Viuvo("VIUVO"),
    Divorciado("Divorciado");

    private String estadoCivil;


    private  EstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    public String getEstadoCivil(){
        return estadoCivil;
    }
    public String getEstadoCivil_Maisculo(){
        return  estadoCivil.toUpperCase();
    }
}



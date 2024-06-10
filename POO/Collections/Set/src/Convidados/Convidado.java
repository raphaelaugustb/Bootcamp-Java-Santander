package Convidados;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado( String nome,int codigoConvite) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}

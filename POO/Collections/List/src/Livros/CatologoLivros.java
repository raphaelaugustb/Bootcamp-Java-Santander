package List.OperacoesBasicas.Livros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatologoLivros {
    private List<Livro> catologoLivros;
    public boolean verificarLivrosCatologo(){
        if (catologoLivros.isEmpty()){
            System.out.println("Catologo de livros está vazio.");
            return false;
        }
        return true;
    }
    public CatologoLivros() {
        this.catologoLivros =new ArrayList<Livro>();
    }
    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        catologoLivros.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<Livro>();
        if (verificarLivrosCatologo()){
            for (Livro l:catologoLivros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<Livro>();
        if (verificarLivrosCatologo()){
            for (Livro l:catologoLivros){
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livrosPorAno.add(l);
                } else {
                    System.out.println("Livro nao encontrado");
                }
            }
        }
        return livrosPorAno;
    }

    public List<Livro> mostrarCatologoLivros() {
        return catologoLivros;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroAnoSelecionado = null;
        if (verificarLivrosCatologo()){
            for (Livro l:catologoLivros){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroAnoSelecionado = l;
                    break;
                }
            }
        }


        return livroAnoSelecionado;
    }
    public int introducaoAplicacao(Scanner getData){
        System.out.println("Opcoes: \n" +
                "1:Adicionar Novo Livro\n"+
                "2:Pesquiar por Autor\n"+
                "3: Pesquisar Livro\n" +
                "4: Pesquisar por Ano\n" +
                "5: Fechar Aplicacao\n");


        int e = getData.nextInt();
        return e;

    }


    public String getTituloLivro(){
        Scanner getTitulo = new Scanner(System.in);
        System.out.println("Digite o titulo do livro");
        return getTitulo.nextLine();
    }
    public String getAutorLivro(){
        Scanner getAutor = new Scanner(System.in);
        System.out.println("Digite o autor do livro");
        return getAutor.nextLine();
    }
    public int getAnoLivro(){
        Scanner getAno = new Scanner(System.in);
        System.out.println("Digite o ano do livro");
        return getAno.nextInt();
    }

    public void executarAplicacao(){
        CatologoLivros catologoLivros = new CatologoLivros();
        System.out.println("Bem Vindo ao menu do catologo");
        Scanner getData = new Scanner(System.in);
        int e = catologoLivros.introducaoAplicacao(getData);

    switch (e) {
        case 1:
            catologoLivros.adicionarLivros(catologoLivros.getTituloLivro(),
                    catologoLivros.getAutorLivro(),
                    catologoLivros.getAnoLivro());
            break;
        case 2:
            Scanner getAuthor = new Scanner(System.in);
            System.out.println("Gostaria de Pesquisar por qual Autor?");
            String getAuthorString = getAuthor.nextLine();
            System.out.println(catologoLivros.pesquisarPorAutor(getAuthorString));
            break;
        case 3:
            Scanner getTittle = new Scanner(System.in);

            System.out.println("Gostaria de Pesquisar qual Livro?");
            String getTittleString = getTittle.nextLine();
            System.out.println(catologoLivros.pesquisarPorTitulo(getTittleString));
            break;
        case 4:
            Scanner getAge = new Scanner(System.in);
            System.out.println("Gostaria de Pesquisar qual Anos?");
            System.out.println("Ano Inicial");
            int AnoInicial = getAge.nextInt();
            System.out.println("Anofinal");
            int AnoFinal = getAge.nextInt();
            System.out.println(catologoLivros.pesquisarPorAno(AnoInicial, AnoFinal));
            break;
        case 5:
            System.out.println("Fechando o programa");
            break;
        default:
            System.out.println("Opcao Indisponivel");
            break;

    }
}
    }





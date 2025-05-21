import java.util.*;

public class Pessoa implements Comparable {

    private String nome;
    private String genero;

    public Pessoa(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public static List<Queue> SepararGenero(List<Pessoa> pessoas){

        List<Queue> pessoasGenero= new LinkedList<>();

        for (int i = 0; !pessoas.isEmpty(); i++){
            String grupo = pessoas.get(0).getGenero();
            pessoasGenero.add(new PriorityQueue<Pessoa>());
            for(Pessoa p : new ArrayList<>(pessoas)){
                if(p.getGenero().equals(grupo)){
                    pessoasGenero.get(i).add(p);
                    pessoas.remove(p);
                }
            }
        }
        return  pessoasGenero;
    }

    @Override
    public String toString() {
        return "\nPessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(genero, pessoa.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero);
    }

    @Override
    public int compareTo(Object o) {
        Pessoa pessoa = (Pessoa) o;
        return this.getNome().toLowerCase().compareTo(pessoa.getNome().toLowerCase());
    }
}

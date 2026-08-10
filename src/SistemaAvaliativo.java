import java.util.ArrayList;
import java.util.Comparator;

public class SistemaAvaliativo{
    private ArrayList<Estudante> listaDeResultados = new ArrayList<>();
    private Integer vagasDisponiveis = 2;

    public void inserirEstudante(Estudante e){
        this.listaDeResultados.add(e);
    }

    public ArrayList<Estudante> retornarEstudantesAprovados(){

        ArrayList<Estudante> alunosAprovados = new ArrayList<>();

        this.listaDeResultados.sort(Comparator
                .comparing(Estudante::somaDasPontuacoes)
                .thenComparing(Estudante::getPontuacaoPortugues)
                .thenComparing(Estudante::getIdade)
                .reversed());

        for(int i = 0;i <=this.listaDeResultados.size()-1 ; i++){

            Estudante e = this.listaDeResultados.get(i);
            if (this.vagasDisponiveis != 0){

                alunosAprovados.add(e);
                this.vagasDisponiveis--;

            }else{
                break;
            }
        }
        return alunosAprovados;
    }
}

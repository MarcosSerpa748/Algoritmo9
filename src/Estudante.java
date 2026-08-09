public class Estudante{
    private String nome;
    private Integer pontuacaoMatematica;
    private Integer pontuacaoPortugues;
    private Integer idade;

    public Estudante(String nome,Integer pontuacaoMatematica,Integer pontuacaoPortugues,Integer idade){
        this.nome = nome;
        this.pontuacaoMatematica = pontuacaoMatematica;
        this.pontuacaoPortugues = pontuacaoPortugues;
        this.idade = idade;
    }

    public Estudante(){
        this.nome = "";
        this.pontuacaoMatematica = 0;
        this.pontuacaoPortugues = 0;
        this.idade = 0;
    }

    public Integer getPontuacaoMatematica() {
        return pontuacaoMatematica;
    }

    public void setPontuacaoMatematica(Integer pontuacaoMatematica) {
        this.pontuacaoMatematica = pontuacaoMatematica;
    }

    public Integer getPontuacaoPortugues() {
        return pontuacaoPortugues;
    }

    public void setPontuacaoPortugues(Integer pontuacaoPortugues) {
        this.pontuacaoPortugues = pontuacaoPortugues;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer somaDasPontuacoes(){
        return this.pontuacaoMatematica+this.pontuacaoPortugues;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "Nome do participante:"+this.nome+"\n"+
                "Pontuação em matemática:"+this.pontuacaoMatematica+"\n"+
                "Pontuação em Português:"+this.pontuacaoPortugues+"\n"+
                "Idade do participante:"+this.idade+"\n";
    }
}

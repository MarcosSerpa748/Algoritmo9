import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudante> listaResultados = new ArrayList<>();

        Estudante e1 = new Estudante("Ana",50,30,25);
        Estudante e2 = new Estudante("Bruno",40,40,30);
        Estudante e4 = new Estudante("Carlos",60,30,22);
        Estudante e5 = new Estudante("Fábio",40,50,26);

        listaResultados.add(e1);
        listaResultados.add(e2);
        listaResultados.add(e4);
        listaResultados.add(e5);


        listaResultados.sort(Comparator
                .comparing(Estudante::somaDasPontuacoes).reversed()
                .thenComparing(Estudante::getPontuacaoPortugues).reversed()
                .thenComparing(Estudante::getIdade).reversed());


        for (int i = 0;i<=listaResultados.size()-1;i++){
            System.out.println(listaResultados.get(i));
        }

//        for (int i = 0;i<=listaResultados.size()-1;i++){
//
//            Estudante e = listaResultados.get(i);
//
//            teste2.setPontuacaoMatematica(teste1.getPontuacaoMatematica());
//            teste2.setPontuacaoPortugues(teste1.getPontuacaoPortugues());
//            teste2.setIdade(teste1.getIdade());
//            teste2.setNome(teste1.getNome());
//
//            teste1.setPontuacaoMatematica(e.getPontuacaoMatematica());
//            teste1.setPontuacaoPortugues(e.getPontuacaoPortugues());
//            teste1.setIdade(e.getIdade());
//            teste1.setNome(e.getNome());
//        }

//        System.out.println(teste1);
//        System.out.println(teste2);

//        listaResultados.sort(Comparator.comparing(Estudante::getIdade).reversed());
//
//        for(int i = 0;i<=listaResultados.size()-1;i++){
//            System.out.println(listaResultados.get(i));
//        }
//
//        listaResultados.sort(Comparator.comparing(Estudante::getPontuacaoMatematica).reversed());
//        System.out.println();
//
//        for (int i = 0;i<=listaResultados.size()-1;i++){
//            System.out.println(listaResultados.get(i));
//        }
    }
}
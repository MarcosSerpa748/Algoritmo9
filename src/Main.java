import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SistemaAvaliativo sistema = new SistemaAvaliativo();
        Estudante e1 = new Estudante("Ana",50,30,25);
        Estudante e2 = new Estudante("Bruno",40,40,30);
        Estudante e4 = new Estudante("Carlos",60,30,22);


        sistema.inserirEstudante(e1);
        sistema.inserirEstudante(e2);
        sistema.inserirEstudante(e4);

        ArrayList<Estudante> aprovados = sistema.retornarEstudantesAprovados();

        for(int i = 0;i<=aprovados.size()-1;i++){
            System.out.println(aprovados.get(i));
        }
    }
}
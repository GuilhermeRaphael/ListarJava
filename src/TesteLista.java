import java.util.ArrayList;

public class TesteLista {
    public static void main (String[] args){
        //Declarar uma lista
        ArrayList<String> nomes = new ArrayList<>();
        //Adicionar um item
        nomes.add("Eliane");
        nomes.add("Guilherme");
        nomes.add("Gabriel");
        nomes.add("Roger");

        //percorrer uma lista
        for (int i=0; i< nomes.size(); i++)
        {
            System.out.println(nomes.get(i));
        }

        System.out.println("Adicionando um novo elemento");
        nomes.add(2,"Fatima");
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        //Remover lista
        System.out.println("Removendo um jeito de lista");
        nomes.remove(3);
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        //Buscar item na lista
        if (nomes.contains("Ana"))
        {
            System.out.println("Existe na lista");
        }
        else {
            System.out.println("Nao existe na lista");
        }


        nomes.sort(null);
        for (int i=0; i< nomes.size(); i++)
        {
            System.out.println(nomes.get(i));
        }

        System.out.println("Percorrendo uma lista com foreach");
        for(String nome : nomes){ //para cada nome da lista nomes, vai guardar em nome
            System.out.println(nome);
        }

    }
}

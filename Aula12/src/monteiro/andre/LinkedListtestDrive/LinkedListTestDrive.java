package monteiro.andre.LinkedListtestDrive;

import monteiro.andre.models.Conta;
import monteiro.andre.models.Pessoa;

import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void  main(String [] args){
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa("Midoria","999"));
        pessoas.add(new Pessoa("Bakugou","998"));
        pessoas.add(new Pessoa("Todoroki","997"));
        pessoas.add(0,new Pessoa("Uraraka","1000"));
        pessoas.addFirst(new Pessoa("All Might","001"));

        System.out.println("pessoas: ");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        LinkedList<Conta> contas = new LinkedList<>();
    }
}

package monteiro.andre.ArrayListTestDrive;

import monteiro.andre.models.Conta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListtestDrive {
    public static void  main(String [] args){
        // Cria um Array List com Contas
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(89));
        contas.add(new Conta());
        contas.add(1,new Conta(55));
        contas.addAll(Arrays.asList(new Conta(),
                new Conta(58)));

        System.out.println("Exibe o Array List");
        contas.forEach((conta) -> System.out.println(conta));

        contas.remove(3);
        System.out.println("---------------------");
        System.out.println("Exibe o ArrayList de contas:");
        contas.forEach((conta) -> System.out.println(conta));
    }
}

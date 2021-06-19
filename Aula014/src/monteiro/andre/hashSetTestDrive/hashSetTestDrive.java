package monteiro.andre.hashSetTestDrive;

import monteiro.andre.models.Item;

import java.util.HashSet;
import java.util.Set;

public class hashSetTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new HashSet<>();
        //Adiciona itens no HashSet
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Pera", 2));
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Banana", 3));

        //Passa por todos os seus elementos
        itemSet.forEach( item -> System.out.println(item));
    }

}

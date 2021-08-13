package Generics;

import java.util.HashMap;
import java.util.List;

public class GenericRun {

    public static void main( String [] args){
        Box<Letter> boxOk = new Box();
        Box<Toy> brokenBox = new Box();
        List<Product> products;
        HashMap<Long,Letter> map;

        Letter letter = new Letter();
        letter.setFrom("Murmu");
        letter.setTo("Todo redbee");
        letter.setContent("Esto es una prueba");

        Toy toy = new Toy();
        toy.setOwner("Andy");
        toy.setType("Wody");

        boxOk.setItem( letter);
        brokenBox.setItem(toy);

        Toy otherToy =  brokenBox.getItem();
        System.out.println(otherToy.getOwner());




    }
}

package Generics;

import java.util.List;

public class Box <T> {

    private T item;
    private List<T> items;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}

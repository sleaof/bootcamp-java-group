package com.mercadolibre.jesfernandes.javaoop.aula6.SaveTheRopaSA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Closet {

    private Integer count = 1;
    private HashMap<Integer, List<Clothing>> dictionary = new HashMap<>();

    public Closet(Integer count, HashMap<Integer, List<Clothing>> dictionary) {
        this.count = count;
        this.dictionary = dictionary;
    }

    public Closet() {
    }

    public int addCloset(List<Clothing> clothing){
        this.dictionary.put(this.count, clothing);
        return this.count++;
    }

    public void showCloset(){
        for(Map.Entry<Integer, List<Clothing>> clothing : dictionary.entrySet())  {
            System.out.println(clothing);
        }
    }

    public List<Clothing> giveBack(Integer id) {
        this.dictionary.get(id).forEach(System.out::println);
        this.count--;
        return this.dictionary.remove(id);
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public HashMap<Integer, List<Clothing>> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<Integer, List<Clothing>> dictionary) {
        this.dictionary = dictionary;
    }
}

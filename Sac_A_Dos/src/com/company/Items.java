package com.company;

// Il faut que La classe Item implement l'interface comparable
public class Items  {
    private int weight;
    private int value;

    public Items(int weight, int value){
        this.weight = weight;
        this.value = value;
    }
    // Redéfinir la méthode compareTo, pour pouvoir utilisé la méthode() .sort de l'interface comparable

}

package com.company;

public class Main {

    //MainFactory
    public static void main(String[] args) {
	// write your code here

        Araba hatchbackAraba = ArabaFactory.getAraba("Hatchback");
        Araba sedanAraba = ArabaFactory.getAraba("Sedan");

        System.out.println(hatchbackAraba.getTip());
        System.out.println(sedanAraba.getTip());
    }
}

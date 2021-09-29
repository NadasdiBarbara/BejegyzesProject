package hu.petrik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Bejegyzes> BejegyList= new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
	Bejegyzes b1=new Bejegyzes("Budaházi Bence","Dolgozat");
	Bejegyzes b2= new Bejegyzes("Györgyi Tamás", "Objektumok");
	BejegyList.add(b1);
	BejegyList.add(b2);



    }
}

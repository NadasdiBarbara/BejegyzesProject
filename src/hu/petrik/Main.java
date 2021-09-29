package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static List<Bejegyzes> bejegyList= new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static FileReader fr;
    public static BufferedReader bf;
    public static Random rrnd=new Random();



    public static void main(String[] args) {
	Bejegyzes b1=new Bejegyzes("Budaházi Bence","Dolgozat");
	Bejegyzes b2= new Bejegyzes("Györgyi Tamás", "Objektumok");
	bejegyList.add(b1);
	bejegyList.add(b2);

        int db;
        System.out.print("Adjon meg egy számmot: ");
        db = sc.nextInt();

        for (int i = 0; i < db; i++) {
            System.out.print("Adja meg a szerzőt: ");
            String szerzo = sc.next();
            System.out.print("Adja meg a tartalmát: ");
            String tartalom = sc.next();
            bejegyList.add(new Bejegyzes(szerzo, tartalom));
            //System.out.println(BejegyList);

        }
        fileBeolvas("bejegyzesek.txt");
        like20();

        System.out.print("Második bejegyzés cseréje:  ");
        String bjegyMod = sc.nextLine();
        bejegyList.get(1).setTartalom(bjegyMod);

        System.out.println(bejegyList);

    }
    public static void fileBeolvas(String fileNev){
        try {
            FileReader fr = new FileReader(fileNev);
            BufferedReader bf = new BufferedReader(fr);
            String sor = bf.readLine();
            while(sor != null){
                String[] adatok = sor.split(";");
                bejegyList.add(new Bejegyzes(adatok[0], adatok[1]));
                sor = bf.readLine();
            }
            bf.close();
            fr.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void like20() {
        int bejegyzesekSzorzata = bejegyList.size() * 20;
        for (int i = 0; i < bejegyzesekSzorzata; i++) {
            bejegyList.get(rrnd.nextInt(bejegyList.size())).like();
        }
    }

}

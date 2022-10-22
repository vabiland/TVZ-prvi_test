package hr.tvz.java.helloWorld;

import hr.tvz.java.domainData.Person;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner unosPodataka = new Scanner(System.in);
        System.out.print("Ujnesite svoje ime: ");
        String ime = unosPodataka.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = unosPodataka.nextLine();
        System.out.print("Unesite datum rođenja (u formatu dd.mm.yyyy): ");
        String datumRodString = unosPodataka.nextLine();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate datumRod = LocalDate.parse(datumRodString, formatter);

        Person newPerson = new Person(ime, prezime, datumRod);
        System.out.println("Unijeli ste: ");
        System.out.println("Ime: " + newPerson.getFirstName());
        System.out.println("Prezime: " + newPerson.getLastName());
        System.out.println("Rođeni ste: " + newPerson.getDatumRod().format(formatter));

        DayOfWeek dayOfWeek = datumRod.getDayOfWeek();
        String translatedDayOfWeek = switch (dayOfWeek){
            case MONDAY -> "ponedjeljak";
            case TUESDAY -> "utorak";
            case WEDNESDAY -> "srijeda";
            case THURSDAY -> "cetvrtak";
            case FRIDAY -> "petak";
            case SATURDAY -> "subota";
            case SUNDAY -> "nedjelja";
        };
        System.out.println("Rođeni ste u "+ translatedDayOfWeek + ".");
    }
}

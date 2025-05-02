package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Disk disk = new Disk();
        disk.setKapacita(-1);
        //disk.setKapacita(100_000);
        System.out.println(disk.getKapacita());


    }




}

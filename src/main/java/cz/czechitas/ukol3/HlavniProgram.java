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
        disk.setKapacita(1_000_000_000L);
        disk.setVyuziteMisto(1_000_000_000L);
        //disk.setKapacita(-100);
        System.out.println(disk);


    }


}

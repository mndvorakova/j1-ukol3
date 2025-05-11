package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");


        Pocitac mujPC = new Pocitac();
        System.out.println(mujPC);




        Pamet ram = new Pamet();
        ram.setKapacita(16_000_000_000L); //16GB


        Procesor pcProcesor = new Procesor();
        pcProcesor.setVyrobce("Intel");
        pcProcesor.setRychlost(2_600_000_000L);
        System.out.println(pcProcesor);//2.6 GHz



        Disk disk = new Disk();
        disk.setKapacita(1_000_000_000L);
        disk.setVyuziteMisto(200_000_000L);
        //disk.setVyuziteMisto(-1);
        //disk.setKapacita(-100);
        System.out.println(disk);

        //přidání komponent
        mujPC.setRam(ram);
        mujPC.setCpu(pcProcesor);
        mujPC.setPevnyDisk(disk);

        mujPC.zapniSe();
        System.out.println(mujPC);


        //přidáme soubor
        mujPC.vytvorSouborOVelikosti(100_000_000L); //100 MB
        System.out.println(mujPC);


        mujPC.vypniSe();
        System.out.println(mujPC);




    }


}

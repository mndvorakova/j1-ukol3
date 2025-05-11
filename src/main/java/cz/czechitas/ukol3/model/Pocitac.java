package cz.czechitas.ukol3.model;

public class Pocitac {
    boolean jeZapnuty = false;
    Procesor cpu;
    Pamet ram;
    Disk pevnyDisk;


    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe(){
        if (jeZapnuty) {
            System.err.println("Počítač je již zapnutý");
            return;
        }

        if (cpu == null || ram == null || pevnyDisk == null) {
            System.out.println("Chybí některá z povinných součástí pro zapnutí počítače.");
            return;
        }
        jeZapnuty = true;
        System.out.println("Počítač se zapnul");
    }

    public void vypniSe(){
        if (!jeZapnuty) {
            return;
        }
        jeZapnuty = false;
        System.out.println("Počítač se vypíná");

    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {

        return "PC zapnutý: " + jeZapnuty + ", CPU: " + cpu + ", RAM: " + ram + ", Disk: " + pevnyDisk;
}


}

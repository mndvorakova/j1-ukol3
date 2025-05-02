package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Disk {
    private long kapacita; //bajty
    private long vyuziteMisto;


    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        if (kapacita < 0) {
            System.err.println("Tvůj  počítač nemůže nemít žádnou kapacitu");
            return;
        }
        this.kapacita = kapacita;
    }

    //getter & setter pro vyuziteMisto
    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        if (vyuziteMisto > kapacita) {
            System.err.println("Kapacita disku je plná!");

        }
        if (vyuziteMisto < 0) {
            System.err.println("Využité místo nemůže být záporné");
        }
        this.vyuziteMisto = vyuziteMisto;
    }


    //metoda toString
    @Override
    public String toString() {
        return "Disk: kapacita = " + kapacita + " B, využité místo = " + vyuziteMisto + " B";
    }

}

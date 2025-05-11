package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Disk {
    private long kapacita; //bajty
    private long vyuziteMisto;


    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        if (kapacita <= 0) {
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
            return;

        }
        if (vyuziteMisto < 0) {
            System.err.println("Využité místo nemůže být záporné");
            return;
        }
        this.vyuziteMisto = vyuziteMisto;
    }

    //metoda pro vytvoření souboru
    public void vytvorSouborOVelikosti(long velikost) {
        if (this.vyuziteMisto + velikost <= kapacita) {
            setVyuziteMisto(this.vyuziteMisto + velikost);
        } else {
            System.err.println("Na disk se nevejde soubor  o velikosti " + velikost + " kapacita");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (this.vyuziteMisto - velikost >= 0) {
            setVyuziteMisto(this.vyuziteMisto - velikost);  // Zmenšení využitého místa
        } else {
            System.err.println("Využité místo nemůže být záporné");
        }
    }




    //metoda toString
    @Override
    public String toString() {
        return "Disk: kapacita: " + kapacita + " B, využité místo: " + vyuziteMisto + " B";
    }

}

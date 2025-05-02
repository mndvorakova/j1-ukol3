package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;


    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        Objects.requireNonNull(kapacita);
        if (kapacita <= 0) {
            kapacita = 0;
            System.err.println("Tvůj  počítač nemůže nemít žádnou kapacitu");
            return;
        }

        this.kapacita = kapacita;
    }


}

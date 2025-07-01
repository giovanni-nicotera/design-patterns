package com.giovanninicotera.patterns.gof.creazionali.prototype;

import java.util.Objects;

public class Orco extends UnitaGames {
    public String arma2Mani;
    public int magiaInfernale;

    public Orco() {
        super.tipo = "Orco";
    }

    public Orco(Orco target) {
        super(target);
        super.tipo = "Orco";
        if (target != null) {
            this.arma2Mani = target.arma2Mani;
            this.magiaInfernale = target.magiaInfernale;
        }
    }

    @Override
    public UnitaGames clone() {
        return new Orco(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Orco orc)) return false;
        return Objects.equals(orc.arma2Mani, this.arma2Mani) &&
                orc.magiaInfernale == this.magiaInfernale;
    }
}

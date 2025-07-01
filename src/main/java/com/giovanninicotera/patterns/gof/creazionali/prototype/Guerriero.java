package com.giovanninicotera.patterns.gof.creazionali.prototype;

import java.util.Objects;

public class Guerriero extends UnitaGames {
    public String arma1mano;
    public String scudo;

    public Guerriero() {
        super.tipo = "Guerriero";
    }

    public Guerriero(Guerriero target) {
        super(target);
        super.tipo = "Guerriero";
        if (target != null) {
            this.arma1mano = target.arma1mano;
            this.scudo = target.scudo;
        }
    }

    @Override
    public UnitaGames clone() {
        return new Guerriero(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Guerriero guer)) return false;
        return Objects.equals(guer.arma1mano, this.arma1mano) &&
                Objects.equals(guer.scudo, this.scudo);
    }
}

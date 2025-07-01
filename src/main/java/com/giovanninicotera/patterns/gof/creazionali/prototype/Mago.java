package com.giovanninicotera.patterns.gof.creazionali.prototype;

import java.util.Objects;

public class Mago extends UnitaGames {
    public String magia1;
    public String magia2;
    public String magia3;

    public Mago() {
        super.tipo = "Mago";
    }

    public Mago(Mago target) {
        super(target);
        super.tipo = "Mago";
        if (target != null) {
            this.magia1 = target.magia1;
            this.magia2 = target.magia2;
            this.magia3 = target.magia3;
        }
    }

    @Override
    public UnitaGames clone() {
        return new Mago(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Mago m)) return false;
        return Objects.equals(m.magia1, this.magia1) &&
                Objects.equals(m.magia2, this.magia2) &&
                Objects.equals(m.magia3, this.magia3);
    }
}

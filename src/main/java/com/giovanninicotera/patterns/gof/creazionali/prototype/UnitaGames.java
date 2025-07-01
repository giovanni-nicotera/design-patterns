package com.giovanninicotera.patterns.gof.creazionali.prototype;

import java.util.Objects;

public abstract class UnitaGames implements Cloneable {
    public int puntiVita;
    public int puntiMagia;
    public int livello;
    protected String tipo;

    public UnitaGames() {}

    public UnitaGames(UnitaGames target) {
        if (target != null) {
            this.puntiVita = target.puntiVita;
            this.puntiMagia = target.puntiMagia;
            this.livello = target.livello;
            this.tipo = target.tipo;
        }
    }

    public abstract UnitaGames clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof UnitaGames ug)) return false;
        return ug.puntiVita == this.puntiVita &&
                ug.puntiMagia == this.puntiMagia &&
                ug.livello == this.livello &&
                Objects.equals(ug.tipo, this.tipo);
    }
}

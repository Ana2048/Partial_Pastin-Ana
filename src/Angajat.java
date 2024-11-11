public abstract class Angajat {

    private String nume;
    private int varsta;
    private int nrAniExperienta;
    private int tarifPeOra;
    private int nrOreLucrate;
    private int salariu;


    public Angajat(String nume, int varsta, int nrAniExperienta, int tarifPeOra, int nrOreLucrate) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrAniExperienta = nrAniExperienta;
        this.tarifPeOra = tarifPeOra;
        this.nrOreLucrate=nrOreLucrate;
    }

    public Angajat(){

        nume="fara nume";
        varsta=0;
        nrAniExperienta=0;
        tarifPeOra=0;
        nrOreLucrate=0;


    }

    public String getNume(){return nume;}
    public void setNume(String nume){this.nume=nume;}

    public int getVarsta(){return varsta;}
    public void setVarsta(int varsta){this.varsta=varsta;}

    public int getExperienta(){return nrAniExperienta;}
    public void setExperienta(int experienta ){this.nrAniExperienta=experienta;}

    public int getTarif(){return tarifPeOra;}
    public void setTarif(int tarif){this.tarifPeOra=tarif;}

    public int getNrOreLucrate(){return nrOreLucrate;}
    public void setNrOreLucrate(int nrOre){this.nrOreLucrate=nrOre;}

    public int getSalariu(){return salariu;}
    public void setSalariu(int salariu){this.salariu=salariu;}

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", nrAniExperienta=" + nrAniExperienta +
                ", tarifPeOra=" + tarifPeOra +
                ", nrOreLucrate=" + nrOreLucrate +
                '}';
    }

    public void calculSalariu(int tarif, int nrOre, int bonus){


        salariu= ((tarif * nrOre) + bonus);
    }



}

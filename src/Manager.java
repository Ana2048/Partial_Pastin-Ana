public class Manager extends Angajat{

    private static final int BONUS_NIVEL3=300;
    private int salariu;

    public Manager()
    {
        super();
    }

    public Manager(String nume, int varsta, int nrAniExperienta, int tarifPeOra, int nrOreLucrate) {
        super(nume, varsta, nrAniExperienta, tarifPeOra, nrOreLucrate);
    }

    @Override
    public void calculSalariu(int tarif, int nrOre, int bonus) {
         super.calculSalariu(tarif, nrOre, BONUS_NIVEL3);
    }
}

public class TeamLeader extends Angajat {

    private static final int BONUS_NIVEL2=200;
    private int salariu;

    public TeamLeader(){
        super();
    }

    public TeamLeader(String nume, int varsta, int nrAniExperienta, int tarifPeOra, int nrOreLucrate) {
        super(nume, varsta, nrAniExperienta, tarifPeOra, nrOreLucrate);
    }

    @Override
    public void calculSalariu(int tarif, int nrOre, int bonus) {
        super.calculSalariu(tarif, nrOre, BONUS_NIVEL2);
    }
}

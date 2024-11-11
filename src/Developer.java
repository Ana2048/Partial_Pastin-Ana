public class Developer extends Angajat{

    public static final  int BONUS_NIVEL1 = 100;
    private String task;
    private int nrTaskuri=0;
    private int salariu;

    public Developer(){
        super();
    }

    public Developer(String nume, int varsta, int nrAniExperienta, int tarifPeOra, int nrOreLucrate) {
        super(nume, varsta, nrAniExperienta, tarifPeOra, nrOreLucrate);
    }



    @Override
    public void calculSalariu(int tarif, int nrOre, int bonus) {
         super.calculSalariu(tarif, nrOre,BONUS_NIVEL1);
    }

    public void setTask(String task){this.task=task;}
    public String getTask(){return task;}

    public void rezolvaTaskuri(){

        nrTaskuri++;
    }

    public int getNrTaskuriRezolvate(){
        return nrTaskuri;
    }






}

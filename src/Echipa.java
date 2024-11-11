public class Echipa {

    Angajat [] angajati= new Angajat[20];

    private int nrAngajatiEchipa=0;

    public void adaugaraAngajat(Angajat a)
    {
        angajati[nrAngajatiEchipa]=a;
        nrAngajatiEchipa++;
    }

    public void listAngatiEchipa()
    {
        for(int i=0;i<nrAngajatiEchipa;i++)
        {
            System.out.println(angajati[i].toString());
        }

    }

    public void maximTask(Angajat a, int nrAngajatiEchipa){
        //aici voiam sa fac functia ca sa calculeze primele doua maxime
    }

    public void listAngajatiDupaSalarii(){

        for(int i=0;i<nrAngajatiEchipa;i++)
        {
            for(int j=i;j<nrAngajatiEchipa;j++)
                if(angajati[i].getSalariu()<angajati[j].getSalariu())
                {
                    Angajat temp=angajati[i];
                    angajati[i]=angajati[j];
                    angajati[j]=temp;
                }
        }

        for(int i=nrAngajatiEchipa;i>0;i++)
            System.out.println(angajati[i].getNume());
    }




}

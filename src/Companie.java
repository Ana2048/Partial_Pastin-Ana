public class Companie {

    Echipa [] echipe=new Echipa[5];
    private int nrEchipe=0;


    public void adaugareEchipa(Echipa e){

        echipe[nrEchipe]=e;
        nrEchipe++;
    }

    public void listAngatiCompanie()
    {
        for(int i=0;i< nrEchipe;i++) {

            System.out.println("Angajatii din echipa "+ i);
            echipe[i].listAngatiEchipa();
        }

    }

    public int  getNrEchipe(){return nrEchipe;}


}

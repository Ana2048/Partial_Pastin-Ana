import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in =new Scanner (System.in);

        int nrTotalAngajati= in.nextInt();
        System.out.println("Nr total de angati pentru companie:"+ nrTotalAngajati);
        Companie BigComapany=new Companie();

        Echipa echipa1= new Echipa();

        BigComapany.adaugareEchipa(echipa1);

        TeamLeader t1= new TeamLeader();
        t1.setNume("Ion");
        t1.setVarsta(30);
        t1.setExperienta(5);
        t1.setTarif(10);
        t1.setNrOreLucrate(20);
        TeamLeader t2=new TeamLeader("Marcel", 35,10,20,15);

        Manager m1=new Manager("Victoria", 40,20,50,13);
        Developer d1=new Developer("Ana",24,3,12,30);
        Developer d2=new Developer("Dan", 25,4,13,20);
        Developer d3=new Developer ("D3",30,10,40,15);
        Developer d4=new Developer("D4",45,20,500,8);

        echipa1.adaugaraAngajat(t1);
        echipa1.adaugaraAngajat(t2);
        echipa1.adaugaraAngajat(m1);
        echipa1.adaugaraAngajat(d1);
        echipa1.adaugaraAngajat(d2);
        echipa1.adaugaraAngajat(d3);
        echipa1.adaugaraAngajat(d4);



        BigComapany.listAngatiCompanie();

        d1.setTask("Problema 1");
        d1.rezolvaTaskuri();
        System.out.println(d1.getNume()+"a rezolvat  "+  d1.getNrTaskuriRezolvate()+ "taskuri");

        d2.setTask("Problema 2");
        d2.rezolvaTaskuri();
        d2.rezolvaTaskuri();
        System.out.println(d2.getNume()+"a rezolvat  "+  d2.getNrTaskuriRezolvate()+ "taskuri");

        d3.rezolvaTaskuri();
        d3.rezolvaTaskuri();
        d3.rezolvaTaskuri();
        d3.rezolvaTaskuri();

        d4.rezolvaTaskuri();
        d4.rezolvaTaskuri();
        d4.rezolvaTaskuri();



        System.out.println("Afisam angajatii in functie de salariu");










    }
}
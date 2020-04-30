package Schema_relaterat;

/*
 * @author Måns Abrahamsson
 */
public class TidPunkt {
    public int årtal;
    public int månad; // 1 till 12
    public int dag;
    public int timme;
    public int minut;
    public TidPunkt(int år_inp, int månad_inp, int dag_inp, int timme_inp, int minut_inp){
        årtal=år_inp;
        månad = månad_inp;
        dag=dag_inp;
        timme=timme_inp;
        minut=minut_inp;
    }

    TidPunkt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void skrivTid(){
        System.out.println(årtal + "/" + månad + "/" + dag + "  " + timme + ":" + minut);
    }
    
}

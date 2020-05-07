package Schema_relaterat;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.util.Calendar;
/**
 *
 * @author mansa
 */
public class SchemaFönster {
    public int visadVecka=18;
    JTable[] dagsScheman = new JTable[7];
    ArrayList<JButton>[] Knappar = new ArrayList[7]; 
    public SchemaFönster(JPanel panel){
        for (int i = 0; i < 7; i++) { Knappar[i] = new ArrayList<JButton>(); }
        SkapaRubriker();
        for(int i=0; i<7;i++){
            for(int j=0;j<Knappar[i].size();j++){
                panel.add(Knappar[i].get(j));
            }
        }
        panel.repaint();
    }
    
    public void UppDateraSchemat(JPanel panel, ArrayList<SchemaHändelse> händelser){
        for(int i=0; i<Knappar.length;i++){
            Knappar[i].clear();
        }
        SkapaRubriker();
        //Rita in rätt schemahändelser
        for(int i=0; i<händelser.size();i++){
            Calendar c = Calendar.getInstance();
            c.set(händelser.get(i).startTid.årtal, händelser.get(i).startTid.månad-1, 
                    händelser.get(i).startTid.dag);
            System.out.println("Tiden är = " + c.getTime());
            if(c.get(Calendar.WEEK_OF_YEAR)==visadVecka){
                //RITA UT KNAPPEN FÖR HÄNDELSEN! INTE KLART!
                
            }
        }        
        //Uppdatera den grafiska delen
        for(int i=0; i<7;i++){
            for(int j=0;j<Knappar[i].size();j++){
                panel.add(Knappar[i].get(j));
            }
        }
        panel.repaint();
    }
    
    public void SkapaRubriker(){
        JButton btnMån = new JButton("Måndag");
        btnMån.setBounds(100,0,100,25);
        JButton btnTis = new JButton("Tiddag");
        btnTis.setBounds(200,0,100,25);
        JButton btnOns = new JButton("Onsdag");
        btnOns.setBounds(300,0,100,25);
        JButton btnTor = new JButton("Torsdag");
        btnTor.setBounds(400,0,100,25);
        JButton btnFre = new JButton("Fredag");
        btnFre.setBounds(500,0,100,25);
        JButton btnLös = new JButton("Lördag");
        btnLös.setBounds(600,0,100,25);
        JButton btnSön = new JButton("Söndag");
        btnSön.setBounds(700,0,100,25);
        
        Knappar[0].add(btnMån);
        Knappar[1].add(btnTis);
        Knappar[2].add(btnOns);
        Knappar[3].add(btnTor);
        Knappar[4].add(btnFre);
        Knappar[5].add(btnLös);
        Knappar[6].add(btnSön);
        
        for(int i=0; i<7; i++){
             String[] cNames= {"Test"};
             Object[][] objs ={{"test1"},{"test2"}, {""},{"Matte lektion"}};
             dagsScheman[i]= new JTable(objs, cNames);
             dagsScheman[i].setRowHeight(3, 50);dagsScheman[i].setRowHeight(2, 60);
             dagsScheman[i].setBounds(102*i,0,100,200);
             //panel.add(dagsScheman[i]);
             
        }
        
    }
    
}

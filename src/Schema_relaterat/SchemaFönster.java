package Schema_relaterat;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.util.Calendar;
import javax.swing.JLabel;
/**
 *
 * @author mansa
 */
public class SchemaFönster {
    public int visadVecka=18;
    //ArrayList<JButton>[] Knappar = new ArrayList[7]; //KnappHändelse
    ArrayList<KnappHändelse>[] Knappar = new ArrayList[7];
    public SchemaFönster(JPanel panel){
        
        for (int i = 0; i < 7; i++) { Knappar[i] = new ArrayList<KnappHändelse>(); }
        SkapaRubriker();
        for(int i=0; i<7;i++){
            for(int j=0;j<Knappar[i].size();j++){
                panel.add(Knappar[i].get(j).button);
            }
        }
        //schemat börjar klockan 03:00
        JLabel labels[] = new JLabel[19];
        labels[0] = new JLabel("03:00");
        labels[1] = new JLabel("04:00");
        labels[2] = new JLabel("05:00");
        labels[3] = new JLabel("06:00");
        labels[4] = new JLabel("07:00");
        labels[5] = new JLabel("08:00");
        labels[6] = new JLabel("09:00");
        labels[7] = new JLabel("10:00");
        labels[8] = new JLabel("11:00");
        labels[9] = new JLabel("12:00");
        labels[10] = new JLabel("13:00");
        labels[11] = new JLabel("14:00");
        labels[12] = new JLabel("15:00");
        labels[13] = new JLabel("16:00");
        labels[14] = new JLabel("17:00");
        labels[15] = new JLabel("18:00");
        labels[16] = new JLabel("19:00");
        labels[17] = new JLabel("20:00");
        labels[18] = new JLabel("21:00");
        for(int i=0; i<labels.length;i++){
            labels[i].setBounds(0, 10+(25*i), 100, 50);
            panel.add(labels[i]);
        }
        
        
        panel.repaint();
    }
    
    public SchemaHändelse fåHändelse(JButton input){
        for(int i=0; i<7;i++){
            for(int j=0;j<Knappar[i].size();j++){
                if(Knappar[i].get(j).equals(input)){
                    return Knappar[i].get(j).schemaHändelse;
                }
            }
        }
        return null;
    }
    
    public void UppDateraSchemat(JPanel panel, ArrayList<SchemaHändelse> händelser){
        
        
        for(int i=0; i<7;i++){
            for(int j=0;j<Knappar[i].size();j++){
                panel.remove(Knappar[i].get(j).button);
            }
        }
        for(int i=0; i<Knappar.length;i++){
            Knappar[i].clear();
        }
        //Skapa rubrikerna / dagarna i schemat
        SkapaRubriker();
        //Rita in rätt schemahändelser
        for(int i=0; i<händelser.size();i++){
            Calendar c = Calendar.getInstance();
            c.setFirstDayOfWeek(Calendar.MONDAY);
            c.set(händelser.get(i).startTid.årtal, händelser.get(i).startTid.månad-1, 
                    händelser.get(i).startTid.dag);
            System.out.println("Tiden är = " + c.getTime());
            if(c.get(Calendar.WEEK_OF_YEAR)==visadVecka){
                //RITA UT KNAPPEN FÖR HÄNDELSEN PÅ RÄTT DAG! INTE KLART!
                int dag=c.get(Calendar.DAY_OF_WEEK); 
                switch(dag){
                    case 1:
                        dag=6;
                        break;
                    case 2:
                        dag=0;
                        break;
                    case 3:
                        dag=1;
                        break;
                    case 4:
                        dag=2;
                        break;
                    case 5:
                        dag=3;
                        break;
                    case 6:
                        dag=4;
                        break;
                    case 7:
                        dag=5;
                        break;
                }
                // 25px/h avstånd 
                float händelseLängd=händelser.get(i).slutTid.timme-
                        händelser.get(i).startTid.timme + ((händelser.get(i).slutTid.minut-
                        händelser.get(i).startTid.minut)/60.0f); 
                int pixelLängd =(int)(25*händelseLängd); 
                int pixelStart = (int)(100+(25*(händelser.get(i).startTid.timme+
                        (händelser.get(i).startTid.minut/60.0f)-6)));
                //Hindrar en händelse från att ritas över dagarna
                if(pixelStart<25){
                    pixelStart=25;
                }
                JButton btnHändelse = new JButton(händelser.get(i).händelseNamn); 
                btnHändelse.setBounds(100*(dag)+40,pixelStart,100,pixelLängd);
                btnHändelse.addActionListener((ActionListener) panel);
                Knappar[dag].add(new KnappHändelse(händelser.get(i), btnHändelse));
            }
        }        
        //Uppdatera den grafiska delen
        for(int i=0; i<7;i++){
            for(int j=0;j<Knappar[i].size();j++){
                panel.add(Knappar[i].get(j).button);
            }
        }
        panel.repaint();
    }
    
    public void SkapaRubriker(){
        JButton btnMån = new JButton("Måndag");
        btnMån.setBounds(40,0,100,25);
        JButton btnTis = new JButton("Tiddag");
        btnTis.setBounds(140,0,100,25);
        JButton btnOns = new JButton("Onsdag");
        btnOns.setBounds(240,0,100,25);
        JButton btnTor = new JButton("Torsdag");
        btnTor.setBounds(340,0,100,25);
        JButton btnFre = new JButton("Fredag");
        btnFre.setBounds(440,0,100,25);
        JButton btnLör = new JButton("Lördag");
        btnLör.setBounds(540,0,100,25);
        JButton btnSön = new JButton("Söndag");
        btnSön.setBounds(640,0,100,25);
        
        Knappar[0].add(new KnappHändelse(new SchemaHändelse(), btnMån));
        Knappar[1].add(new KnappHändelse(new SchemaHändelse(), btnTis));
        Knappar[2].add(new KnappHändelse(new SchemaHändelse(), btnOns));
        Knappar[3].add(new KnappHändelse(new SchemaHändelse(), btnTor));
        Knappar[4].add(new KnappHändelse(new SchemaHändelse(), btnFre));
        Knappar[5].add(new KnappHändelse(new SchemaHändelse(), btnLör));
        Knappar[6].add(new KnappHändelse(new SchemaHändelse(), btnSön));
        
        /*for(int i=0; i<7; i++){
             String[] cNames= {"Test"};
             Object[][] objs ={{"test1"},{"test2"}, {""},{"Matte lektion"}};
             dagsScheman[i]= new JTable(objs, cNames);
             dagsScheman[i].setRowHeight(3, 50);dagsScheman[i].setRowHeight(2, 60);
             dagsScheman[i].setBounds(102*i,0,100,200);
             //panel.add(dagsScheman[i]);
             
        }*/
        
    }
    
}

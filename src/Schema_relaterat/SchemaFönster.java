package Schema_relaterat;

import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author mansa
 */
public class SchemaFönster {
    JTable[] dagsScheman = new JTable[7];
    public SchemaFönster(JPanel panel){
        for(int i=0; i<7; i++){
             String[] cNames= {"Test"};
             Object[][] objs ={{"test1"},{"test2"}, {""},{"Matte lektion"}};
             dagsScheman[i]= new JTable(objs, cNames);
             dagsScheman[i].setRowHeight(3, 50);dagsScheman[i].setRowHeight(2, 60);
             dagsScheman[i].setBounds(102*i,0,100,200);
             panel.add(dagsScheman[i]);
             panel.repaint();
        }
    }
    
    
}

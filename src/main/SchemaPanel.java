package main;

import Schema_relaterat.SchemaFönster;
import Schema_relaterat.SchemaHanterare;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @author mansa
 */
public class SchemaPanel extends javax.swing.JPanel {
    //Variabler här:
    SchemaFönster SF;
    SchemaHanterare SH;
    int visadVecka=18;
    /**
     * Creates new form SchemaPanel
     */
    public SchemaPanel() {
        //Schemarelaterat
        SH = new SchemaHanterare();
        SH.skrivUtAllaHändelser();
        //SH.sparaSchema();
        SH.hämtaSchema();
        SH.skrivUtAllaHändelser();
        //Grafik
        initComponents();
        SF = new SchemaFönster(this);
        SF.UppDateraSchemat(this, SH.händelser);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

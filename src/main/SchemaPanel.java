package main;

import Schema_relaterat.SchemaFönster;
import Schema_relaterat.SchemaHanterare;
import Schema_relaterat.SchemaHändelse;
import Schema_relaterat.TidPunkt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mansa
 */
public class SchemaPanel extends javax.swing.JPanel {
    //Variabler här:
    SchemaFönster SF;
    SchemaHanterare SH;
    /**
     * Creates new form SchemaPanel
     */
    public SchemaPanel() {
        
        
        //Schemarelaterat
        SH = new SchemaHanterare();
        SH.skrivUtAllaHändelser();
        //SH.sparaSchema();
        
        SH.hämtaSchema("schemat2.txt");
        SH.skrivUtAllaHändelser();
        //Grafik
        initComponents();
        SF = new SchemaFönster(this);
        SF.UppDateraSchemat(this, SH.händelser);
        //Visar nuvarande vecka när schemat öppnas
        Calendar c = Calendar.getInstance();
        SF.visadVecka=c.get(Calendar.WEEK_OF_YEAR);
        //Sätt standarsvärden i textfield
        tfÅr.setText(Integer.toString(c.get(Calendar.YEAR)));
        tfMånad.setText(Integer.toString(c.get(Calendar.MONTH)+1));
        tfDag.setText(Integer.toString(c.get(Calendar.DAY_OF_MONTH)));
        lbVecka.setText("Vecka " + Integer.toString(SF.visadVecka));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNästaVecka = new javax.swing.JButton();
        btnFöregåendeVecka = new javax.swing.JButton();
        lbVecka = new javax.swing.JLabel();
        tfStartTidTimme = new javax.swing.JTextField();
        tfÅr = new javax.swing.JTextField();
        tfMånad = new javax.swing.JTextField();
        tfDag = new javax.swing.JTextField();
        tfTitel = new javax.swing.JTextField();
        btnSkapaHändelse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfStartTidMinut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfSlutTidMinut = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfSlutTidTimme = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfBeskrivning = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();
        btnLaddaSchema = new javax.swing.JButton();

        btnNästaVecka.setText("Nästa vecka");
        btnNästaVecka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNästaVeckaActionPerformed(evt);
            }
        });

        btnFöregåendeVecka.setText("Föregående vecka");
        btnFöregåendeVecka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFöregåendeVeckaActionPerformed(evt);
            }
        });

        lbVecka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbVecka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVecka.setText("Vecka 18");

        tfÅr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfÅrActionPerformed(evt);
            }
        });

        btnSkapaHändelse.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSkapaHändelse.setText("Skapa");
        btnSkapaHändelse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaHändelseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lägg till schemahändelse");

        jLabel3.setText("År");

        jLabel4.setText("Månad");

        jLabel5.setText("dag");

        jLabel6.setText("Timme");

        jLabel7.setText("Minut");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Starttid");

        jLabel8.setText("Minut");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sluttid");

        jLabel10.setText("Timme");

        jLabel11.setText("Titel");

        jLabel12.setText("beskrivning");

        btnSpara.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSpara.setText("Spara schema");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        btnLaddaSchema.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLaddaSchema.setText("Ladda schema");
        btnLaddaSchema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaddaSchemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 838, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfÅr, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbVecka, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNästaVecka, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFöregåendeVecka, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMånad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDag, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStartTidTimme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStartTidMinut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSkapaHändelse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSlutTidTimme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSlutTidMinut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTitel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBeskrivning))))
                    .addComponent(btnSpara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLaddaSchema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbVecka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnNästaVecka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFöregåendeVecka)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfÅr, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfMånad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfStartTidTimme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfStartTidMinut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfSlutTidTimme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfSlutTidMinut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSkapaHändelse, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLaddaSchema, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSpara)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNästaVeckaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNästaVeckaActionPerformed
        // TODO add your handling code here:
        SF.visadVecka++;
        SF.UppDateraSchemat(this, SH.händelser);
        lbVecka.setText("Vecka " + Integer.toString(SF.visadVecka));
    }//GEN-LAST:event_btnNästaVeckaActionPerformed

    private void btnFöregåendeVeckaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFöregåendeVeckaActionPerformed
        // TODO add your handling code here:
        SF.visadVecka--;
        SF.UppDateraSchemat(this, SH.händelser);
        lbVecka.setText("Vecka " + Integer.toString(SF.visadVecka));
    }//GEN-LAST:event_btnFöregåendeVeckaActionPerformed

    private void tfÅrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfÅrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfÅrActionPerformed

    private void btnSkapaHändelseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaHändelseActionPerformed
        //Skapa händelsen
        int händelseÅr=stringTillInt(tfÅr.getText());
        int händelseMånad=stringTillInt(tfMånad.getText());
        int händelseDag=stringTillInt(tfDag.getText());
        
        TidPunkt startTid = new TidPunkt(händelseÅr, händelseMånad, händelseDag,
                stringTillInt(tfStartTidTimme.getText()),
                stringTillInt(tfStartTidMinut.getText())); //tfStartTidTimme
        
        TidPunkt slutTid = new TidPunkt(händelseÅr, händelseMånad, händelseDag,
                stringTillInt(tfSlutTidTimme.getText()),
                stringTillInt(tfSlutTidMinut.getText()));
        SchemaHändelse nyHändelse = new SchemaHändelse(startTid, slutTid, tfTitel.getText(), tfBeskrivning.getText());
        if(nyHändelse.ärGiltig()){
            SH.läggTillHändelse(nyHändelse);
            SF.UppDateraSchemat(this, SH.händelser);
        }else{
            System.out.println("OGILTIGA alternativ är valda för händelsen");
            //SKRIV UT ATT DEN INTE ÄR GILTIG
        }      
        
    }//GEN-LAST:event_btnSkapaHändelseActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        
        String path="";
        JFileChooser väljare = new JFileChooser();
        väljare.setDialogTitle("Välj var schemat ska sparas");
        väljare.setCurrentDirectory(new java.io.File("."));
        int userSelection = väljare.showSaveDialog(this);
 
        if (userSelection == JFileChooser.APPROVE_OPTION) {
             File fileToSave = väljare.getSelectedFile();
            System.out.println("Filen sparades: " + fileToSave.getAbsolutePath());
            SH.sparaSchema(fileToSave.getAbsolutePath());
        }
        
    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnLaddaSchemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaddaSchemaActionPerformed
        // öppna explorer och ladda 
        String path="";
        JFileChooser väljare = new JFileChooser();
        väljare.setCurrentDirectory(new java.io.File("."));
        väljare.setDialogTitle(path);
        väljare.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        väljare.setFileFilter(filter);
        System.out.println("PATH = " + path);
        String filPosition = "";
        if (väljare.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getSelectedFile() : " 
         +  väljare.getSelectedFile());
            filPosition=väljare.getSelectedFile().toString();
            SH.hämtaSchema(filPosition);
            //SH.skrivUtAllaHändelser();
            SF.UppDateraSchemat(this, SH.händelser);
        }
        
        
    }//GEN-LAST:event_btnLaddaSchemaActionPerformed
    private int stringTillInt(String input){
        int output=0;
        try {
            output = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            //Ge fel
            return -1;
        }
        return output;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFöregåendeVecka;
    private javax.swing.JButton btnLaddaSchema;
    private javax.swing.JButton btnNästaVecka;
    private javax.swing.JButton btnSkapaHändelse;
    private javax.swing.JButton btnSpara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbVecka;
    private javax.swing.JTextField tfBeskrivning;
    private javax.swing.JTextField tfDag;
    private javax.swing.JTextField tfMånad;
    private javax.swing.JTextField tfSlutTidMinut;
    private javax.swing.JTextField tfSlutTidTimme;
    private javax.swing.JTextField tfStartTidMinut;
    private javax.swing.JTextField tfStartTidTimme;
    private javax.swing.JTextField tfTitel;
    private javax.swing.JTextField tfÅr;
    // End of variables declaration//GEN-END:variables
}

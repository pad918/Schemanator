/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema_relaterat;

import javax.swing.JButton;

/**
 *
 * @author mansa
 */
public class KnappHändelse {
    public SchemaHändelse schemaHändelse;
    public JButton button;
    public KnappHändelse(SchemaHändelse sh, JButton btn){
        button=btn;
        schemaHändelse=sh;
    }
}

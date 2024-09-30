package view;

import javax.swing.JOptionPane;

public class Felugro {
    public int felugro_bekeres(){
        return Integer.valueOf(JOptionPane.showInputDialog("Melyikben van a kincs?"))-1;

    }
    
    public void felugro_megjelenites(String szoveg){
        JOptionPane.showMessageDialog(null, szoveg);

    }
}

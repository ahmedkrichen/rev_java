import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Fen3 extends JFrame {

    private String[] columnNames = { "Cin", "Nom", "Prenom","Date","deag" };
    private DefaultTableModel model;
    private JTable t = new JTable();
    private JScrollPane tpan;
    private TraitmentC trait=new TraitmentC();
    private LinkedHashMap<Consultation,Patient> map;

    private void refreshJTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        map=trait.Consultation();
        for (Consultation c : map.keySet()) {
            Patient p=map.get(c);
            model.addRow(new String[] {String.valueOf(c.getCin()),p.getNom(),p.getPrenom(),c.getDate().toString(),c.getDiag()});
        }
        t.setModel(model);
    }

    public Fen3(){
        setTitle("AAAAAAAA");
        setSize(1000,1000);
        refreshJTable();
        tpan = new JScrollPane(t);

        add(tpan);
        setVisible(true);
    }
    
}

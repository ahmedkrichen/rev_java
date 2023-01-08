import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Fen2 extends JFrame implements ActionListener {
    JButton eng=new JButton("eng");
    JTextField date=new JTextField();
    
    // JCalendar date;
    JTextArea diag=new JTextArea();
    JComboBox<Integer> patients=new JComboBox<>();
    TraitmentC t=new TraitmentC();
    ArrayList<Integer> lis=t.getCin();
    Consultation c=new Consultation(null, 0, null);
    
    public Fen2(){

        for(Integer var:lis) 
        { 
        patients.addItem(var);
        }
        
        setTitle("getTitle()");
        setSize(1000,1000);
        setLayout(new GridLayout(4,2));
        add(new JLabel("date"));
        add(date);
        add(new JLabel("liste"));
        add(patients);
        add(new JLabel("Diag"));
        add(diag);
        add(eng);
        eng.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // c.setDate(date.getText());
        c.setCin((int)patients.getSelectedItem());
        c.setDiag(diag.getText());
        t.addConsultation(c);
        
    }
    
}

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Fen1 extends JFrame implements ActionListener{
    JButton b1=new JButton("Saisie");
    JButton b2=new JButton("Afficher");
    public Fen1(){
        setTitle("AAAAAAAA");
        setSize(500,500);
        setLayout(new GridLayout(1,2));
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Fen2();
        }
        else{
            new Fen3();
        }
    }
}

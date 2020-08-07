import javax.swing.*;
import java.awt.event.*;


public class Comboxgus extends JFrame implements ItemListener{
   
   private JComboBox combo1;
   //private JButton boton1;
   
   //private JTextField texto1, texto2;
   //private JScrollPane scrollpane1;
   //private JTextArea textoarea1;
   //String texto = "";
   
   public Comboxgus(){
       setLayout(null);
       combo1 =  new JComboBox();
       combo1.setBounds(10,10,80,30);
       add(combo1);
       combo1.addItem("rojo");
       combo1.addItem("verde");
       combo1.addItem("azul");
       combo1.addItem("amarillo");
       combo1.addItem("negro");
       combo1.addItemListener(this);

       
       //label2 =  new JLabel ("Valor 2:");
       //label2.setBounds(50,35,100,30);
       //add(label2);
       
       //label3 =  new JLabel ("Resultado: ");
       //label3.setBounds(120,80,100,30);
       //add(label3);

       //texto1 = new JTextField();
       //texto1.setBounds(120,10,150,20);
       //add(texto1);	
       
       //texto2 = new JTextField();
       //texto2.setBounds(120,40,150,20);
       //add(texto2);

       //boton1 = new JButton("Sumar");
       //boton1.setBounds(10,80,100,30);
       //add(boton1);
       //boton1.addActionListener(this);

       //textoarea1 = new JTextArea();
       //scrollpane1 = new JScrollPane(textoarea1);
       //scrollpane1.setBounds(10,10,400,300);
       //add(scrollpane1);

       
	}

public void itemStateChanged(ItemEvent e){
   if(e.getSource() == combo1){
        
        String combosele;
        combosele = combo1.getSelectedItem().toString();
	setTitle(combosele); 
        
}
}
 

  public static void main(String args[]){
	Comboxgus Comboxgus1 = new Comboxgus();
        Comboxgus1.setBounds(0,0,300,150);
	Comboxgus1.setVisible(true);
	Comboxgus1.setLocationRelativeTo(null);
	Comboxgus1.setResizable(false);
	
   }
}
 

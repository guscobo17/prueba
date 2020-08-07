import javax.swing.*;
import java.awt.event.*;


public class Lista extends JFrame implements ActionListener{
   //private JLabel label1;
   //private JLabel label2;
   private JButton boton1;
   private JTextField texto1;
   private JScrollPane scrollpane1;
   private JTextArea textoarea1;
   String texto = "";
   
   public Lista(){
       setLayout(null);

       texto1 = new JTextField();
       texto1.setBounds(10,10,200,30);
       add(texto1);	

       boton1 = new JButton("Agregar");
       boton1.setBounds(250,10,100,30);
       add(boton1);
       boton1.addActionListener(this);

       textoarea1 = new JTextArea();
       scrollpane1 = new JScrollPane(textoarea1);
       scrollpane1.setBounds(10,50,400,300);
       add(scrollpane1);

       //label1 =  new JLabel("Usuario:");
       //label1.setBounds(10,10,300,30);
       //add(label1);
       //label2 =  new JLabel ("Version 1.0");
       //label2.setBounds(110,100,100,30);
       //add(label2);
	}

public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
        texto += texto1.getText() + "\n";
	textoarea1.setText(texto);
        texto1.setText("");
}
}
 

  public static void main(String args[]){
	Lista Lista5 = new Lista();
        Lista5.setBounds(0,0,540,400);
	Lista5.setVisible(true);
	Lista5.setLocationRelativeTo(null);
	Lista5.setResizable(false);
	
   }
}
 

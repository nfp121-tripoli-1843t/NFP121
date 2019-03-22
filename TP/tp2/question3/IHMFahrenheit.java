package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );
  

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }
     public static float fahrenheitEnCelsius(int f) {
        float F = (float)5/9*(f-32);
        return F;
    }  
   

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
       // valeur est une String et doit être convertie en entier, voir java.lang.Integer méthode parseInt (--> try/catch)
      
     
  
          int fahrenheit = 0;
        float celsius = 0F;
       
            
            try{
             fahrenheit  = Integer.parseInt(entree.getText().toString());
                 celsius = fahrenheitEnCelsius(fahrenheit);
       if(celsius < -273.1)
            celsius = (float)-273.1;
          
          
        sortie.setText(""+(int)(celsius));
    
    
            }catch(NumberFormatException nfe){
               sortie.setText("error ! ");
                       
                    
              }
            
            }
    
      // à compléter, en appelant la méthode ad'hoc de la question2 
      // un test ici pour le zéro absolu (-273.1)
       



 
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}

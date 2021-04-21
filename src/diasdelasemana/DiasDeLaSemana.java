/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasdelasemana;

/**
 *
 * @author Denilson
 */
import java.util.Scanner;
public class DiasDeLaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner entrada = new Scanner(System.in);
        
        System.out.println("Porfavor introduce un dia de la semana");
        
        MeDia dia = new MeDia();
        
        dia.setDia(entrada.nextLine());

    }

}

class MeDia {
    
    private String dia;
    
    public void setDia(String dia){
        
        this.dia = dia;
        
        if(this.dia.equalsIgnoreCase("Lunes") || this.dia.equalsIgnoreCase("Martes") || 
           this.dia.equalsIgnoreCase("Miercoles") || this.dia.equalsIgnoreCase("Jueves") || 
           this.dia.equalsIgnoreCase("Viernes")){
            
            System.out.println("Dia habil");
        
        } else if(this.dia.equalsIgnoreCase("sabado") || this.dia.equalsIgnoreCase("domingo")){
            System.out.println("Fin de semana");
        } else{
                 System.out.println("Porfavor introduce un dia correcto");
        } 
        
    }
    
}

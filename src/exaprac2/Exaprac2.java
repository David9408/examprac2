/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Exaprac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         int cant=0;
        cant=Integer.parseInt(JOptionPane.showInputDialog ("¿Cuantos trabajadores registrara?"));
        String nombre[]= new String[cant];
        int horas[]= new int [cant];
        double salario[]= new double [cant];
        double tot=0;
        double mayorsueldo=0;
        String nombremayor="";
        String detalle= "\n";
         
        for (int i=0; i<cant; i++){
          nombre[i]=JOptionPane.showInputDialog("Ingrese el nombre del trabajador:"+(i+1));
          nombremayor=nombre[i];
          horas[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero de horas trabajadas:"));
          salario[i]=Double.parseDouble(JOptionPane.showInputDialog(" salario que cobra por cada hora:"));
          tot=horas[i]*salario[i];
         
          detalle+="\nNombre del trabajador:\n"+nombre[i] + "\nHoras trabajadas\n" +horas[i] + "\nSalario por hora\n"+ salario[i] + "\n";
         
          if (tot>mayorsueldo){
              mayorsueldo=tot;
              nombremayor=nombre[i];
          }
            
    }

        JOptionPane.showMessageDialog(null,"\nPlanilla completa\n"+detalle);
     JOptionPane.showMessageDialog(null,"Salario mas alto registrado:"+mayorsueldo );
          JOptionPane.showMessageDialog(null,"Persona que mas dinero gano:"+nombremayor );
          

    
    }    
}

package package1;

import java.util.Scanner;
import package2.Notas;
import package2.Persoal;

/**
 *
 * @author emendezduran
 */
public class Aplicacion {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        Academica a1 = new Academica("ramon",new Persoal(66677788,"ramon@correo.es"));
        
        Notas n1 = new Notas();
        n1.introducirDatosNT1();
        n1.introducirDatosNT2();
        n1.introducirDatosEP();
        n1.introducirDatosB();
       
        
        a1.setNota(n1.calcularNota());
        
        System.out.println(a1.toString());
        
        
        
    }
    
}

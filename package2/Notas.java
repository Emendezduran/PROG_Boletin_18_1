package package2;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Notas {
    
    private float notaTeorico1;
    private float notaTeorico2;
    private float notaPractico1;
    private int boletinesHechos;
    private int boletinesTotales;
    private float nota;
    
    public Notas () {
    }
    
    public boolean verificadorNota(float nota){
        return nota >= 0 && nota <= 10;
    }
 
        public void introducirDatosNT1() {
        Scanner scan = new Scanner(System.in);
        
        do{System.out.println("Nota Examen Teorico 1");
        notaTeorico1 = scan.nextFloat();    
        }while(!verificadorNota(notaTeorico1));
    }

    public void introducirDatosNT2() {
        Scanner scan = new Scanner(System.in);

        do{System.out.println("Nota Examen Teorico 2");
        notaTeorico2 = scan.nextFloat();
        }while(!verificadorNota(notaTeorico2));
    }

    public void introducirDatosEP() {
        Scanner scan = new Scanner(System.in);
      
        do{System.out.println("Nota Examen Practico");
        notaPractico1 = scan.nextFloat();
        }while(!verificadorNota(notaPractico1));
    }

    public void introducirDatosB() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero de Boletines Hechos");
        boletinesHechos = scan.nextInt();

        System.out.println("Numero de Boletines Totales");
        boletinesTotales = scan.nextInt();   
    }
        

    public float calcularNotaTeoricos() {
        float notaTeoricos = ((notaTeorico1 + notaTeorico2) / 2f) * 0.4f;
        return notaTeoricos;
    }

    public float calcularNotaPracticos() {
        float notaPracticos = notaPractico1 * 0.4f;
        return notaPracticos;
    }

    public float calcularPorcentajes() {
        return (100f * boletinesHechos) / boletinesTotales;
    }

    public int puntuarPorcentaje() {
        float porcentaje = calcularPorcentajes();
        if (porcentaje > 90) {
            return 2;
        } else if (porcentaje > 70) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public float calcularNota(){
        return Math.round(calcularNotaTeoricos()+calcularNotaPracticos()+puntuarPorcentaje());
        
    }

   
        
}


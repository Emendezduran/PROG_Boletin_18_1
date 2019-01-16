package package1;

import package2.Persoal;

/**
 *
 * @author emendezduran
 */
public class Academica {
    
   private static int numReferencia = 2018; 
   private String nome;
   private float nota;
   private Persoal alum;

    public Academica(String nome, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean verificadorNota(float nota){
        if (nota >= 0 && nota <= 10){
            return true;
        }else return false;
    }
    
    public boolean setNota(float nota) {
        if(verificadorNota(nota)){ 
        this.nota = nota;
        return true;
        }else return false;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Datos del alumno: " + "nome: " + nome + ", nota: " + nota + ", Informacion de contacto: " + alum;
    }
   
   
}

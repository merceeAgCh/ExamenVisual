import java.util.Scanner;
import javax.swing.*;

/**
 * Created by MAC Examen Programación Visual.
 */
public class Principal {
    public static void main (String []args){
        Scanner read =new Scanner(System.in);
        Alumno alumno_ucad[]= new Alumno[10];
        Profesor profesor_ucad[]= new Profesor[2];
        char i;


        for (i=2; i<10; i++) {
            alumno_ucad[i] = new Alumno();
            JOptionPane.showInputDialog("Nombre del alumno: " );
            alumno_ucad [i].setNombre(read.next());
            JOptionPane.showInputDialog( "A que carrera perteneces?: " );
            alumno_ucad [i].setCarrera(read.next());
            JOptionPane.showInputDialog( "Ingresa calificacion: " );
            alumno_ucad [i].setCalificacion(read.next());
        }
        profesor_ucad[0] = new Profesor("Porfesor de la carrera Patricia ", " 13170001 ");
        profesor_ucad[1] = new Profesor("Alumna: Mercedes Aguilar ", " 15061834");
        for (i=0; i<10; i++){
            JOptionPane.showMessageDialog(null, "Profesor y alumno son: " + profesor_ucad[i].toString());
            JOptionPane.showMessageDialog(null, "Los alumnos y calificaciones son: "+ alumno_ucad.toString());
        }
    }

}
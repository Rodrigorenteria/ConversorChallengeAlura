package conversor.logica;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conversor {
	
	private String Opciones;
	private double Input;
	private String mensaje;
	
	public String setOpciones(String pregunta, String nombreDelPrograma, String[] choices) {
            return Opciones =(String) JOptionPane.showInputDialog(null, (String) pregunta, (String) nombreDelPrograma, JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
		
	}	
	
        public double setInput(String cantidad) {
            Scanner sc = new Scanner(System.in);
            double input = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    input = Double.parseDouble(JOptionPane.showInputDialog(null, (String) cantidad));
                    validInput = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "La cantidad ingresada no es válida, por favor ingrese un número.");
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }
            }
            return input;
        }

	public void setMensaje(String mensaje) {
            JOptionPane.showMessageDialog(null,(String) mensaje);
	}
        
}

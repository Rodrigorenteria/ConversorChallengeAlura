package conversor.logica;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Conversor {
	
	private String Opciones;
	private double Input;
	private String mensaje;
	
	public String setOpciones(String pregunta, String nombreDelPrograma, String[] choices) {
            return Opciones =(String) JOptionPane.showInputDialog(null, (String) pregunta, (String) nombreDelPrograma, JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
		
	}	
	
	public double setInput(String cantidad) {
            try {
                return Input = Double.parseDouble(JOptionPane.showInputDialog(null, (String) cantidad));
            }catch(HeadlessException | NumberFormatException e) {
                return Input = Double.parseDouble(JOptionPane.showInputDialog(null, "La cantidad ingresa no es válida favor de ingresar un número."));
            }
	}

	public void setMensaje(String mensaje) {
            JOptionPane.showMessageDialog(null,(String) mensaje);
	}
        
}

package conversor.logica;

import javax.swing.JOptionPane;

public class IMC {
	
    private double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su estatura en metros"));
    private double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su peso en kilogramos"));
    private double imc = (double)(Math.round((peso/(altura * altura)) * 10))/10;
    private String indice;

    private static String tablaIndice(double imc, String indice) {
        if( imc <= 18.5) {
            indice = " Bajo peso";
            return indice;
        } else if (imc >= 18.5 && imc <= 24.9) {
            indice = " Peso saludable";
            return indice;
        } else if (imc >= 25 && imc <= 29.9) {
            indice = " Sobrepeso";
            return indice;
        } else {
            indice = " Obesidad";
            return indice;
        }
    }

    private String nivelPeso = (String) tablaIndice(this.getImc(),indice);

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getImc() {
        return imc;
    }
    public String getNivelPeso() {
        return nivelPeso;
    }
}

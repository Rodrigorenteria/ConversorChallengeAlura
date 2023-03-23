
package conversor.logica;

import javax.swing.JOptionPane;

public class MultiCalculadora {
    public static void main(String[] a) {
        
        boolean continuar = true;
        
        while(continuar){
            String[] choices = { "Conversor de Divisas", "Conversor de Distancias", "Conversor de Peso", "Conversor de Temperatura", "Calculadora de IMC"};
            String input = (String) JOptionPane.showInputDialog(null, "¿Que herramienta desea utilizar?",
                "Multi-Calculadora", JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
            if(null != input) switch (input) {
            case "Conversor de Divisas" -> {
                Divisas divisas = new Divisas();
                divisas.getConversion();
            }
            case "Conversor de Distancias" -> {
                Distancias distancias = new Distancias();
                distancias.getConversion();
            }
            case "Conversor de Peso" -> {
                Peso peso = new Peso();
                peso.getConversion();
            }
            case "Conversor de Temperatura" -> {
                Temperatura temp = new Temperatura();
                temp.getConversion();
            }
            case "Calculadora de IMC" -> {
                IMC imc = new IMC();
                imc.setAltura(0);
                imc.setPeso(0);
                JOptionPane.showMessageDialog(null,"Su indice de masa corporal es de " + imc.getImc()+ " por lo tanto usted tiene" + imc.getNivelPeso());
            }
            default -> { throw new IllegalArgumentException("Datos invalidos ");}
            }
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar utilizando el programa?", "Continuar", JOptionPane.YES_NO_OPTION);
            continuar = opcion == JOptionPane.YES_OPTION;
        }
    }
}


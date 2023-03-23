package conversor.logica;


public class Divisas extends Conversor{

    private Conversor divisas = new Conversor();
    private String[] choices = {"Peso MXN a Dólar", "Peso MXN a Euro", "Peso MXN a Libras Esterlina", "Peso MXN a Yen Japones", "Peso MXN a Won sul-coreano"
            , "Dólar a MXN","Euros a MXN", "Libras Esterlinas a MXN", "Yen Japonés a MXN", "Won sul-coreano a MXN"};
    private String opcionesDivisas = divisas.setOpciones("¿Que monedas deseas Convertir?", "Conversor de Monedas", this.choices);
    private double inputDivisas = divisas.setInput("Ingresa la Cantidad a Convertir");

    private static double pesoDolar(double peso) {
        double dolar = peso / 18.92;
        return dolar;
    }	
    private static double pesoEuro(double peso) {
        double euro = peso / 20.26;
        return euro;	
    }
    private static double pesoLibraEsterlina(double peso) {
        double libra = peso / 23.01;
        return libra;
    }
    private static double pesoYenJapones(double peso) {
        double yen = peso / .14;
        return yen;
    }
    private static double pesoWonCoreano(double peso) {
        double Won = peso / .1;
        return Won;
    }
    private static double dolarPeso(double dolar) {
        double peso = dolar * 18.92;
        return peso;
    }	
    private static double euroPeso(double euro) {
        double peso = euro * 20.26;
        return peso;	
    }
    private static double libraEsterlinaPeso(double libra) {
        double peso = libra * 23.01;
        return peso;
    }
    private static double yenJaponesPeso(double yen) {
        double peso = yen * .14;
        return peso;
    }
    private static double wonCoreanoPeso(double won) {
        double peso =  won * .1;
        return peso;
    }

    private void conversion(double grados) {
        if(opcionesDivisas != null) switch (opcionesDivisas) {
        case "Peso MXN a Dólar" -> divisas.setMensaje(this.inputDivisas + " pesos Mexicanos son " + (double)(Math.round(pesoDolar(this.inputDivisas) * 100))/100 + " Dólares");
        case "Peso MXN a Euro" -> divisas.setMensaje(this.inputDivisas + " pesos Mexicanos son " + (double)(Math.round(pesoEuro(this.inputDivisas) * 100))/100 + " Euros");
        case "Peso MXN a Libras Esterlina" -> divisas.setMensaje(this.inputDivisas + " pesos Mexicanos son " + (double)(Math.round(pesoLibraEsterlina(this.inputDivisas) * 100))/100 + " Libras Esterlinas");
        case "Peso MXN a Yen Japones" -> divisas.setMensaje(this.inputDivisas + " pesos Mexicanos son " + (double)(Math.round(pesoYenJapones(this.inputDivisas) * 100))/100 + " Yen Japones");
        case "Peso MXN a Won sul-coreano" -> divisas.setMensaje(this.inputDivisas + " pesos Mexicanos son " + (double)(Math.round(pesoWonCoreano(this.inputDivisas) * 100))/100 + " Won sul-coreano");
        case "Dólar a MXN" -> divisas.setMensaje(this.inputDivisas + " Dólares son " + (double)(Math.round(dolarPeso(this.inputDivisas) * 100))/100 + " pesos Mexicanos");
        case "Euros a MXN" -> divisas.setMensaje(this.inputDivisas + " Euros son " + (double)(Math.round(euroPeso(this.inputDivisas) * 100))/100 + " pesos Mexicanos");
        case "Libras Esterlinas a MXN" -> divisas.setMensaje(this.inputDivisas + " Libras Esterlinas son " + (double)(Math.round(libraEsterlinaPeso(this.inputDivisas) * 100))/100 + " pesos Mexicanos");
        case "Yen Japonés a MXN" -> divisas.setMensaje(this.inputDivisas + " Yen Japonés son " + (double)(Math.round(yenJaponesPeso(this.inputDivisas) * 100))/100 + " pesos Mexicanos");
        case "Won sul-coreano a MXN" -> divisas.setMensaje(this.inputDivisas + " Won sul-coreano son " + (double)(Math.round(wonCoreanoPeso(this.inputDivisas) * 100))/100 + " pesos Mexicanos");
        default -> { throw new IllegalArgumentException("Datos invalidos ");}
        }
    }

    public void getConversion() {
       conversion(this.inputDivisas);
    }	
}

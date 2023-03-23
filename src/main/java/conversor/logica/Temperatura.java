package conversor.logica;

public class Temperatura extends Conversor {	
		
    private Conversor temperatura = new Conversor();
    private String[] choices = { "Fahrenheit a Celsius","Fahrenheit a Kelvin","Celsius a Fahrenheit", "Celsius a Kelvin","Kelvin a Fahrenheit", "Kelvin a Celsius" };	
    private String opcionesTemperatura = temperatura.setOpciones("¿Que temperatura deseas convertir?", "Conversor de Temperatura1", this.choices);
    private double inputGrados = (double) temperatura.setInput("Ingrese los grados de temperatura");

    private static double fahrenheitCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }	
    private static double fahrenheitKelvin(double fahrenheit) {
        double celsius = fahrenheitCelsius(fahrenheit);
        double kelvin = celsiusKelvin(celsius);
        return kelvin;
    }
    private static double celsiusFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }
    private static double celsiusKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }
    private static double kelvinFahrenheit(double kelvin) {
        double celsius = kelvinCelsius(kelvin);
        double fahrenheit = celsiusFahrenheit(celsius);
        return fahrenheit;
    }
    private static double kelvinCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }	

    private void conversionTemperatura(double grados) {
        if(null != opcionesTemperatura) switch (opcionesTemperatura) {
        case "Fahrenheit a Celsius" -> temperatura.setMensaje(this.inputGrados + " grados fahrenheit son: " + (double)(Math.round(fahrenheitCelsius(this.inputGrados) * 100))/100 + " grados celsius");
        case "Fahrenheit a Kelvin" -> temperatura.setMensaje(this.inputGrados + " grados fahrenheit son: " + (double)(Math.round(fahrenheitKelvin(this.inputGrados) * 100))/100 + " grados kelvin");
        case "Celsius a Fahrenheit" -> temperatura.setMensaje(this.inputGrados + " grados celsius son: " + (double)(Math.round(celsiusFahrenheit(this.inputGrados) * 100))/100 + " grados fahrenheit");
        case "Celsius a Kelvin" -> temperatura.setMensaje(this.inputGrados + " grados celsius son: " + (double)(Math.round(celsiusKelvin(this.inputGrados) * 100))/100 + " grados kelvin");
        case "Kelvin a Fahrenheit" -> temperatura.setMensaje(this.inputGrados + " grados kelvin son: " + (double)(Math.round(kelvinFahrenheit(this.inputGrados) * 100))/100 + " grados fahrenheit");
        case "Kelvin a Celsius" -> temperatura.setMensaje(this.inputGrados + " grados kelvin son: " + (double)(Math.round(kelvinCelsius(this.inputGrados) * 100))/100 + " grados celsius");
        default -> { throw new IllegalArgumentException("Datos invalidos ");}
        }
    }

    public void getConversion() {
        conversionTemperatura(inputGrados);
    }

}

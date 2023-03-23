package conversor.logica;

public class Distancias {

    private Conversor distancias = new Conversor();
    private String[] choices = {"Metro a Centímetro","Metro a Pulgada", "Metro a Pie", "Metro a Yarda", "Centímetro a Metro",
                    "Pulgada a Metro", "Pie a Metro", "Yarda a Metro"};
    private String opcionesDistancias = distancias.setOpciones("¿Que monedas deseas Convertir?", "Conversor de Monedas", this.choices);
    private double inputDistancias = distancias.setInput("Ingresa la Cantidad a Convertir");

    private static double centimetroMetro(double centrimetro) {
        double metro = centrimetro * 0.01;
        return metro;
    }	
    private static double pulgadaMetro(double pulgada) {
        double metro = pulgada / 39.37008;
        return metro;	
    }
    private static double pieMetro(double pie) {
        double metro = pie / 3.28084;
        return metro;
    }
    private static double yardaMetro(double yarda) {
        double metro = yarda / 1.093613;
        return metro;
    }
    private static double metroCentimetro(double metro) {
        double centrimetro = metro * 100;
        return centrimetro;	
    }
    private static double metroPulgada(double metro) {
        double pulgada = metro * 39.37008;
        return pulgada;	
    }
    private static double metroPie(double metro) {
        double pies = metro * 3.28084 ;
        return pies;
    }
    private static double metroYarda(double metro) {
        double yarda = metro * 1.093613;
        return yarda;
    }

    private void conversion(double grados) {
        if(opcionesDistancias != null) switch (opcionesDistancias) {
        case "Metro a Centímetro" -> distancias.setMensaje(this.inputDistancias + " metros son " + (double)(Math.round(metroCentimetro(this.inputDistancias) * 1000))/1000 + " centímetros");
        case "Metro a Pulgada" -> distancias.setMensaje(this.inputDistancias + " metros son " + (double)(Math.round(metroPulgada(this.inputDistancias) * 1000))/1000 + " pulgadas");
        case "Metro a Pie" -> distancias.setMensaje(this.inputDistancias + " metros son " + (double)(Math.round(metroPie(this.inputDistancias) * 1000))/1000 + " pies");
        case "Metro a Yarda" -> distancias.setMensaje(this.inputDistancias + " metros son " + (double)(Math.round(metroYarda(this.inputDistancias) * 1000))/1000 + " yardas");
        case "Centímetro a Metro" -> distancias.setMensaje(this.inputDistancias + " centímetros son " + (double)(Math.round(centimetroMetro(this.inputDistancias) * 1000))/1000 + " metros");
        case "Pulgada a Metro" -> distancias.setMensaje(this.inputDistancias + " pulgadas son " + (double)(Math.round(pulgadaMetro(this.inputDistancias) * 1000))/1000 + " metros");
        case "Pie a Metro" -> distancias.setMensaje(this.inputDistancias + " pies son " + (double)(Math.round(pieMetro(this.inputDistancias) * 1000))/1000 + " metros");
        case "Yarda a Metro" -> distancias.setMensaje(this.inputDistancias + " yardas son " + (double)(Math.round(yardaMetro(this.inputDistancias) * 1000))/1000 + " metros");
        default -> { throw new IllegalArgumentException("Datos invalidos ");}
        }
    }

    public void getConversion() {
        conversion(this.inputDistancias);
    }

}

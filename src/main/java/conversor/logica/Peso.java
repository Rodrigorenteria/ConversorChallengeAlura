package conversor.logica;

public class Peso {

	private Conversor peso = new Conversor();
	private String[] choices = {"Gramo(gr) a Miligramo (mg)", "Gramo(gr) a Kilogramo(kg)", "Gramo(gr) a Onza (Oz)", "Gramo(gr) a Libra(lb)",
			"Miligramo (mg) a Gramo(gr)", "Kilogramo(kg) a Gramo(gr)", "Onza(Oz) a Gramo(gr)", "Libra(lb) a Gramo(gr)"};
	private String opcionesPeso = peso.setOpciones("¿Que unidades de peso deseas convertir?", "Conversor de Peso", this.choices);
	private double inputPeso = peso.setInput("Ingresa la cantidad a convertir");

	private static double gramoMiligramo(double gramo) {
            double miligramo = gramo * 1000 ;
            return miligramo;
	}	
	private static double gramoKilogramo(double gramo) {
            double kilogramo = gramo / 1000;
            return kilogramo;	
        }
	private static double gramoOnza(double gramo) {
            double onza = gramo * 0.03527396;
            return onza;
	}
	private static double gramoLibra(double gramo) {
            double libra = gramo * 0.002204623;
            return libra;
	}
	private static double miligramoGramo(double miligramo) {
            double gramo = miligramo / 1000;
            return gramo;
	}	
	private static double kilogramoGramo(double kilogramo) {
            double gramo = kilogramo * 1000;
            return gramo;	
        }
	private static double onzaGramo(double onza) {
            double gramo = onza / 0.03527396;
            return gramo;
	}
	private static double libraGramo(double libra) {
            double gramo = libra / 0.002204623;
            return gramo;
	}
	
	private void conversion(double grados) {
            if(null != opcionesPeso) switch (opcionesPeso) {
            case "Gramo(gr) a Miligramo (mg)" -> peso.setMensaje(this.inputPeso + " gramos son " + (double)(Math.round(gramoMiligramo(this.inputPeso) * 1000))/1000 + " Miligramos");
            case "Gramo(gr) a Kilogramo(kg)" -> peso.setMensaje(this.inputPeso + " gramos son " + (double)(Math.round(gramoKilogramo(this.inputPeso) * 1000))/1000 + " Kilogramos");
            case "Gramo(gr) a Onza (Oz)" -> peso.setMensaje(this.inputPeso + " gramos son " + (double)(Math.round(gramoOnza(this.inputPeso) * 1000))/1000 + " Onzas");
            case "Gramo(gr) a Libra(lb)" -> peso.setMensaje(this.inputPeso + " gramos son " + (double)(Math.round(gramoLibra(this.inputPeso) * 100000))/100000 + " Libras");
            case "Miligramo (mg) a Gramo(gr)" -> peso.setMensaje(this.inputPeso + " miligramos son " + (double)(Math.round(miligramoGramo(this.inputPeso) * 1000))/1000 + " Gramos");
            case "Kilogramo(kg) a Gramo(gr)" -> peso.setMensaje(this.inputPeso + " kilogramos son " + (double)(Math.round(kilogramoGramo(this.inputPeso) * 1000))/1000 + " Gramos");
            case "Onza(Oz) a Gramo(gr)" -> peso.setMensaje(this.inputPeso + " onzas son " + (double)(Math.round(onzaGramo(this.inputPeso) * 1000))/1000 + " Gramos");
            case "Libra(lb) a Gramo(gr)" -> peso.setMensaje(this.inputPeso + " libras son " + (double)(Math.round(libraGramo(this.inputPeso) * 1000))/1000 + " Gramos");
            default -> { throw new IllegalArgumentException("Datos invalidos ");}
            }
	} 

	public void getConversion() {
            conversion(this.inputPeso);
	}
}

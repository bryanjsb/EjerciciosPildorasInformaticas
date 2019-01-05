package poo;

public class Coche {

    private String tipo;
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int asientos;
    private int pesoFinal;
    private boolean climatizador, asientosCuero;

    public Coche() {
        tipo = "Coche";
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
        color = "azul";
        pesoFinal = pesoPlataforma;
        climatizador = false;
        asientosCuero = false;
    }

    public String getTipo() {
        return tipo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPesoPlataforma() {
        return pesoPlataforma;
    }

    public String getColor() {
        return color;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getPesoFinal() {
        return pesoFinal;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setPesoFinal(int p) {
        pesoFinal = p;
    }

    public void incorporarClimatizador() {
        climatizador = true;
    }

    public void incorporarAsientoCuero() {
        asientosCuero = true;
    }

    public String mostrarAsientos() {
        if (asientosCuero) {
            return ("Tiene Asientos de cuero");
        } else {
            return ("NO tiene Asientos de cuero");
        }
    }

    public String mostrarClimatizador() {
        if (climatizador) {
            return ("Tiene climatizador");
        } else {
            return ("NO tiene climatizador");
        }
    }

    public String precioTotal() {
        int precioFinal = 100000;

        if (asientosCuero) {
            precioFinal += 500;
        }
        if (climatizador) {
            precioFinal += 200;
        }
        return "El precio de carro es: " + precioFinal;
    }

    public String pesoTotal() {
        int pesoFinal =0;
        pesoFinal=1000 + pesoPlataforma;

        if (asientosCuero) {
            pesoFinal += 50;
        }
        if (climatizador) {
            pesoFinal += 20;
        }
        return "El peso de carro es: " + pesoFinal;
    }

    public String dimeDatosCoche() {
        return "Tipo de coche: " + tipo + "\n" + "el coche es de color: " + color + "\ntiene  " + ruedas + " ruedas \n"
                + "Largo: " + largo + "cm\nAncho: " + ancho + "cm\n" + this.mostrarAsientos() + "\n" + this.mostrarClimatizador()
                + "\n" + this.pesoTotal() + "\n" + this.precioTotal();
    }

}

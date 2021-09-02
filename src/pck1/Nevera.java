package pck1;

public class Nevera extends Eletrodomestico {
    private  String marca;
    private  double capacidad;

    public Nevera(String consumo, String procedencia, String marca, double capacidad) {
        super(consumo, procedencia);
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double precioNevera() {
        double precioF = 0, precioIni = 0;
        switch (getConsumo()) {
            case "A":
                precioIni = 450000;
                break;
            case "B":
                precioIni = 350000;
                break;
            case "C":
                precioIni = 250000;
                break;
            default:
                System.out.println("ingrese una opcion correcta(A,B;C)");
                break;

        }
        switch (getProcedencia()) {
            case "NACIONAL":
                precioIni += 250000;
                break;
            case "IMPORTADO":
                precioIni += 350000;
                break;
            default:
                System.out.println("ingrese una opcion correcta(NACIONAL Ó IMPORTADO)");
                break;
        }
        if(capacidad > 120){
            double litrosExtra = 0;
            litrosExtra = capacidad -= 120;
            double cantAumentos = litrosExtra/10;
            precioF = precioIni*(0.05*cantAumentos);
            precioF += precioIni;

        }


        return precioF;


    }

}

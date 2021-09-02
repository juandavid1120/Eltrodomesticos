package pck1;

import javax.xml.bind.annotation.XmlType;

public class Televisor extends Eletrodomestico {
    private String marca;
    private double Tamaño;

    private boolean TDT;

    public Televisor(String consumo, String procedencia, String marca, double tamaño, boolean TDT) {
        super(consumo, procedencia);
        this.marca = marca;
        this.Tamaño = tamaño;
        this.TDT = TDT;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    /*public void tieneTDT(String isTDT) {
        if (isTDT.equalsIgnoreCase("si")) {
            this.TDT=true;
        }
        else {
            this.TDT=false;

        }
    }*/

    public void setTamaño(double tamaño) {
        Tamaño = tamaño;
    }

    public double precioTv() {
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

        if (Tamaño > 40 && TDT == true) {
            precioF = (precioIni * 1.30) + 250000;

        } else if (Tamaño > 40 && TDT == false) {
            precioF=precioIni*1.30;

        }else if ( TDT == true) {
            precioF=precioIni+250000;

        }
        return precioF;


        }


}


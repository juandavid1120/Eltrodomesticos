package pck1;

public class Eletrodomestico {
    private String consumo;
    private String procedencia;
    private String nombre ;

    public Eletrodomestico(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double precioElectrodomestico() {
        double precioIni = 0;
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
        return precioIni;
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "consumo='" + consumo + '\'' +
                ", procedencia='" + procedencia + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

import java.util.ArrayList;

public class Moto extends Automovel{
    static ArrayList<Moto> listaMotos = new ArrayList<Moto>();

    private double cilindrada;
    private String pezinho;
    private String tipoCapacete;

    public Moto(){

    }

    @Override
    public String toString() {
        return super.toString()+"Moto{" +
                "cilindrada=" + cilindrada +
                ", pezinho=" + pezinho +
                ", tipoCapacete='" + tipoCapacete + '\'' +
                '}';
    }

    public Moto(String placa, double valor, String modelo, double cilindrada, String pezinho, String tipoCapacete) {
        super(placa, valor, modelo);
        this.cilindrada = cilindrada;
        this.pezinho = pezinho;
        this.tipoCapacete = tipoCapacete;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String isPezinho() {
        return pezinho;
    }

    public void setPezinho(String pezinho) {
        this.pezinho = pezinho;
    }

    public String getTipoCapacete() {
        return tipoCapacete;
    }

    public void setTipoCapacete(String tipoCapacete) {
        this.tipoCapacete = tipoCapacete;
    }
}

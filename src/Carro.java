import java.util.ArrayList;

public class Carro extends Automovel{
    static ArrayList<Carro> listaCarros = new ArrayList<Carro>();

    private int qtdPortas;
    private double cavalos;
    private double portaMalas;

    public Carro(){

    }

    @Override
    public String toString() {
        return super.toString()+"Carro{" +
                "qtdPortas=" + qtdPortas +
                ", cavalos=" + cavalos +
                ", portaMalas=" + portaMalas +
                '}';
    }

    public Carro(String placa, double valor, String modelo, int qtdPortas, double cavalos, double portaMalas) {
        super(placa, valor, modelo);
        this.qtdPortas = qtdPortas;
        this.cavalos = cavalos;
        this.portaMalas = portaMalas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public double getCavalos() {
        return cavalos;
    }

    public void setCavalos(double cavalos) {
        this.cavalos = cavalos;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public double getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(double portaMalas) {
        this.portaMalas = portaMalas;
    }
}

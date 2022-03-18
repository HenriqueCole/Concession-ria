import java.util.ArrayList;

public class Automovel {
    static ArrayList<Automovel> listaVendas = new ArrayList<Automovel>();

    private String placa;
    private double valor;
    private String modelo;

    public Automovel(String placa, double valor, String modelo) {
        this.placa = placa;
        this.valor = valor;
        this.modelo = modelo;
    }

    public Automovel() {

    }

    @Override
    public String toString() {
        return "Automovel{" +
                "placa='" + placa + '\'' +
                ", valor=" + valor +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

public class CarroLuxo extends Veiculo{
    private int qtdAir;
    private String tamanhoPortaMalas;
    private boolean possuiGps;

    public CarroLuxo(String marca, String modelo, String placa, int ano, double valor, double multa,
            int qtdAir, String tamanhoPortaMalas, boolean possuiGps) {
        super(marca, modelo, placa, ano, valor, multa);
        this.qtdAir = qtdAir;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.possuiGps = possuiGps;
    }

    public int getQtdAir() {
        return qtdAir;
    }

    public void setQtdAir(int qtdAir) {
        this.qtdAir = qtdAir;
    }

    public String getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(String tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean isPossuiGps() {
        return possuiGps;
    }

    public void setPossuiGps(boolean possuiGps) {
        this.possuiGps = possuiGps;
    }

    @Override
    public double CalculoMulta(){
        if (getRenovacoes()>5) {
            return (getRenovacoes()-5) * getMulta();
        }else return 0;
    }
}
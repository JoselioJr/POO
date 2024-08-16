public class CarroSuv extends Veiculo{
    private String tamanhoPortaMalas;
    private String tipoTracao;
    private String tipoCombustivel;

    public CarroSuv(String marca, String modelo, String placa, int ano, double valor, double multa,
            String tamanhoPortaMalas, String tipoTracao, String tipoCombustivel) {
        super(marca, modelo, placa, ano, valor, multa);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(String tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public double CalculoMulta(){
        if (getRenovacoes()>3) {
            return (getRenovacoes()-3) * getMulta();
        }else return 0;
    }
}
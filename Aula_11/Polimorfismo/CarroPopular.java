public class CarroPopular extends Veiculo{
    private boolean possuiAr;

    public CarroPopular(String marca, String modelo, String placa, int ano, double valor, double multa,
            boolean possuiAr) {
        super(marca, modelo, placa, ano, valor, multa);
        this.possuiAr = possuiAr;
    }

    public boolean isPossuiAr() {
        return possuiAr;
    }

    public void setPossuiAr(boolean possuiAr) {
        this.possuiAr = possuiAr;
    }

    @Override
    public double CalculoMulta(){
        if (getRenovacoes()>1) {
            return (getRenovacoes()-1) * getMulta();
        }else return 0;
    }
}
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valor;
    private double multa;
    private int renovacoes;
    private boolean emprestado;

    public Veiculo(String marca, String modelo, String placa, int ano, double valor, double multa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valor = valor;
        this.multa = multa;
        this.renovacoes = 0;
        this.emprestado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }
    
    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public abstract double CalculoMulta();
}
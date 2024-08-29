package modelo;

public class Financiamento {


    private double valormovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public double getValorMovel(){
        return valormovel;
    }

    public int getPrazoFinanciamento(){
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){
        return taxaJurosAnual;
    }


    public Financiamento(double valormovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valormovel = valormovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    double CalcularpagamentoMensal() {
        return(this.valormovel /(this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual/ 12) );


    }

    double calcularTotalPagamento(){
        return this.CalcularpagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void mostraDados(){
        System.out.println("Os valor do imovel: "+getValorMovel()+" O valor do financiamento: "+calcularTotalPagamento());
    }





}


import javax.swing.text.MaskFormatter;

public class Faturamento {
    private double [] valoresEstados = new double [5];
    private double sp;
    private double rj;
    private double mg;
    private double es;
    private double outros;

    public Faturamento(double[] valoresEstados){
        this.valoresEstados = valoresEstados;
    }

    public double[] getValoresEstados() {
        return valoresEstados;
    }

    public void setValoresEstados(double[] valoresEstados) {
        this.valoresEstados = valoresEstados;
    }

    public double getEs() {
        return es;
    }
    public void setEs(double es) {
        this.es = es;
    }
    public double getMg() {
        return mg;
    }
    public void setMg(double mg) {
        this.mg = mg;
    }
    public double getOutros() {
        return outros;
    }
    public void setOutros(double outros) {
        this.outros = outros;
    }
    public double getRj() {
        return rj;
    }
    public void setRj(double rj) {
        this.rj = rj;
    }
    public double getSp() {
        return sp;
    }
    public void setSp(double sp) {
        this.sp = sp;
    }

    public double faturamentoTotal(){
        double soma = 0;

        for(int i =0; i < valoresEstados.length; i++){
            soma = soma + valoresEstados[i];
        }

        
        return soma;
    }

    public String percentual(){
        double total = faturamentoTotal();

        sp = valoresEstados[0];
        mg = valoresEstados[1];
        es = valoresEstados[2];
        outros = valoresEstados[3];

        double percentualSp = (sp*100) / total;
        double percentualMg = (mg*100) / total;
        double percentualEs = (es*100) / total;
        double percentualOutros = (outros*100) / total;

        return "\nPercentual SP: "+ percentualSp+ "\nPercentual MG: "+ percentualMg+ "\nPercentual ES: "+ percentualEs+
        "\nPercental Outros:  "+ percentualOutros;
    }
}
public class Faturamento {
    
    private int dias;
    private double [] valores = new double [dias+1]; 

    public Faturamento(double[] valores, int dias){
        this.valores = valores;
        this.dias = dias;
    }
    
    public double[] getValores() {
        return valores;
    }

    public void setValores(double[] valores) {
        this.valores = valores;
    }

    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }

    public  double maiorValor(){
        double maior = 0;

        for(int i=0; i < valores.length; i++){
            if(valores[i] > maior){
                maior = valores[i];
            }
        }

        return maior;
    }

    public double menorValor(){
        double menor = maiorValor();

        for(int i=0; i < valores.length; i++){
            if(valores[i] < menor){
                menor = valores[i];
            }
        }

        return menor;
    }

    public String superiorMedia(){
        double soma = 0;
        double media;
        int c = 0;

        for(int i =0; i < valores.length; i++){
            if(valores[i] != 0.0){
                soma = soma + valores[i]; 
            }
          
        }

        media = soma / valores.length;

        for(int j =0; j < valores.length; j++){
            if(valores[j] > media){
                c++;
            }
        }

        return "\nMédia: "+ media+"\nDias superiores a média: "+c;
    }
}

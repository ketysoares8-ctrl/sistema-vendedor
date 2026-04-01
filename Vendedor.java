public class Vendedor {
     private float vendas;
     private float salarioBase;
     private String nome;
     private int falta;

     //construtor
     public Vendedor(float v, float s, String n, int f){
        this.vendas = v;
        this.salarioBase =s;
        this.nome = n;
        this.falta = f;

     }


     public void setNome(String nome){
         this.nome = nome;
     }
      public String getNome(){
            return this.nome;
        }
     public void setSalarioBase(float salarioBase){
        this.salarioBase= salarioBase;
     }   
     public float getSalarioBase(){
        return this.salarioBase;
     }
     public void setVendas(float vendas){
        this.vendas=vendas;
     }
     public float getVendas(){
        return this.vendas;
     }
     public void setFalta(int falta){
        this.falta=falta;
     }
     public int getFalta(){
        return this.falta;
     }


     public float calcularComissao(){
        if ((vendas >= 1000) && (vendas < 2000) ){
            return vendas*0.10f;
        } else if (vendas >= 2000){
            return vendas*0.15f;
        } else {
            return vendas*0f;
        }
     }


     public float descontoFalta(){
        return (salarioBase/30)* falta;
     }


    public float calcularSalario(){
        return (salarioBase + calcularComissao() - descontoFalta());
    }
}

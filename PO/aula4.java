public class aula4 {
    String agencia, numero;
    Float taxa,saldo;

    public static void main(String[] args) {
        
    }
    public aula4 () {}
    public aula4 (String agencia, String numero,        
                    float saldo, float taxa){
                        this.agencia = agencia;
                        this.numero = numero;
                        this.saldo = saldo;
                        this.taxa = taxa;
                    }
        void depositar (float valor){
            saldo = saldo + valor; // saldo do valor
        }

        float calculaRendimento (){
            float rendimento;
            rendimento = saldo * taxa/ 100;
            return rendimento;

        }
    }


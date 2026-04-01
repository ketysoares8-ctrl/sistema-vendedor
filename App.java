import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class App {

    int totalCadastrado;
    Vendedor[] listaVendedores = new Vendedor[10];
    
    public static void main (String[] args) {
    new App();
    }

    public App(){
        int opcao = 0;
        do{
            String menu = " --- GESTÃO DE VENDEDORES ---\n"     
                            + "1. Cadastrar Vendedor\n"
                            + "2. Exibir Relatório (Grid)\n"
                            + "3. Sair";

        String leitura = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);
        if (leitura == null) break;
        opcao = Integer.parseInt(leitura); 
        
        switch (opcao) {
            case 1:
                cadastrarVendedor();
                break;
            case 2:
                exibirRelatorio();
                break;  
        }    
                      
        } while (opcao != 3);
    }

         public void cadastrarVendedor() {

             if (totalCadastrado == 10){
                    JOptionPane.showMessageDialog(null, "Limite de 10 vendedores atingido!");
                    return;
             }

            JTextField campoNome = new JTextField();
            JTextField campoSalarioB = new JTextField();
            JTextField campoVendas = new JTextField();
            JTextField campoFalta = new JTextField();
         
            Object[] formulario = {"Nome:", campoNome,
                                    "Salário Base", campoSalarioB,
                                    "Total de Vendas:", campoVendas,
                                     "Quantidade de Faltas:", campoFalta
            };
        
            int result = JOptionPane.showConfirmDialog(null, formulario, "NovoCadastro", JOptionPane.OK_CANCEL_OPTION);

            if (result== JOptionPane.OK_OPTION) {
                String n = campoNome.getText();
                float s = Float.parseFloat(campoSalarioB.getText());
                float v = Float.parseFloat(campoVendas.getText());
                int f = Integer.parseInt(campoFalta.getText());

                Vendedor novoVendedor = new Vendedor(v, s, n, f);
                listaVendedores[totalCadastrado]= novoVendedor;

                totalCadastrado++;

                JOptionPane.showMessageDialog(null, "Vendedor(a) " + n + " cadastrado!");
            
            }        
            }  
        public void exibirRelatorio(){

            if (totalCadastrado == 0){
                JOptionPane.showMessageDialog(null, "Nenhum vendedor cadastrado!");
                return;
            }
            java.util.Arrays.sort(listaVendedores, 0, totalCadastrado, (v1, v2) -> v1.getNome().
                compareToIgnoreCase(v2.getNome()));


            String grid = "NOME  | SALÁRIO FINAL\n";
            grid += "-----------------------------\n";

         
            for(int i = 0; i < totalCadastrado; i ++){
                Vendedor v = listaVendedores[i];
                grid+=v.getNome() + " | R$ " + v.calcularSalario() + "\n";
            }

            JOptionPane.showMessageDialog(null, grid);

            String[]colunas ={"Nome","Salário", "Vendas", "Faltas", "Comissão"};
            
            Object[][] dados = new Object[totalCadastrado][5];

            for (int i = 0; i < totalCadastrado; i++) {
            dados[i][0] = listaVendedores[i].getNome();
            dados[i][1] = listaVendedores[i].getSalarioBase();
            dados[i][2] = listaVendedores[i].getVendas();
            dados[i][3] = listaVendedores[i].getFalta();
            dados[i][4] = listaVendedores[i].calcularComissao();
            }
            
         JTable tabela = new JTable(dados, colunas);
        
        // 4. Colocar a tabela dentro de um JScrollPane para aparecer o cabeçalho
        JScrollPane scroll = new JScrollPane(tabela);

        // 5. Exibir tudo no JOptionPane
        JOptionPane.showMessageDialog(null, scroll, "Relatório", JOptionPane.PLAIN_MESSAGE);
    }
                
                
            
                                                  
         
        

            
     
} 


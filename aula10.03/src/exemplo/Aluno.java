/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo;

import javax.swing.JOptionPane;


public class Aluno {

     String nome;
     String cpf;
    
public void preencher() {
    
    nome= JOptionPane.showInputDialog("Nome");
    cpf= JOptionPane.showInputDialog("Cpf");
          
    }
  public void exibir (){
      JOptionPane.showMessageDialog(null, nome + "\n" + cpf );
  }
    
}

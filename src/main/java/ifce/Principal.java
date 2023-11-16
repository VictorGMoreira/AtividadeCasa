

package ifce;

import modelo.Porta;


public class Principal {

    public static void main(String[] args) {
       
        Porta minhaPorta = new Porta();
        
        minhaPorta.abrir();
        System.out.println("Está aberta?"+ minhaPorta.estaAberta());
        
        minhaPorta.fechar();
        System.out.println("Está aberta?"+ minhaPorta.estaAberta());
        
        minhaPorta.pintar("azul");
         System.out.println("Cor da porta:"+ minhaPorta.cor);
         
         minhaPorta.altura = 2.5;
         minhaPorta.comprimento = 1.0;
         System.out.println("Dimensoes da porta - Altura: "+ minhaPorta.altura+ "Comprimento: "+ minhaPorta.comprimento);
         
         
         
        
        
    }
}

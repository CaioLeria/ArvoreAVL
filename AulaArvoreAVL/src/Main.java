import AVLint.AVLint;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Scanner sc = new Scanner(System.in);

      int opcao=0;
        AVLint avl = new AVLint();
        do{
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Mostra fator baleanceamento");
            System.out.println("3 - Remove o nó escolhido ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Sistema encerrando");
                    break;
                case 1:
                    System.out.println("informe o valor a ser inserido: ");
                    int valor = sc.nextInt();
                    avl.root=avl.inserirAVL(avl.root,valor);
                    avl.atualizaAlturas(avl.root);
                    break;
                case 2:
                    System.out.println("Apresentando AVL");
                    avl.mostraFB(avl.root);
                    break;
                case 3:
                    System.out.println("informe o valor a ser removido:");
                    valor=sc.nextInt();
                    avl.root = avl.removeValor(avl.root,valor);
                    avl.root = avl.atualizaAlturaBalanceamento(avl.root);
                    avl.atualizaAlturas(avl.root);
                    break;
                default:
                    System.out.println("opçao invalida");
            }
        } while(opcao!=0);
    }
}
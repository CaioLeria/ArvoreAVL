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
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Sisema encerrando");
                    break;
                case 1:
                    System.out.println("imforme o valor a ser inserido: ");
                    int valor = sc.nextInt();
                    avl.root=avl.inserirH(avl.root,valor);
                    break;
                case 2:
                    System.out.println("Aresentando AVL");
                    avl.mostraFB(avl.root);
                    break;
                default:
                    System.out.println("opçao invalida");
            }
        } while(opcao!=0);
    }
}
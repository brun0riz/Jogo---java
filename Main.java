import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner lala = new Scanner(System.in);
        int opcao = 0, x, y;

        System.out.print("Informe a quantidade de linhas: ");
        int tl = lala.nextInt();

        System.out.print("Informe o tamanho de colunas: ");
        int tc = lala.nextInt();

        System.out.println("Informe a posicao inical(X)");
        int posX = lala.nextInt();

        System.out.println("Informe a posicao inical(Y)");
        int posY = lala.nextInt();

        lala.nextLine();

        System.out.print("Informe o formato do personagem: ");
        String formato = lala.nextLine();

        Personagem loulou = new Personagem(posX, posY, formato);
        Personagem2 laulau = new Personagem2(3, 2,"D");
        Personagem3 liuliu = new Personagem3(5,1, "E");


        for (y = 0; y < tc; y++) {
                for (x = 0; x < tl; x++) {

                    if (loulou.getPosX() - 1 == x && loulou.getPosY() - 1 == y)
                    {
                        System.out.print("\t[ "+ loulou.formato +" ]");
                    }else{
                        System.out.print("\t[ . ]");
                    }
                }
                System.out.println();
        }

        while(opcao != 5)
        {
            System.out.println("escolha uma opção");
            System.out.println("[1] Cima");
            System.out.println("[2] Baixo");
            System.out.println("[3] Esquerda");
            System.out.println("[4] Direita");
            System.out.println("[5] Sair");

            opcao = lala.nextInt();

            if(opcao == 1)
            {
                loulou.setPosY(loulou.posY + 1);

                for (y = 0; y < tc; y++) {
                    if(loulou.getPosY() < 0)
                    {
                        System.out.println("Ja esta no final");
                        loulou.setPosY(laulau.getPosY() - 1);
                        break;
                    }else if(loulou.getPosY() > tc){
                        System.out.println("Ja esta no final");
                        loulou.setPosY(laulau.getPosY() - 1);
                        break;
                    }
                    for (x = 0; x < tl; x++) {
                        if(loulou.getPosX() < 0 || loulou.getPosX() > tl)
                        {
                            System.out.println("Ja esta no final");
                            break;
                        }
                        if (loulou.getPosX() - 1 == x && loulou.getPosY() - 1 == y)
                        {
                            System.out.print("\t[ "+ loulou.formato +" ]");
                        }else{
                            System.out.print("\t[ . ]");
                        }
                    }
                    System.out.println();
                };
            }
            if(opcao == 3)
            {
                loulou.setPosX(laulau.getPosX() - 1);

                for (y = 0; y < tc; y++) {
                    if(loulou.getPosY() < 0)
                    {
                        System.out.println("Ja esta no final");
                        loulou.setPosY(laulau.getPosY() - 1);
                        break;
                    }else if(loulou.getPosY() > tc){
                        System.out.println("Ja esta no final");
                        loulou.setPosY(laulau.getPosY() - 1);
                        break;
                    }
                    for (x = 0; x < tl; x++) {
                        if (loulou.getPosX() - 1 == x && loulou.getPosY() - 1 == y)
                        {
                            System.out.print("\t[ "+ loulou.formato +" ]");
                        }else{
                            System.out.print("\t[ . ]");
                        }
                    }
                    System.out.println();
                }
            }
        }

    }
}
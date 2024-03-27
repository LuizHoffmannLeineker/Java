import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Agenda> dados = new ArrayList<Agenda>();
        Scanner leitor = new Scanner(System.in);
        String nome;
        String telefone;
        int opcao, registro = 0, aux = 0;
        boolean retorno;

        do{
            System.out.printf("\n0~~~0~~~0~~~0~~~0~~~0~~~0~~~0~~~0\n");
            System.out.printf("[1] - Adicionar Contato\n");
            System.out.printf("[2] - Remover Contato\n");
            System.out.printf("[3] - Buscar contato \n");
            System.out.printf("[4] - Sair\n");
            System.out.printf("0~~~0~~~0~~~0~~~0~~~0~~~0~~~0~~~0\n");
            System.out.printf("Insira um numero de acordo com as opções: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch(opcao){

                case 1:
                    System.out.printf("Insira o nome: ");
                    nome = leitor.nextLine();

                    System.out.printf("Informe o telefone: ");
                    telefone = leitor.nextLine();

                    dados.add(new Agenda(nome, telefone));

                    registro++;
                break;

                case 2:
                    System.out.printf("\nInsira o nome do registro que deseja excluir:  ");
                    nome = leitor.nextLine();

                    for(int i = 0; i <  registro; i++){
                       retorno =  dados.get(i).verificar(nome);
                       if(retorno){
                           dados.remove(i);
                           System.out.printf("O contanto foi removido da lista! \n");
                           aux = 1;
                           registro--;
                           break;
                       }
                    }

                    if(aux != 1){
                        System.out.printf("Infelizmente esse nome não está em nossa agenda de contatos!\n");
                    }
                    aux = 0;

                break;

                case 3:
                    System.out.printf("\nInsira o nome do contato: ");
                    nome = leitor.nextLine();
                    for (int i = 0; i <  registro; i++){
                        retorno =  dados.get(i).verificar(nome);
                        if(retorno){
                            System.out.printf("O numero do Sr(a) seria: ");
                            dados.get(i).listar();
                            aux = 1;
                        }
                    }
                    if(aux != 1){
                        System.out.printf("Nome invalido! \n");
                    }

                break;

                default:
                break;



            }





        }while(opcao != 4);


        leitor.close();
    }
}
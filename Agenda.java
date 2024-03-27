public class Agenda {
    String nome;
    String telefone;

    Agenda(String nome_main, String telefone_main){
    nome = nome_main;
    telefone = telefone_main;

    }


    boolean verificar(String nome_verificar){
        if(nome.equals(nome_verificar)){
            return  true;
        }
        else{
            return  false;
        }
    };


    void listar(){
        System.out.printf("%s", telefone);

    }





}

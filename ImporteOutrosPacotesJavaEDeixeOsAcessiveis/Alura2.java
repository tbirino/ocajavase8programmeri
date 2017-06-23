import modelo.basico.Cliente;
import modelo.avancado.Cliente;

class Teste {
    public static void main(String[] args) {
        System.out.println("Bem vindo!");
    }
}

//Não pode ser importado duas classes com o mesmo nome de pacotes diferentes sendo importadas especificamente.
//O erro de ambiguidade é dado no import e não na utilização, portanto o arquivo não compila.
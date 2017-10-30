//O codigo abaixo compila e não imprime nada, o examinador tentou confundi colocando o método voi Teste()
//com o mesmo nome da classe para parecer um construtor.
//O código compila e roda, não imprimindo nada, pois não chamamos o método Teste.
class Teste {
    int Teste = 305;

    void Teste() {
        System.out.println(Teste);
    }

    public static void main(String[] args) {
        new Teste();
    }
}
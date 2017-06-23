package modelo;

class Cliente {
    private String nome;
    Cliente(String nome) {
        this.nome = nome;
    }
    public void imprime() {
        System.out.println(nome);
    }
}

//Ocorre um erro de compilação na classe Teste ao tentar importar uma classe não acessível a outros pacotes.
//A classe Cliente teria que ser publica para poder ser importada em outra classe.
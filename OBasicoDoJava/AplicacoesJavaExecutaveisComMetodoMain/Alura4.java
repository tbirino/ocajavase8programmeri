package b;
class A {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}

//Escolha a opção adequada para rodar a classe A.java presente no diretório b,
// que foi compactado em um arquivo chamado programa.jar,
// sendo que não existe nenhum arquivo de manifesto:

//Para rodar um programa dentro de um jar sem ter um manifesto, devemos usar o classpath customizado.
// Colocamos o jar no classpath e dizemos qual classe desejamos rodar: java -cp programa.jar b.A.
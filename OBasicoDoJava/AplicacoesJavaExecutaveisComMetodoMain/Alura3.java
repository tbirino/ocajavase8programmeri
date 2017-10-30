class A {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
        System.out.println(args[0]);
    }
}

// javac A.java
// java A argumento

//Ao rodar sem argumentos, nosso array tem tamanho zero, portanto,
// ao tentar acessar seu primeiro elemento recebemos um ArrayIndexOutOfBoundsException na linha 5
//Porem se rodarmos com argumentos ele imprimira 3 linhas.
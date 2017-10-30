class A {
    public static void main(String[] args) {
        int idade;
        if(args.length > 0) {
            idade = Integer.parseInt(args[0]);
        } else {
            System.err.println("Por favor passe sua idade como 
                                primeiro parâmetro");
        }
        System.out.println("Sua idade é " + idade);
    }
}
/**O código não compila pois tentamos acessar a variável idade que pode não ter sido inicializada.
 Não é certeza (somente se cair no if ela será inicializada). */
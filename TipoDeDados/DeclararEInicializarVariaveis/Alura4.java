class A {
    public static void main(String[] args) {
        boolean argumentos;
        if(args.length > 0)
            argumentos = 1;
        else
            argumentos = 0;
        System.out.println(argumentos);
    }
}
/**Não compila pois boolean em Java só pode ser false ou true. */
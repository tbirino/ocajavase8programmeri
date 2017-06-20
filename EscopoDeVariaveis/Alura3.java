class Teste{
    //A variável x declarada como parâmetro do método main efetua um shadowing. Nesse instante, ao dizermos x = 200, tentamos atribuir um int a um array de String, erro de compilação.
    static int x = 15;
    public static void main(String[] x){
        x = 200;
        System.out.println(x);
    }
}
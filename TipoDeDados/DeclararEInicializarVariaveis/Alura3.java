class A {
    public static void main(String[] args) {
        boolean array = new boolean[300];
        System.out.println(array[3]);
    }
}

/**Não compila, do lado direito da atribuição temos um array de boolean e do lado esquerdo uma variável simples do tipo boolean. */
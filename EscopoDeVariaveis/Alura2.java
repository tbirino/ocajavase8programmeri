class Teste {
    //A variável i declarada no for, só é visível dentro do for, por isso podemos declará-la novamente logo em seguida.
    public static void main(String[] args){
        for(int i = 0; i<20;i++){
            System.out.println(i);
        }
        int i = 15;
        System.out.println(i);
    }
}
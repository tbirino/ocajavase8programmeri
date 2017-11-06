class B{

}
class A {
    public static void main(String[] args) {
        B b;
        for(int i = 0;i < 10;i++)
            b = new B();
        System.out.println("Finalizando!");
    }
}
//Compila e não podemos falar quantos objetos do tipo B foram garbage coletados na linha do System.out.
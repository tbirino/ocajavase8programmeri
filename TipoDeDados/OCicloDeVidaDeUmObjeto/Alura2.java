class B{

}
class A {
    public static void main(String[] args) {
        B b = new B();
        for(int i = 0;i < 10;i++)
            b = new B();
        System.out.println("Finalizando!");
    }

//Compila e 10 objetos do tipo B podem ser garbage coletados ao chegar na linha do System.out.
//Somente 10 objetos podem ser garbage coletados pois o último continua referenciado pela variável b.
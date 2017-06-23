package b;
import a.A;
static import a.A.*;
class B{
    void m() {
        A a = new A();
        a.executa(VALOR);
    }
}
//import static é o uso adequado, e não static import, erro na linha 3.
//Não está sendo irmpotado de maneira correta.
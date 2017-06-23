package b;
import static A.*;
class B{
    void m() {
        A a = new A();
        a.executa(VALOR);
    }
}
//B não compila pois tenta acessar uma classe do pacote padrão (sem nome).
// Classes do pacote padrão só podem ser acessadas por outros tipos do pacote padrão. Não compila.
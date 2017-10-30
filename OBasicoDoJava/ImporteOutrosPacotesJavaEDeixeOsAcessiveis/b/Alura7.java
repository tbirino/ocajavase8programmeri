package b;
import static a.A.*;
class B{
    void m() {
        A a = new A();
        a.executa(VALOR);
    }
}

//Não importamos a classe A, somente seus membros, erro de compilação ao tentar referenciá-la na linha 5.
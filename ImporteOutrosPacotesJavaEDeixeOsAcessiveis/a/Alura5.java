package a;
class C {
    b.B variavel;
}
//Não compila pois a classe B não está com fullqualified name, o correto seria a.b.B.
//Mesmo com o fullqualified name a classe não compilaria porque a classe B não é public.
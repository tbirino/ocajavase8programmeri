package a;
class A {
    b.B variavel;
}
//Não compila pois a classe B não está com fullqualified name, o correto seria a.b.B.

//O arquivo B compila pois é uma classe normal. O arquivo C não compila pois tenta acessar B,
//que está em outro pacote, mas lembre-se que devemos acessar os pacotes diretamente, não existe subpacote. 
//O mesmo vale para A. Portanto, nem A nem C compilam.
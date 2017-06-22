//Escolha a opção adequada para compilar a classe A.java,
// definida como no pacote b presente no diretório b,
// e adicionar também o arquivo programa.jar na busca de classes durante a compilação.
// Lembre-se que . significa o diretório atual.

//Durante a compilação, para adicionar o arquivo programa.jar ao classpath,
// devemos usar -cp programa.jar e, para especificar o arquivo adequado, usamos b/A.java.
// A opção que apresenta essas duas características é javac -cp programa.jar:. b/A.java.
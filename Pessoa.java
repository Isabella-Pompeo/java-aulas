public class Pessoa {

private String nome;
private int quantidade;
private String endereco;

public String getNome () {
    return nome; }

public int getQuantidade () {
    return quantidade; }

public String getEndereco () {
    return endereco; }


public void setNome (String nome) {
    this.nome = nome;
}

public void setIdade (int idade) {
    this.idade = idade;
}

public void setEndereco (String endereco)
    this.endereco = endereco;

public void exibir () {
    System.out.println("Nome" + getNome());
    System.out.println("Idade" + getIdade());
    System.out.println("Endereco" + getEndereco())
}

}





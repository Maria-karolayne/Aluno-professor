public class Pessoa{

    private String nome;
    private int dataNascimento;
    private int cpf;
    private String endereco;
    

    public void Falar(){
        System.out.println("eu falo");
    }

    public String getNome (){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDataNascimento (){
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public int getCpf(){
        return cpf;
    }

    public void setCpf(int cpf ){
        this.cpf = cpf ;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

}
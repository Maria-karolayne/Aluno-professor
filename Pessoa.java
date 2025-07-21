public class Pessoa{

    private String nome;
    private int dataNascimento;
    private int cpf;
    private String endereco;

    public Pessoa() {} 

    public Pessoa(String nome, int dataNascimento, int cpf, String endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    

    public void Falar(){
        System.out.println("A pessoa fala");
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
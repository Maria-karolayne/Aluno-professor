public class Aluno extends Pessoa {

    private String escola;
    private int ano;


    public Aluno() {
    super();
    }
    
    //metodo construtor com parametros
    Aluno(String nome,int dataNascimento,int cpf ,String endereco,  String escola, int ano){
        super( nome, dataNascimento, cpf , endereco );
        this.escola = escola;
        this.ano = ano;
    }

    @Override
    public void Falar(){
        System.out.println("Aluno faz pergunta");
    }

    public String getEscola() {
    return escola;
    }

    public void setEscola(String escola) {
    this.escola = escola;
    }

    public int getAno() {
    return ano;
    }

    public void setAno(int ano) {
    this.ano = ano;
    }
}

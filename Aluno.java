public class Aluno extends Pessoa {

    private String escola;
    private int ano;


    
    
    //metodo construtor com parametros
    Pessoa(String nome,int dataNascimento,int cpf ,String endereco){
        super( nome, dataNascimento, cpf , endereco , sexo);
        this.escola = escola;
        this.ano = ano;
    }

    @Overrite
    public void Falar(){
        System.out.println("eu faço pergunta");
    }
}
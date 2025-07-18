public class Professor extends Pessoa {

    private String materia;
    private int turmas;


    //metodo construtor filho
    Professor (){}
    
    //metodo construtor com parametros
    Professor(String nome,int dataNascimento,int cpf ,String endereco){
        super( nome, dataNascimento, cpf , endereco , sexo);
        this.materia = materia;
        this.turmas = turmas;
    }

    @Overrite
    public void Falar(){
        System.out.println("eu explico o assunto");
    }
}
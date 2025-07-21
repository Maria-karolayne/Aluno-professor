public class Professor extends Pessoa {

    private String materia;
    private int turmas;


    //metodo construtor filho
    Professor (){}
    
    //metodo construtor com parametros
    Professor(String nome,int dataNascimento,int cpf ,String endereco, String materia, int turmas){
        super( nome, dataNascimento, cpf , endereco);
        this.materia = materia;
        this.turmas = turmas;
    }

    @Override
    public void Falar(){
        System.out.println("Professor explica o assunto");
    }

    public String getMateria() {
    return materia;
    }

    public void setMateria(String materia) {
    this.materia = materia;
    }

    public int getTurmas() {
    return turmas;
    }

    public void setTurmas(int turmas) {
    this.turmas = turmas;
    }

}
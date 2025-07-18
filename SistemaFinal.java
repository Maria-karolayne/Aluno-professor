public class SistemaFinal{

    public static void main(String[]args){

        Pessoa pessoa = new Pessoa();

        pessoa.setNome ("Nome");
        pessoa.setDataNascimento (26);
        pessoa.setCpf(123456789);
        pessoa.setEndereco("rua bosch");

        pessoa.Falar();
    
    
        Aluno aluno = new Aluno();

        aluno.setNome ("NomeAluno");
        aluno.setDataNascimento (30);
        aluno.setCpf(10);
        aluno.setEndereco("Like");

        aluno.Falar();
    
        Professor professor = new Professor();

        professor.setNome ();
        professor.setDataNascimento (26);
        professor.setCpf(123456789);
        professor.setEndereco("rua bosch");

        professor.Falar();
}

}


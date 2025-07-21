public class SistemaFinal{

    public static void main(String[]args){

        Pessoa pessoa = new Pessoa();

        pessoa.setNome ("Nome");
        pessoa.setDataNascimento (26);
        pessoa.setCpf(123456789);
        pessoa.setEndereco("rua bosch");

        System.out.println("----Pessoa----");
        System.out.println("Nome:"+pessoa.getNome());
        System.out.println("Data de nascimento:"+pessoa.getDataNascimento());
        System.out.println("CPF:"+pessoa.getCpf());
        System.out.println("Endereço:"+pessoa.getEndereco());
        pessoa.Falar();
        
    
        Aluno aluno = new Aluno();

        aluno.setNome ("NomeAluno");
        aluno.setDataNascimento (30);
        aluno.setCpf(10);
        aluno.setEndereco("Like");
        aluno.setEscola("Escola Estadual Central");
        aluno.setAno(3);

        System.out.println("----Aluno----");
        System.out.println("Nome:"+aluno.getNome());
        System.out.println("Data de nascimento:"+aluno.getDataNascimento());
        System.out.println("CPF:"+aluno.getCpf());
        System.out.println("Endereço:"+aluno.getEndereco());
        System.out.println("Escola: " + aluno.getEscola());
        System.out.println("Ano: " + aluno.getAno());
        aluno.Falar();
    
        Professor professor = new Professor();

        professor.setNome ("Marcelo");
        professor.setDataNascimento (26);
        professor.setCpf(123456789);
        professor.setEndereco("rua bosch");
        professor.setMateria("Matemática");
        professor.setTurmas(5);


        System.out.println("----Professor----");
        System.out.println("Nome:"+professor.getNome());
        System.out.println("Data de nascimento:"+professor.getDataNascimento());
        System.out.println("CPF:"+professor.getCpf());
        System.out.println("Endereço:"+professor.getEndereco());
        System.out.println("Matéria: " + professor.getMateria());
        System.out.println("Número de turmas: " + professor.getTurmas());

        professor.Falar();
}

}


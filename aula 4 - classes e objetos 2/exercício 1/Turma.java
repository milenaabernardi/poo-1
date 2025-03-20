public class Turma {
    private String curso, disciplina;

    public String getCurso(){
        return curso;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setCurso(String curso1){
        curso = curso1;
    }

    public void setDisciplina(String disciplina1){
        disciplina = disciplina1;
    }

    public void exibeDados(){
        System.out.println("Curso: " + curso);
        System.out.println("Disciplina: " + disciplina);
    }
}

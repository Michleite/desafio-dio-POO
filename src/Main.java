import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMichael = new Dev();
        devMichael.setNome("Michael");
        devMichael.inscreverbootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Michael" + devMichael.getConteudosInscritos());
        devMichael.progredir();
        devMichael.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Michael" + devMichael.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Michael" + devMichael.getConteudosConcluidos());
        System.out.println("XP:" + devMichael.calcularTotalxp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverbootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devMichael.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalxp());






    }


}

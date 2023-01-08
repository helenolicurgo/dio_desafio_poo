import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Creating Cursos
        Curso cursoJavaBasico = new Curso();

        cursoJavaBasico.setTitulo("Curso de Java Básico");
        cursoJavaBasico.setDescricao("Descrição do curso de Java Básico");
        cursoJavaBasico.setCargaHoraria(8);

        Curso cursoJavaIntermediario = new Curso();

        cursoJavaIntermediario.setTitulo("Curso de Java Intermediário");
        cursoJavaIntermediario.setDescricao("Descrição do curso de Java Intermediário");
        cursoJavaIntermediario.setCargaHoraria(8);

        Curso cursoTypeScript = new Curso();

        cursoTypeScript.setTitulo("Curso de TypeScript");
        cursoTypeScript.setDescricao("Descrição do curso de TypeScript");
        cursoTypeScript.setCargaHoraria(6);

        //Creating Mentorias
        Mentoria mentoriaEnglishInterview = new Mentoria();

        mentoriaEnglishInterview.setTitulo("Mentoria: English Interview");
        mentoriaEnglishInterview.setDescricao("Mentoria: English Interview");
        mentoriaEnglishInterview.setData(LocalDate.of(2023, 01, 18));

        Mentoria mentoriaNetworking = new Mentoria();

        mentoriaNetworking.setTitulo("Mentoria: Networking");
        mentoriaNetworking.setDescricao("Descrição Mentoria Networking");
        mentoriaNetworking.setData(LocalDate.of(2023, 01, 28));

        //Creating Bootcamps
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Básico e Intermediário");
        bootcampJava.setDescricao("Descrição Bootcamp Java Básico e Intermediário");
        bootcampJava.getConteudos().add(cursoJavaBasico);
        bootcampJava.getConteudos().add(cursoJavaIntermediario);
        bootcampJava.getConteudos().add(cursoTypeScript);
        bootcampJava.getConteudos().add(mentoriaEnglishInterview);

        //Creating Developers
        Developer developerFulano = new Developer();
        developerFulano.setNome("Fulano de Tal");
        developerFulano.inscreverBootcamp(bootcampJava);
        System.out.println(developerFulano.getNome() + " está inscrito nos conteúdos: " + developerFulano.getConteudosInscrito());
        developerFulano.progredir();
        System.out.println(developerFulano.getNome() + " ainda está inscrito nos conteúdos: "  + developerFulano.getConteudosInscrito());
        System.out.println(developerFulano.getNome() + " concluiu os conteúdos: " + developerFulano.getConteudosConcluidos());
        System.out.println(developerFulano.getNome() + "atualmente possui " + developerFulano.calcularTotalXP() + " de XP");

        Developer developerCicrano = new Developer();
        developerCicrano.setNome("Cricano de Tal");
        developerCicrano.inscreverBootcamp(bootcampJava);
        System.out.println(developerCicrano.getNome() + " está inscrito nos conteúdos: " + developerCicrano.getConteudosInscrito());
        developerCicrano.progredir();
        developerCicrano.progredir();
        System.out.println(developerCicrano.getNome() + " ainda está inscrito nos conteúdos: "  + developerCicrano.getConteudosInscrito());
        System.out.println(developerCicrano + " concluiu os conteúdos: " + developerCicrano.getConteudosConcluidos());
        System.out.println(developerCicrano.getNome() + "atualmente possui " + developerCicrano.calcularTotalXP() + " de XP");

        Developer developerBeltrano = new Developer();
        developerBeltrano.setNome("Beltrano de Tal");
        developerBeltrano.inscreverBootcamp(bootcampJava);
        System.out.println(developerBeltrano.getNome() + " está inscrito nos conteúdos: "  + developerBeltrano.getConteudosInscrito());
        developerBeltrano.progredir();
        developerBeltrano.progredir();
        developerBeltrano.progredir();
        System.out.println(developerBeltrano.getNome() + " ainda está inscrito nos conteúdos: "  + developerBeltrano.getConteudosInscrito());
        System.out.println(developerBeltrano + " concluiu os conteúdos: " + developerBeltrano.getConteudosConcluidos());
        System.out.println(developerBeltrano.getNome() + "atualmente possui " + developerBeltrano.calcularTotalXP() + " de XP");

        //Testing object creations
        System.out.println(cursoJavaIntermediario);
        System.out.println(cursoTypeScript);
        System.out.println(mentoriaEnglishInterview);
        System.out.println(mentoriaNetworking);
    }
}

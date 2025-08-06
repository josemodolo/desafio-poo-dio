package org.example;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Mentoria mentoria = new Mentoria();
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso Java Dio");
        curso1.setCargaHoraria(8);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos" + devJose.getConteudoInscritos());
        devJose.progredir();
        System.out.println("Conteúdos Incritos" + devJose.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + devJose.getConteudosConcluidos());


        Dev devCamila = new Dev();
        devJose.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(("Conteúdos Incritos" + devCamila.getConteudoInscritos()));
        devCamila.progredir();
        System.out.println("Conteúdos Concluidos" + devCamila.getConteudosConcluidos());



    }
}
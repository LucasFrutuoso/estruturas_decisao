package com.lista.estruturas_decisao.Service;

import com.lista.estruturas_decisao.Shared.Dto01;
import com.lista.estruturas_decisao.Shared.Dto02;
import com.lista.estruturas_decisao.Shared.Dto03;
import com.lista.estruturas_decisao.Shared.Dto04;
import com.lista.estruturas_decisao.Shared.Dto05;
import com.lista.estruturas_decisao.Shared.Dto06;
import com.lista.estruturas_decisao.Shared.Dto07;
import com.lista.estruturas_decisao.Shared.Dto08;

import org.springframework.stereotype.Service;

@Service
public class Services {

    public Dto01 ex01(Dto01 dto) {

        String m = dto.getMensagem();
        double n1 = dto.getNum1();
        double n2 = dto.getNum2();

        if (dto.getNum1() > dto.getNum2()) {
            dto.setMensagem("" + dto.getNum1());
        } else {
            dto.setMensagem("" + dto.getNum2());
        }
        Dto01 dtos = new Dto01();

        dtos.setNum1(n1);
        dtos.setNum2(n2);
        dtos.setMensagem(m);

        return dto;
    }

    public Dto02 ex02(Dto02 dto02) {

        if (dto02.getNum1() > 0) {
            dto02.setMensagem("Positivo");
        } else {
            dto02.setMensagem("Negativo");
        }

        String msg = dto02.getMensagem();
        double n1 = dto02.getNum1();

        Dto02 Dto = new Dto02();

        Dto.setMensagem(msg);
        Dto.setNum1(n1);

        return Dto;

    }

    public Dto03 ex03(Dto03 dto03) {

        switch (dto03.getLetra()) {
            case "F":
                dto03.setMensagem("Feminino");
                break;

            case "M":
                dto03.setMensagem("Masculino");
                break;

            default:
                dto03.setMensagem("Sexo inválido");
                break;
        }

        String m = dto03.getMensagem();
        String l = dto03.getLetra();

        Dto03 dto = new Dto03();

        dto.setLetra(l);
        dto.setMensagem(m);

        return dto;

    }

    public Dto04 ex04(Dto04 dto04) {

        switch (dto04.getLetra()) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                dto04.setMensagem("Vogal: " + dto04.getLetra());
                break;

            default:
                dto04.setMensagem("Consoante: " + dto04.getLetra());
                break;
        }

        String l = dto04.getLetra();
        String m = dto04.getMensagem();

        Dto04 dto = new Dto04();

        dto.setLetra(l);
        dto.setMensagem(m);

        return dto;
    }

    public Dto05 ex05(Dto05 dto05) {

        double media = (dto05.getNota1() + dto05.getNota2()) / 2;

        if (media >= 7 && media <= 9) {
            dto05.setMensagem("Aprovado!");
        } else if (media < 7) {
            dto05.setMensagem("Reprovado!");
        } else {
            dto05.setMensagem("Aprovado com distinção!");
        }

        double nota1 = dto05.getNota1();
        double nota2 = dto05.getNota2();
        String mensagem = dto05.getMensagem();

        Dto05 dto = new Dto05();

        dto.setMensagem(mensagem);
        dto.setNota1(nota1);
        dto.setNota2(nota2);

        return dto;

    }

    public Dto06 ex06(Dto06 dto06) {

        if (dto06.getNum1() > dto06.getNum2() && dto06.getNum1() > dto06.getNum3()) {
            dto06.setMaior("O numero: " + dto06.getNum1() + " é o maior!");
        } else if (dto06.getNum2() > dto06.getNum1() && dto06.getNum2() > dto06.getNum3()) {
            dto06.setMaior("O numero: " + dto06.getNum2() + " é o maior!");
        } else {
            dto06.setMaior("O numero: " + dto06.getNum3() + " é o maior!");
        }

        String maior = dto06.getMaior();
        Integer num1 = dto06.getNum1();
        Integer num2 = dto06.getNum2();
        Integer num3 = dto06.getNum3();

        Dto06 dto = new Dto06();

        dto.setNum1(num1);
        dto.setNum2(num2);
        dto.setNum3(num3);
        dto.setMaior(maior);

        return dto;
    }

    // public Dto06 ex07(Dto06 dto06) {

    // if (dto06.getNum1() > dto06.getNum2() && dto06.getNum1() > dto06.getNum3()) {
    // dto06.setMaior("O numero: " + dto06.getNum1() + " é o maior!");

    // } else if (dto06.getNum2() > dto06.getNum1() && dto06.getNum2() >
    // dto06.getNum3()) {
    // dto06.setMaior("O numero: " + dto06.getNum2() + " é o maior!");

    // } else if (dto06.getNum3() > dto06.getNum1() && dto06.getNum3() >
    // dto06.getNum2()) {
    // dto06.setMaior("O numero: " + dto06.getNum3() + " é o maior!");

    // String maior = dto06.getMaior();
    // Integer num1 = dto06.getNum1();
    // Integer num2 = dto06.getNum2();
    // Integer num3 = dto06.getNum3();

    // Dto06 dto = new Dto06();

    // dto.setNum1(num1);
    // dto.setNum2(num2);
    // dto.setNum3(num3);
    // dto.setMaior(maior);

    // } else if (dto06.getNum1() < dto06.getNum2() && dto06.getNum1() <
    // dto06.getNum3()) {
    // dto06.setMenor("O numero: " + dto06.getNum1() + " é o menor!");

    // } else if (dto06.getNum2() < dto06.getNum1() && dto06.getNum2() <
    // dto06.getNum3()) {
    // dto06.setMenor("O numero: " + dto06.getNum2() + " é o menor!");
    // } else {
    // dto06.setMenor("O numero: " + dto06.getNum3() + " é o menor!");
    // }

    // String menor = dto06.getMenor();
    // Integer num01 = dto06.getNum1();
    // Integer num02 = dto06.getNum2();
    // Integer num03 = dto06.getNum3();

    // Dto06 dto = new Dto06();

    // dto.setNum1(num01);
    // dto.setNum2(num02);
    // dto.setNum3(num03);
    // dto.setMenor(menor);

    // return dto;
    // }

    public Dto07 ex07(Dto07 dto07) {

        if (dto07.getNum1() > dto07.getNum2() && dto07.getNum2() > dto07.getNum3()) {
            dto07.setOrdem_Decrescente("" + dto07.getNum1() + ", " + dto07.getNum2() + ", " + dto07.getNum3());

        } else if (dto07.getNum1() > dto07.getNum3() && dto07.getNum3() > dto07.getNum2()) {
            dto07.setOrdem_Decrescente("" + dto07.getNum1() + ", " + dto07.getNum3() + ", " + dto07.getNum2());

        } else if (dto07.getNum2() > dto07.getNum1() && dto07.getNum1() > dto07.getNum3()) {
            dto07.setOrdem_Decrescente("" + dto07.getNum2() + ", " + dto07.getNum1() + ", " + dto07.getNum3());

        } else if (dto07.getNum2() > dto07.getNum3() && dto07.getNum3() > dto07.getNum1()) {
            dto07.setOrdem_Decrescente("" + dto07.getNum2() + ", " + dto07.getNum3() + ", " + dto07.getNum1());

        } else if (dto07.getNum3() > dto07.getNum2() && dto07.getNum2() > dto07.getNum1()) {
            dto07.setOrdem_Decrescente("" + dto07.getNum3() + ", " + dto07.getNum2() + ", " + dto07.getNum1());

        } else {
            dto07.setOrdem_Decrescente("" + dto07.getNum3() + ", " + dto07.getNum1() + ", " + dto07.getNum2());
        }

        Integer n1 = dto07.getNum1();
        Integer n2 = dto07.getNum2();
        Integer n3 = dto07.getNum3();
        String m = dto07.getOrdem_Decrescente();

        Dto07 dto = new Dto07();

        dto.setNum1(n1);
        dto.setNum2(n2);
        dto.setNum3(n3);
        dto.setOrdem_Decrescente(m);

        return dto;

    }

    public Dto08 ex08(Dto08 dto08) {

        switch (dto08.getMensagem()) {
            case "M":
                dto08.setTurno_em_que_estuda("Bom dia");
                break;

            case "V":
                dto08.setTurno_em_que_estuda("Boa tarde");
                break;

            case "N":
                dto08.setTurno_em_que_estuda("Boa noite");
                break;

            default:
                dto08.setTurno_em_que_estuda("Valor inválido");
                break;
        }

        String m = dto08.getMensagem();
        String t = dto08.getTurno_em_que_estuda();

        Dto08 dto = new Dto08();

        dto.setMensagem(m);
        dto.setTurno_em_que_estuda(t);

        return dto;

    }

}

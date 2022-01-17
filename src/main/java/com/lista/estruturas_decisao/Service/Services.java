package com.lista.estruturas_decisao.Service;

import com.lista.estruturas_decisao.Shared.Dto01;
import com.lista.estruturas_decisao.Shared.Dto02;
import com.lista.estruturas_decisao.Shared.Dto03;
import com.lista.estruturas_decisao.Shared.Dto04;
import com.lista.estruturas_decisao.Shared.Dto05;
import com.lista.estruturas_decisao.Shared.Dto06;
import com.lista.estruturas_decisao.Shared.Dto07;
import com.lista.estruturas_decisao.Shared.Dto08;
import com.lista.estruturas_decisao.Shared.Dto09;
import com.lista.estruturas_decisao.Shared.Dto10;
import com.lista.estruturas_decisao.Shared.Dto11;
import com.lista.estruturas_decisao.Shared.Dto12;

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

        String m = dto08.getMensagem();

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

        String t = dto08.getTurno_em_que_estuda();

        Dto08 dto = new Dto08();

        dto.setMensagem(m);
        dto.setTurno_em_que_estuda(t);

        return dto;

    }

    public Dto09 ex09(Dto09 dto09) {

        double p = 0;
        double a = 0;
        double n = 0;

        if (dto09.getSalario_Atual() <= 280) {

            p = 20;
            dto09.setPercentual(p);

            a = (dto09.getSalario_Atual() * 20) / 100;
            dto09.setValor_Aumento(a);

            n = ((dto09.getSalario_Atual() * 20) / 100) + dto09.getSalario_Atual();
            dto09.setSalario_Apos_Aumento(n);

        } else if (dto09.getSalario_Atual() >= 281 && dto09.getSalario_Atual() <= 700) {

            p = 15;
            dto09.setPercentual(p);

            a = (dto09.getSalario_Atual() * 15) / 100;
            dto09.setValor_Aumento(a);

            n = ((dto09.getSalario_Atual() * 15) / 100) + dto09.getSalario_Atual();

            dto09.setSalario_Apos_Aumento(n);

        } else if (dto09.getSalario_Atual() >= 701 && dto09.getSalario_Atual() <= 1500) {
            p = 10;
            dto09.setPercentual(p);

            a = (dto09.getSalario_Atual() * 10) / 100;
            dto09.setValor_Aumento(a);

            n = ((dto09.getSalario_Atual() * 10) / 100) + dto09.getSalario_Atual();
            dto09.setSalario_Apos_Aumento(n);

        }

        double atual = dto09.getSalario_Atual();
        String v = dto09.getValor_Invalido();

        Dto09 dto = new Dto09();

        dto.setPercentual(p);
        dto.setSalario_Atual(atual);
        dto.setSalario_Apos_Aumento(n);
        dto.setValor_Aumento(a);
        dto.setValor_Invalido(v);

        return dto;
    }

    public Dto10 ex10(Dto10 dto10) {

        double bruto = dto10.getHorasTrabalhadas() * dto10.getValorHora();
        double impostoRenda = 0;
        double fgts = bruto * 11 / 100;
        double sindicato = bruto * 3 / 100;
        double inss = bruto * 10 / 100;
        double descontos = sindicato + fgts + inss;
        double salarioLiquido = bruto - descontos;

        if (bruto <= 900) {

            dto10.setSindicato(sindicato);

            dto10.setFGTS(fgts);

            dto10.setINSS(inss);

            dto10.setSalarioBruto(bruto);

            dto10.setTotalDescontos(descontos);

            dto10.setSalarioLiquido(salarioLiquido);

        } else if (bruto >= 901 && bruto <= 1500) {

            dto10.setSindicato(sindicato);

            dto10.setIR((bruto * 5) / 100);

            dto10.setFGTS(fgts);

            dto10.setINSS(inss);

            dto10.setSalarioBruto(bruto);

            dto10.setTotalDescontos(descontos);

            dto10.setSalarioLiquido(salarioLiquido);

        } else if (bruto >= 1501 && bruto <= 2500) {

            dto10.setSindicato(sindicato);

            dto10.setIR((bruto * 10) / 100);

            dto10.setFGTS(fgts);

            dto10.setINSS(inss);

            dto10.setSalarioBruto(bruto);

            dto10.setTotalDescontos(descontos);

            dto10.setSalarioLiquido(salarioLiquido);

        } else if (bruto >= 2501) {

            dto10.setSindicato(sindicato);

            dto10.setIR((bruto * 20) / 100);

            dto10.setFGTS(fgts);

            dto10.setINSS(inss);

            dto10.setSalarioBruto(bruto);

            dto10.setTotalDescontos(descontos);

            dto10.setSalarioLiquido(salarioLiquido);
        }

        double horasTrabalhadas = dto10.getHorasTrabalhadas();
        double valorHora = dto10.getValorHora();

        Dto10 dto = new Dto10();

        dto10.setSalarioLiquido(salarioLiquido);
        dto10.setSalarioBruto(bruto);
        dto.setIR(impostoRenda);
        dto.setSindicato(sindicato);
        dto.setFGTS(fgts);
        dto.setINSS(inss);
        dto.setHorasTrabalhadas(horasTrabalhadas);
        dto.setValorHora(valorHora);

        return dto10;

    }

    public Dto11 ex11(Dto11 dto11) {

        Integer dia = 0;

        switch (dto11.getDia()) {
            case 1:
                dto11.setDiaNome("Domingo");
                break;
            case 2:
                dto11.setDiaNome("Segunda-feira");
                break;
            case 3:
                dto11.setDiaNome("Terça-feira");
                break;
            case 4:
                dto11.setDiaNome("Quarta-feira");
                break;
            case 5:
                dto11.setDiaNome("Quinta-feira");
                break;
            case 6:
                dto11.setDiaNome("Sexta-feira");
                break;
            case 7:
                dto11.setDiaNome("Sábado");
                break;

            default:
                dto11.setDiaNome("Valor invalido");
                break;
        }

        Dto11 dto = new Dto11();

        dto.setDia(dia);

        return dto11;

    }

    public Dto12 ex12(Dto12 dto12) {

        double n1 = dto12.getNota1();
        double n2 = dto12.getNota2();
        double m = (n1 + n2) / 2;
        String c = dto12.getConceito();

        if (m >= 9 && m <= 10) {

            dto12.setConceito("A (APROVADO)");
            dto12.setMedia(m);

        } else if (m >= 7.5 && m <= 8.9) {
            dto12.setConceito("B (APROVADO)");
            dto12.setMedia(m);

        } else if (m >= 6 && m <= 7.4) {
            dto12.setConceito("C (APROVADO)");
            dto12.setMedia(m);

        } else if (m >= 4 && m <= 5.9) {
            dto12.setConceito("D (REPROVADO)");
            dto12.setMedia(m);

        } else if (m >= 3.9 && m <= 0) {
            dto12.setConceito("E (REPROVADO)");
            dto12.setMedia(m);
        }

        Dto12 dto = new Dto12();

        dto.setConceito(c);
        dto.setNota1(n1);
        dto.setNota1(n2);
        dto.setMedia(m);

        return dto12;

    }

    
}
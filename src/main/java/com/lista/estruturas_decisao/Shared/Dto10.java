package com.lista.estruturas_decisao.Shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dto10 {
    
    private double horasTrabalhadas;
    private double valorHora;
    private double salarioBruto;
    private double IR;
    private double INSS;
    private double FGTS;
    private double totalDescontos;
    private double salarioLiquido;
    private double sindicato;

}

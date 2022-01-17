package com.lista.estruturas_decisao.View.Controller;

import com.lista.estruturas_decisao.Service.Services;
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/decisao")
public class Controllers {

    @Autowired
    Services service;

    @PostMapping("/maior_menor")
    public ResponseEntity<?> ex01(@RequestBody Dto01 dto) {

        Dto01 Dto = service.ex01(dto);
        return ResponseEntity.ok().body(Dto);

    }

    @PostMapping("/positivo_negativo")
    public ResponseEntity<?> ex02(@RequestBody Dto02 dto) {

        Dto02 Dto = service.ex02(dto);
        return ResponseEntity.ok().body(Dto);

    }

    @PostMapping("/fm")
    public ResponseEntity<?> ex03(@RequestBody Dto03 dto) {

        Dto03 Dto = service.ex03(dto);
        return ResponseEntity.ok().body(Dto);

    }

    @PostMapping("/vogal_consoante")
    public ResponseEntity<?> ex04(@RequestBody Dto04 dto) {

        Dto04 Dto = service.ex04(dto);
        return ResponseEntity.ok().body(Dto);
    }

    @PostMapping("/media")
    public ResponseEntity<?> ex05(@RequestBody Dto05 dto) {

        Dto05 Dto = service.ex05(dto);

        return ResponseEntity.ok().body(Dto);

    }

    @PostMapping("/maior")
    public ResponseEntity<?> ex06(@RequestBody Dto06 dto) {
        Dto06 Dto = service.ex06(dto);

        return ResponseEntity.ok().body(Dto);

    }

    @PostMapping("/decrescente")
    public ResponseEntity<?> ex07(@RequestBody Dto07 dto) {
        Dto07 Dto = service.ex07(dto);

        return ResponseEntity.ok().body(Dto);
    }

    @PostMapping("/turno")
    public ResponseEntity<?> ex08(@RequestBody Dto08 dto) {
        Dto08 Dto = service.ex08(dto);

        return ResponseEntity.ok().body(Dto);
    }

    @PostMapping("/salario")
    public ResponseEntity<?> ex09(@RequestBody Dto09 dto) {

        Dto09 Dto = service.ex09(dto);

        return ResponseEntity.ok().body(Dto);
    }

    @PostMapping("/impostos")
    public ResponseEntity<?> ex10(@RequestBody Dto10 dto) {
        Dto10 Dto = service.ex10(dto);

        return ResponseEntity.ok().body(Dto);
    }

    @PostMapping("/diaSemana")
    public ResponseEntity<?> ex11(@RequestBody Dto11 dto) {

        Dto11 Dto = service.ex11(dto);

        return ResponseEntity.ok().body(Dto);

    }

    @PostMapping("/notas")
    public ResponseEntity<?> ex12(@RequestBody Dto12 dto) {

        Dto12 Dto = service.ex12(dto);

        return ResponseEntity.ok().body(Dto);

    }

   

}

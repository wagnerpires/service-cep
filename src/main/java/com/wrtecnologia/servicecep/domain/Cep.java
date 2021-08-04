package com.wrtecnologia.servicecep.domain;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Cep {
    public String cep;
    public String logradouro;
    public String complemento;
    public String bairro;
    public String localidade;
    public String uf;
}

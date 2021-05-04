package com.nicholasmorlin.casadocodigo.controller.exception;

public class ErroFormDto {

    private Integer status;
    private String mensagem;

    public ErroFormDto(Integer status, String erro) {
        this.status = status;
        this.mensagem = erro;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMensagem() {
        return mensagem;
    }
}

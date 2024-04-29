package com.example.mspedido.dto;

import lombok.Data;

@Data

public class ClienteDto {
    private Integer id;
    private String nombre;
    private String dni;
    private String domicilio;
    private Number telefono;
    private String fecha;
    private String compras;
    private Number abono;

}

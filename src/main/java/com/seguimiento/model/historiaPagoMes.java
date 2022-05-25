package com.seguimiento.model;

@Entity
@Table(name = "historiaPagoMes")
public class historiaPagoMes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHistoriaPagoMes;
    private int idMes;
    private int idSuscripcion;
    private String estado;
    private String fechaRecordatorio;
    private String fechaVencimiento;
    private int montoPagado;
    private int montoDeuda;

    public int getIdHistoriaPagoMes() {
        return idHistoriaPagoMes;
    }

    public void setIdHistoriaPagoMes(int idHistoriaPagoMes) {
        this.idHistoriaPagoMes = idHistoriaPagoMes;
    }

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public void setFechaRecordatorio(String fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public int getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }
    
    public int getMontoDeuda() {
        return montoDeuda;
    }

    public void setMontoDeuda(int montoDeuda) {
        this.montoDeuda = montoDeuda;
    }
}
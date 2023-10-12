package org.example;

public class Cliente {

    private int id_cliente;
    private String nombre;
    private int id_documento;
    private int numero_celular;
    private String fecha_reserva;
    private String tipo_reserva;

    public void Cliente(int id_cliente,String nombre, int id_documento,int numero_celular,String fecha_reserva,String tipo_reserva){
        this.id_cliente=id_cliente;
        this.nombre=nombre;
        this.id_documento=id_documento;
        this.numero_celular=numero_celular;
        this.fecha_reserva=fecha_reserva;
        this.tipo_reserva=tipo_reserva;
    }

    public int getId_cliente(){
        return id_cliente;
    }
    public void setId_cliente(int id_cliente){
        this.id_cliente=id_cliente;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getId_documento(){
        return id_documento;
    }
    public void setId_documento(int id_documento){
        this.id_documento=id_documento;
    }
    public int getNumero_celular(){
        return numero_celular;
    }
    public void setNumero_celular(int numero_celular){
        this.numero_celular=numero_celular;
    }
    public String getFecha_reserva(){
        return fecha_reserva;
    }
    public void setFecha_reserva(String fecha_reserva){
        this.fecha_reserva=fecha_reserva;
    }
    public String getTipo_reserva(){
        return tipo_reserva;
    }
    public void setTipo_reserva(String tipo_reserva){
        this.tipo_reserva=tipo_reserva;
    }

}

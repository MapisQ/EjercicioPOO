package org.example;

public class Empleado {

    private int id_empleado;
    private String nombre;
    private int edad;
    private int id_documento;
    private String cargo;

    public void Empleado(int id_empleado,String nombre, int edad, int id_documento, String cargo){
        this.id_empleado=id_empleado;
        this.nombre=nombre;
        this.edad=edad;
        this.id_documento=id_documento;
        this.cargo=cargo;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

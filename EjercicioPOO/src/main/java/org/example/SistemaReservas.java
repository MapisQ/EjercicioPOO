package org.example;

public class SistemaReservas implements ReservasInterface{
    public void registrar_reserva() {
        System.out.println("Se ha registrado exitosamente la reserva");
    }

    public void cancelar_reserva() {
        System.out.println("Se ha cancelado la reservación");

    }

    public void modificar_reserva() {
        System.out.println("Se ha modificado la reserva");

    }
}

package com.slashmobility.peopelgetpos.model;

/**
 * Created by Administrador on 01/06/2017.
 */

public class PeopleModel {



    String apellido;
    int cedula;
    String fecha_nacimiento;
    int id;
    String nombre;

    public PeopleModel(String apellido, int cedula, String fecha_nacimiento, int id, String nombre) {
        this.apellido = apellido;
        this.cedula = cedula;
        this.fecha_nacimiento = fecha_nacimiento;
        this.id = id;
        this.nombre = nombre;
    }

    public PeopleModel() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }
}

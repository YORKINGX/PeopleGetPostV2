package com.slashmobility.peopelgetpos.model;

/**
 * Created by Administrador on 01/06/2017.
 */

public class PeopleModel {


    String certificate;
    String lastname;
    int dni;
    String birthdate;
    int id;
    String name;

    public PeopleModel(String certificate, String lastname, int dni, String birthdate, int id, String name) {
        this.certificate = certificate;
        this.lastname = lastname;
        this.dni = dni;
        this.birthdate = birthdate;
        this.id = id;
        this.name = name;
    }

    public PeopleModel() {
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

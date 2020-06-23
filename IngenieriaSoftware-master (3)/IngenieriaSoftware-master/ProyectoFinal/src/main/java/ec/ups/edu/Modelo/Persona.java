/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;

import java.util.List;

/**
 *
 * @author 59396
 */

public abstract class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private int telefono;
    private Usuario usuario;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = "juan";
    }

    public void setApellido(String apellido) {
        this.apellido = "perez";
    }

    public void setDireccion(String direccion) {
        this.direccion = "av loja";
    }

    public void setCorreo(String correo) {
        this.correo = "jota@gmail.com";
    }

    public void setTelefono(int telefono) {
        this.telefono = 1234567890;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public abstract String verificarUsuario();
    public abstract String validarCedula();
    public abstract String crarPersona(Persona p);
    public abstract String eliminarPersona(int codigo);
    public abstract String buscarPersona(int codigo);
    public abstract String modificarPersona(int codigo);
    public abstract List<Persona> listarPersona();
    
    
    
    
    
    
}

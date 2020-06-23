/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.UnaryOperator;

/**
 *
 * @author 59396
 */
public class ControladorDocente extends Persona {

    ArrayList<Persona> arrayList = new ArrayList<Persona>();//creamos el objeto lista

    int cont;

//    public int registrarNota(){
//        return(0);
//    }
//
    public ControladorDocente() {
//        listaPersona = new TreeMap();
        cont = 1;
    }

//    public SortedMap getListaPersona() {
//        return listaPersona;
//    }

    @Override
    public String verificarUsuario() {
        return ("Usuario valido");
    }

    @Override
    public String validarCedula() {
        return ("Cedula Docente valida");
    }

    @Override
    public String crarPersona(Persona p) {
        //Persona persona = new Persona();//creamos el objeto persona
        arrayList.add(p);//almacenamos la persona en la lista
        String tmpStr1 = ""; //String temporal que usamos como auxiliar
        System.out.println("Se procede a mostrar los datos de los docentes existentes en el arraylist \n");
        for (Persona tmp : arrayList) {
            System.out.println(tmp.toString());
            if (tmp instanceof Persona) {
                tmpStr1 = "Interino";
            } else {
                tmpStr1 = "Titular";
            }
            System.out.println("-Cargo:" + tmpStr1+ " -Apellido del Docente: " + (tmp.getApellido()) + "\n");
        }
//        System.out.println("creado");
        return ("Docente creado");
    }

    @Override
    public String eliminarPersona(int codigo) {
        arrayList.remove(codigo);
        return ("Docente eliminado");
    }

    @Override
    public String buscarPersona(int codigo) {
        Persona l = (Persona)arrayList.get(codigo);
        return ("Docente encontrado");
    }

    @Override
    public List<Persona> listarPersona() {
        for (Persona tmp : arrayList) {
            System.out.println(tmp.toString());
        }
        return arrayList;
    }

    @Override
    public String modificarPersona(int codigo) {
//        arrayList.replaceAll(UnaryOperator<Persona> codigo);
        return ("Docente modificado");
    }

}

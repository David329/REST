/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upc.ws;

import com.upc.upcnet.entidades.Administrador;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class clasepruebaTest {
    
    public clasepruebaTest() {
    }

//    @Test
//    public void testSomeMethod() {
//        //se importo import com.upc.upcnet.entidades.Administrador;Para Administrador
//        //La clase q nos genero en el cliente el WS
//        AdministradorClient AC=new AdministradorClient();
//        //Administrador es del Servidor y viene de RESTful Web Services con sus metodos
//        Administrador objAdministrador=AC.find_JSON(Administrador.class, "AD101");
//        //Obteniendo el valor getapellido en el string
//        String IanTest=objAdministrador.getIDAdministrador();
//        
//        assertEquals(IanTest, "AD101");
//    }   
    @Test
    public void testSomeMethod2() {
        AdministradorClient AC=new AdministradorClient();
        Administrador ada=AC.find_XML(Administrador.class, "AD101");
        assertEquals(ada.getIDAdministrador(), "AD101");
    }   
}

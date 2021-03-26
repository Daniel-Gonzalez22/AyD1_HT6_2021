/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Estudiante;
import Objetos.RegistroAcademico;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 *
 * @author Daniel
 */
public class EsbinDanielGonzalezOrozco {
    
    @Mock
    private Carrera carreraTest;
    
    @BeforeEach
    public void setupMock1(){
        MockitoAnnotations.initMocks(carreraTest);
    }
    
    @Test
    public void test1() throws Exception {
        carreraTest = new Carrera(2, "Carrera Prueba");
        when(carreraTest.procesarCarrera());
        assertEquals(carreraTest.procesarCarrera(),2);
    }
    
    @Mock
    private RegistroAcademico registroTest;
    
    @BeforeEach
    public void setupMock2(){
        MockitoAnnotations.initMocks(registroTest);
    }
    
    @Test
    public void test2() throws Exception{
        registroTest = new RegistroAcademico(2000,"09775");
        when(registroTest.cheequearCarnet()).thenReturn(true);
        boolean boolPrueba = registroTest.cheequearCarnet();
        assertTrue(boolPrueba);
    }
    
    
}

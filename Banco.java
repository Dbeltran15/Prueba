/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Banco  
{
    //Declarar Variable 
    private CuentaBancaria cuentas[];
    public static double TASA = 0.05;
    
    //Constructor
    public Banco(int tamanio) 
    { 
        cuentas = new CuentaBancaria[tamanio];
    } 
    
    //Buscar Informacion del Client, Param code
    public CuentaBancaria buscar(int code) 
    { 
        //Foreach 
        for(CuentaBancaria cuentaF:cuentas)
        {
            if(cuentaF.getcodigo() == code && cuentaF != null)
            {
                return cuentaF;
            }
        }
        return null;
    }
    
    //Agregar 
    public boolean agregar(int code, String name) 
    { 
        if(buscar(code) == null)
        {
            for(int p =0; p < cuentas.length; p++) 
            { 
                if(cuentas[p] == null ) 
                { 
                    cuentas[p] = new CuentaBancaria(code,name); 
                    return true;
                }
            }
        } 
        return false;
    }
    
    
}

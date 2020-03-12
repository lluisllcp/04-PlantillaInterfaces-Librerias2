/* 
 * Copyright 2020 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.awt.Color;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís Cerdà Pascual aw.lluiscerda@gmail.com
 */
public final class UtilesEntrada2 {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    // Opciones + Consola > Opcion
    public static final char obtenerOpcion(String msgUsr, String msgErr, String opc) {
        char opcion;
        boolean opcionOK = false;
        do {
            opcion = leerCaracter(msgUsr, "");
            if (opc.contains(opcion + "")) {
                opcionOK = true;
            } else {
                System.out.println("---");
                System.out.println(msgErr);
                System.out.println("---");
            }
        } while (!opcionOK);
        return opcion;
    }

    // Consola > Cáracter
    public static final char leerCaracter(String msgUsr, String msgErr) {
        // Dato a introducir
        char dato = 0;

        // Proceso de lectura
        boolean lecturaOK = false;
        do {
            try {
                // Entrada dato
                System.out.print(msgUsr);
                dato = SCN.nextLine().charAt(0);

                // Marca el semáforo
                lecturaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            }
        } while (!lecturaOK);

        // Devolver dato
        return dato;
    }

    // Pausa + MSG >> INTRO
    public static final void hacerPausa(String msgUsr) {
        System.out.println("---");
        System.out.println(msgUsr);
        hacerPausa();
    }

    // Pausa >> INTRO
    public static final void hacerPausa() {
        System.out.println("---");
        System.out.print("Pulse INTRO para continuar ...");
        SCN.nextLine();
        System.out.println("---");
    }

    // Consola >> Entero
    public static final int leerEntero(String msgUsr, String msgErr) {
        // Dato a introducir
        int dato = 0;

        // Proceso de lectura
        boolean lecturaOK = false;
        do {
            try {
                // Entrada dato
                System.out.print(msgUsr);
                dato = SCN.nextInt();

                // Marca el semáforo
                lecturaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!lecturaOK);

        // Devolver dato
        return dato;
    }
    
    // Consola >> Real
    public static final double leerReal(String msgUsr, String msgErr) {
        // Dato a introducir
        double dato = 0;

        // Proceso de lectura
        boolean lecturaOK = false;
        do {
            try {
                // Entrada dato
                System.out.print(msgUsr);
                dato = SCN.nextDouble();

                // Marca el semáforo
                lecturaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!lecturaOK);

        // Devolver dato
        return dato;
    }

    // Consola >> Entero [min .. max]
    public static final int leerEntero(String msgUsr, String msgErr, int min, int max) {
        // Numero a devolver
        int dato;

        // Semaforo validacion
        boolean rangoOK;

        // Bucle Validacion
        do {
            // Introducir Entero
            dato = leerEntero(msgUsr, msgErr);

            // Validar Entero
            rangoOK = dato >= min && dato <= max;

            // Mensaje de error
            if (!rangoOK) {
                System.out.println(msgErr);
            }
        } while (!rangoOK);

        // Devolver número
        return dato;
    }

    // Consola >> Texto
    public static final String leerTexto(String msgUsr) {
        System.out.print(msgUsr);
        return SCN.nextLine();
    }

    // Confirmación S/N + Defecto > Boolean
    public static final boolean confirmarProceso(String msgUsr, boolean defectoOK) {
        // Semáforo
        boolean confirmacionOK = defectoOK;

        // Consola > Caracter
        String entrada = leerTexto(msgUsr);

        // Analisis Entrada
        if (entrada.length() > 0) {
            // Entrada > Caracter 1
            char c = entrada.charAt(0);

            // Caracter [Ss | Nn] > Boolean
            confirmacionOK = "Ss".contains(c + "");
        }

        // Devolución Confirmación
        return confirmacionOK;
    }
  
    
}

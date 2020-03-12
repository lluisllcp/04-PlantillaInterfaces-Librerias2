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

/**
 *
 * @author Lluís Cerdà Pascual aw.lluiscerda@gmail.com
 */
public class UtilesCarrito2 {

    // separador de Línea
    public static final String LS = System.getProperty("line.separator");

    // Opciones Menús
    public static final String OPC_MENU_PPAL = "IiCcXx";
    public static final String OPC_MENU_ITEM = "AaBbCcMmLlXx";
    public static final String OPC_MENU_CONT = "FfOoXx";
    public static final String OPC_MENU_ORDE = "IiNnPpCcXx";

    // Texto Menú Principal
    public static final String TXT_MENU_PPAL
            = "MENU PRINCIPAL" + LS
            + "==============" + LS
            + "[ I ] Gestión Items" + LS
            + "[ C ] Gestión Contenido" + LS
            + "---" + LS
            + "[ X ] Salir" + LS
            + "---" + LS
            + "Introducir opción: ";

    // Texto Menú Items
    public static final String TXT_MENU_ITEM
            = "MENU ITEMS" + LS
            + "==========" + LS
            + "[ A ] Agregar item" + LS
            + "[ B ] Borrar Item" + LS
            + "[ C ] Consultar Item" + LS
            + "[ M ] Modificar Item" + LS
            + "[ L ] Listar Items" + LS
            + "---" + LS
            + "[ X ] Menu Anterior" + LS
            + "---" + LS
            + "Introducir opción: ";

    // Texto Menú Contenido
    public static final String TXT_MENU_CONT
            = "MENU CONTENIDO" + LS
            + "==============" + LS
            + "[ F ] Filtrar contenido" + LS
            + "[ O ] Ordenar contenido" + LS
            + "---" + LS
            + "[ X ] Menu Anterior" + LS
            + "---" + LS
            + "Introducir opción: ";

    // Texto Menú Ordenación
    public static final String TXT_MENU_ORDE
            = "MENU ORDENACION" + LS
            + "===============" + LS
            + "[ I ] Por ID" + LS
            + "[ N ] Por NOMBRE" + LS
            + "[ P ] Por PRECIO" + LS
            + "[ C ] Por COLOR" + LS
            + "---" + LS
            + "[ X ] Menu Anterior" + LS
            + "---" + LS
            + "Introducir opción: ";

    public static final String TXT_MENU_ERROR = "ERROR: Opción no válida";

}

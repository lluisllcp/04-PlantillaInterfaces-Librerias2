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

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class UtilesGraficos {

    public static final String obtenerNombreColor(Color color) {
        String nombreColor;
        if (color == null) {
            nombreColor = "indefinido";
        } else if (color.equals(Color.BLACK)) {
            nombreColor = "negro";
        } else if (color.equals(Color.BLUE)) {
            nombreColor = "azul";
        } else if (color.equals(Color.CYAN)) {
            nombreColor = "celeste";
        } else if (color.equals(Color.GRAY)) {
            nombreColor = "gris";
        } else if (color.equals(Color.GREEN)) {
            nombreColor = "verde";
        } else if (color.equals(Color.MAGENTA)) {
            nombreColor = "púrpura";
        } else if (color.equals(Color.ORANGE)) {
            nombreColor = "naranja";
        } else if (color.equals(Color.PINK)) {
            nombreColor = "rosa";
        } else if (color.equals(Color.RED)) {
            nombreColor = "rojo";
        } else if (color.equals(Color.WHITE)) {
            nombreColor = "blanco";
        } else if (color.equals(Color.YELLOW)) {
            nombreColor = "amarillo";
        } else {
            nombreColor = "indefinido";
        }
        return nombreColor;
    }

    public static Color generarColor(String nombreColor) {
          Color c;
        if (nombreColor == null) {
            c = Color.BLACK;
        } else if (nombreColor.equals("negro")) {
            c = Color.BLACK;
        } else if (nombreColor.equals("azul")) {
            c = Color.BLUE;
        } else if (nombreColor.equals("celeste")) {
            c = Color.CYAN;
        } else if (nombreColor.equals("gris")) {
            c = Color.GRAY;
        } else if (nombreColor.equals("verde")) {
            c = Color.GREEN;
        } else if (nombreColor.equals("púrpura")) {
            c = Color.MAGENTA;
        } else if (nombreColor.equals("naranja")) {
            c = Color.ORANGE;
        } else if (nombreColor.equals("rosa")) {
            c = Color.PINK;
        } else if (nombreColor.equals("rojo")) {
            c = Color.RED;
        } else if (nombreColor.equals("blanco")) {
            c = Color.WHITE;
        } else if (nombreColor.equals("amarillo")) {
            c = Color.YELLOW;
        } else {
            c = Color.BLACK;
        }
        return c;
    }
    }



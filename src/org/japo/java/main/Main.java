/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
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
package org.japo.java.main;

import org.japo.java.app.App;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public final class Main {
//Clave de acceso

    private static final String ACCESS_UID = "JAPO-Omicron-0";
//punt de entrada al programa

    public static final void main(String[] args) {
//si
        if (args.length == 1 && args[0].equals(ACCESS_UID)) {
           final App APP = new App();
            APP.launchApp();
//sino    
        } else {
            System.out.println("Acceso Denegado");
            System.out.println("---");
            System.out.println("Contacte con el servicio Técnico");
        }
    }
}

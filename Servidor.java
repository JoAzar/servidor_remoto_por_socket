//SERVIDOR

import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        try {
            int PUERTO = xxxx;
            ServerSocket servidor = new ServerSocket(PUERTO); //Puerto local
            System.out.println("Esperando conexión...");

            Socket cliente = servidor.accept(); //Espera conexión
            System.out.println("Cliente conectado: " + cliente.getInetAddress());

            DataInputStream entrada = new DataInputStream(cliente.getInputStream());
            DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());

            String mensaje = entrada.readUTF(); //Recibe
            System.out.println("El cliente dice: " + mensaje);
            salida.writeUTF("Hola, soy el servidor"); //Devuelve

            cliente.close();
            servidor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

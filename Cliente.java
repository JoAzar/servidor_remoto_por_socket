//CLIENTE, PRECISA UN SERVIDOR LEVANTADO PREVIAMENTE AL QUE CONECTARSE

import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) {
        try {
            String IP = "la ip a la que querés conectarte";
            int SOCKET = XXXX;
            Socket cliente = new Socket(IP, SOCKET);
            DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());
            DataInputStream entrada = new DataInputStream(cliente.getInputStream());
            salida.writeUTF("Hola servidor"); //Mensaje a enviar
            String respuesta = entrada.readUTF(); //Respuesta del servidor
            System.out.println("El servidor dice: " + respuesta);
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

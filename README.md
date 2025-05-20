# 🧪 Java Socket Chat - Comunicación entre PCs

Este proyecto demuestra cómo establecer una conexión cliente-servidor en Java utilizando **sockets TCP/IP**

Permite enviar y recibir mensajes entre dos computadoras conectadas en la misma red local

---

## 🚀 Funcionalidades

- 🖥️ Comunicación bidireccional entre cliente y servidor
- 🔌 Uso de `ServerSocket` y `Socket`
- ✉️ Intercambio de mensajes usando `DataInputStream` y `DataOutputStream`
- 🧹 Cierre adecuado de conexiones

---

## 📦 Estructura

📁 src/
├── Servidor.java #Código del servidor que espera conexiones
└── Cliente.java #Código del cliente que envía el primer mensaje


---

## 🔧 Requisitos

- Java 8 o superior
- Dos computadoras en la misma red (WiFi o LAN)
- Configurar el firewall para permitir el puerto usado

---

## 🛠️ Cómo usar

### 1. Ejecutar el servidor

En una de las máquinas

```bash
javac Servidor.java
java Servidor

2. Ejecutar el cliente

En la otra máquina:

javac Cliente.java
java Cliente

Socket cliente = new Socket(ip, puerto);

´´´



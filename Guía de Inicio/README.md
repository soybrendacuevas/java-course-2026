# Guía de Inicio: Configuración de Entorno Java
¡Bienvenido al curso! Para poder trabajar en este proyecto, necesitas configurar tu "estación de trabajo". Sigue estos pasos detallados para dejar todo listo.

1. ☕ Instalación del JDK 
Java necesita un Kit de Desarrollo (JDK) para compilar y ejecutar código. Usaremos la versión LTS 17 o 21.

  1.1. Descarga el instalador desde Adoptium (Temurin): https://adoptium.net/es/temurin/releases<br>
  1.2. Durante la instalación (Windows): Es vital marcar todas las casillas, especialmente:<br>
    - Add to PATH<br>
    - Set JAVA_HOME variable<br>
  1.3. Verificación: Abre una terminal (CMD o PowerShell) y escribe:<br>
    ```bash
      java -version
    ```
    Deberías ver una respuesta indicando la versión de Java instalada.<br>

2. Configuración del IDE (Tu Editor)
Puedes elegir entre IntelliJ IDEA (potente y profesional) o VS Code (ligero y rápido).

🛠️ Opción A: IntelliJ IDEA (Recomendado para Java)<br>
- Descarga e instala IntelliJ Community Edition<br>
- Al abrir el proyecto: **File > Open** -> Selecciona la carpeta donde descargaste este repositorio.<br>
- Si aparece un mensaje abajo a la derecha diciendo "Maven project need to be imported", haz clic en Load Maven Project.<br>
- Ve a **File > Project Structure > Project** y asegúrate de que el SDK sea el que instalaste en el paso 1.<br>

🛠️ Opción B: Visual Studio Code<br>
- Instala el "Extension Pack for Java" desde el menú de extensiones (Ctrl+Shift+X).
- Abre la carpeta del proyecto: File > Open Folder.
- Espera a que la barra de estado (abajo) termine de decir "Opening Java Project".
- Importante: Si ves errores en rojo, presiona Ctrl+Shift+P y ejecuta: Java: Clean Java Language Server Workspace.

3. Estructura del Repositorio propuesta para tus proyevtos
   Para este curso, trabajaremos con la estructura estándar de la industria (Maven):
   ```bash
      nombre-del-proyecto/
      ├── src/
      │   ├── main/java/       <-- ¡Aquí escribirás todo tu código!
      ├── pom.xml              <-- Configuración de librerías (recomendado).
      └── README.md            <-- la información para el proyecto
    ```
4. Cómo trabajar en los ejercicios<br>
4.1.  Sincronizar cambios<br>
Antes de empezar, asegúrate de tener la última versión del código<br>
4.2. Ejecutar el código<br>
En IntelliJ: Busca la clase con el método public static void main, haz clic en el triángulo verde ▶️ a la izquierda del código.<br>
En VS Code: Haz clic en el botón Run que aparece flotando sobre el método main.<br>
4.3. Ejecutar Pruebas (Tests)<br>
Para saber si tu ejercicio es correcto, corre los tests:<br>
Terminal: mvn test<br>
IDE: Clic derecho en la carpeta src/test/java -> Run All Tests.<br>

❓ Solución de Problemas Comunes<br>
"Java no se reconoce como un comando": No marcaste "Add to PATH" durante la instalación del JDK. Reinstala o edita las Variables de Entorno.<br>
"Errores de símbolos rojos en todo el código": Tu IDE no ha descargado las librerías. Haz clic derecho en el archivo pom.xml y selecciona Maven > Reload project.<br>

# Laboratorio 07 - Pruebas Unitarias

## Contexto del laboratorio: MercaGo

MercaGo se encuentra preparando una nueva versión de su sistema de ventas y gestión interna. Antes de liberar nuevas funcionalidades, el equipo necesita asegurar que las clases principales funcionen correctamente mediante pruebas unitarias automatizadas con **JUnit 5**.

En este laboratorio practicarás la creación y ejecución de pruebas unitarias en Java usando **Maven**, **JUnit 5** y **GitHub Codespaces**.

> Importante: en este laboratorio no necesitas instalar Java ni Maven en tu computadora. El entorno de trabajo se ejecutará en GitHub Codespaces.

---

## Paso 1: Crear tu propia copia del repositorio

1. Ingresa al repositorio compartido por el docente.
2. Haz clic en **Fork**.
3. Crea el fork en tu propia cuenta de GitHub.
4. Entra al repositorio que se creó en tu cuenta.

Cada estudiante debe trabajar sobre su propio fork.

---

## Paso 2: Abrir en GitHub Codespaces

Desde tu fork:

1. Haz clic en el botón verde **Code**.
2. Entra a la pestaña **Codespaces**.
3. Haz clic en **Create codespace on main**.
4. Espera que cargue el entorno.
5. Abre la terminal.

---

## Paso 3: Verificar el entorno de trabajo

Ejecuta los siguientes comandos en la terminal del Codespace:

```bash
java -version
javac -version
mvn --version
```

Estos comandos permiten validar que el entorno tiene Java, el compilador de Java y Maven disponibles.

---

## Ejercicio 01: Pruebas unitarias para Calculadora

La clase `Calculadora` contiene operaciones aritméticas básicas como suma, multiplicación y división. En este ejercicio se debe validar que sus métodos funcionen correctamente y que la división entre cero lance la excepción esperada.

En este repositorio, el ejercicio 01 ya incluye la clase de prueba `CalculadoraTest` como ejemplo inicial.

Para ejecutar las pruebas del ejercicio 01:

```bash
mvn test -Dtest=CalculadoraTest
```

También puedes ejecutar todas las pruebas disponibles con:

```bash
mvn test
```

El resultado esperado es que las pruebas finalicen correctamente con `BUILD SUCCESS`.

---

## Ejercicio 02: Crear pruebas unitarias para GestorTareas

En este ejercicio deberás crear la clase de prueba para `GestorTareas`.

Crea el archivo:

```text
src/test/java/GestorTareasTest.java
```

La clase de prueba debe incluir:

- Un campo `GestorTareas gestor;`
- Un método con `@BeforeEach` para inicializar el gestor con dos tareas pendientes.
- Al menos cuatro pruebas:
  - `testPendientesIniciales`
  - `testCompletarTarea`
  - `testEliminarTarea`
  - `testCompletarInexistente`

Para ejecutar solo las pruebas del ejercicio 02:

```bash
mvn test -Dtest=GestorTareasTest
```

Para ejecutar todas las pruebas del laboratorio:

```bash
mvn test
```

---

## Entregable final

El entregable será un **PDF** con los siguientes pantallazos:

### Pantallazo 1: Verificación del entorno

Debe verse la ejecución de estos comandos en el workspace:

```bash
java -version
javac -version
mvn --version
```

### Pantallazo 2: Ejecución de las pruebas del ejercicio 01

Debe verse la ejecución de:

```bash
mvn test -Dtest=CalculadoraTest
```

También debe apreciarse que las pruebas terminan correctamente.

### Pantallazo 3: Creación del test y ejecución de pruebas del ejercicio 02

Debe incluir:

1. Imagen de la clase `GestorTareasTest` creada por el estudiante.
2. Ejecución del comando:

```bash
mvn test -Dtest=GestorTareasTest
```

El resultado debe mostrar que las pruebas se ejecutan correctamente.

---

## Recomendación final

Cuando termines el laboratorio, guarda tus cambios en tu fork con commit y push. Además, elimina el Codespace si ya no lo utilizarás para evitar consumir recursos innecesarios.

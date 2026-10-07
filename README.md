# UNIVERSIDAD DE CÓRDOBA

## FACULTAD DE INGENIERÍAS

### PROGRAMA DE INGENIERÍA DE SISTEMAS

---

# GUÍA ACTIVIDAD VIRTUAL

**Curso:** Programación II

## Tema: Listas Doblemente Enlazadas

---

## 🎯 Objetivo

Desarrollar una aplicación en **Java**, aplicando los conceptos aprendidos sobre el tema de **listas doblemente enlazadas**.

---

# 📋 Descripción del Problema

El programa Departamental de **Niños Bajos en Peso** quiere recolectar la información de los niños entre **uno y seis años**, de los municipios de:

* Sahagún
* Montería
* Lorica

Se requieren los datos del **representante (madre o padre)** del niño:

* Identificación
* Nombre

En cuanto al **niño**, se requiere almacenar:

* Número de registro civil
* Nombre
* Talla
* Peso
* Edad
* Municipio

> **Nota:** Un representante puede tener registrados hasta **2 niños** en el sistema.

Para la solución de la aplicación se deben implementar en **Java** las clases necesarias que permitan llenar una **lista doblemente enlazada**, que almacene la información recolectada de los niños en cada municipio.

---

# 📌 Requerimientos

El director del programa de niños bajos en peso requiere que la aplicación realice diferentes operaciones sobre la información almacenada.

## 🧱 Requerimientos de Estructuras de Datos

Utilizar una **lista doblemente enlazada** para registrar la información de cada niño y su representante.

La lista debe permitir realizar recorridos:

* Desde el inicio hacia el final.
* Desde el final hacia el inicio.

---

# ⚙️ Requerimientos Funcionales

La aplicación debe permitir realizar las siguientes operaciones:

### 1. Agregar al final

Agregar la información del niño y su representante **al final de la lista**.

### 2. Insertar entre nodos

Insertar la información de un nuevo niño **entre dos nodos existentes**.

### 3. Agregar al principio

Agregar la información de un niño y su representante **al principio de la lista**, es decir, mediante la cabeza de la lista.

### 4. Buscar por registro civil

Buscar la información de **talla y peso** de un niño utilizando como dato de búsqueda su **número de registro civil**.

La búsqueda debe realizarse recorriendo la lista:

```text
Inicio → Final
```

### 5. Buscar por identificación del representante

Buscar la información utilizando como parámetro la **identificación del representante del niño**.

En este caso, la lista debe recorrerse desde:

```text
Final → Inicio
```

### 6. Eliminar

Eliminar la información correspondiente a un **niño y su representante** de la lista.

---

# 📊 Requerimientos de Reportes

La aplicación debe contar con un **menú de opciones** que permita realizar las operaciones anteriormente descritas y generar los siguientes informes.

## 1. Niños bajos de estatura

Los niños entre **4 y 6 años** que midan menos de **1 metro de estatura** se consideran bajos de estatura.

Se requiere:

* Determinar la cantidad de niños bajos de estatura.
* Mostrar la cantidad correspondiente a cada municipio.
* Recorrer la lista desde el **final hasta el inicio**.

### Condición

```text
Edad >= 4 && Edad <= 6
Talla < 1 metro
```

---

## 2. Niños bajos de peso

Los niños entre **2 y 3 años** con un peso menor de **15 kilogramos** se consideran bajos de peso.

Se requiere:

* Generar un listado con la información de los niños que cumplan estas condiciones.
* Mostrar la cantidad de niños bajos de peso en cada municipio.

### Condición

```text
Edad >= 2 && Edad <= 3
Peso < 15 kg
```

---

## 3. Listado por municipios

Generar un listado organizado por municipios con la información de **todos los niños registrados**.

También se debe mostrar un consolidado con la cantidad de niños registrados en cada municipio:

| Municipio | Cantidad de niños |
| --------- | ----------------: |
| Sahagún   |                 — |
| Montería  |                 — |
| Lorica    |                 — |

---

## 4. Generar archivo de texto

Generar un **archivo de texto (`.txt`)** que contenga toda la información almacenada en la lista doblemente enlazada.

---

# 💻 Requisitos de Implementación

La actividad deberá realizarse en **parejas (2 personas)** utilizando:

* **Java**
* **NetBeans**
* **JFrame**
* **JTable**
* Otros componentes gráficos necesarios

La aplicación debe implementar correctamente la estructura de datos de **lista doblemente enlazada**.

---

# 📐 Diagrama de Clases UML

La solución debe incluir el respectivo **Diagrama de Clases UML**.

Se debe entregar:

1. Imagen del diagrama de clases UML.
2. Archivo editable utilizado para realizar el diagrama.

> ⚠️ **No está permitido utilizar el plugin de NetBeans para extraer automáticamente el diagrama de clases UML.**

---

# 📄 Documento Word

También se debe incluir un archivo de **Microsoft Word** que contenga:

* Portada institucional.
* Información de los integrantes.
* Información correspondiente a la actividad.

---

# 📦 Entrega

Todas las carpetas y archivos que den solución a la actividad deben estar comprimidos en una única carpeta en formato:

```text
.zip
```

La carpeta debe contener, como mínimo:

```text
Proyecto/
├── Proyecto-NetBeans/
├── Diagrama-UML/
│   ├── diagrama.png
│   └── diagrama.[archivo editable]
├── Documento/
│   └── documento.docx
└── README.md
```

---

# ⚠️ Consideraciones Finales

* La actividad debe ser enviada mediante la plataforma **Moodle (CINTIA)**.
* La actividad debe ser resuelta de forma **individual**, según las consideraciones finales indicadas en la guía.
* Se debe enviar una **carpeta comprimida** con todos los archivos correspondientes al proyecto desarrollado en NetBeans.
* El proyecto debe contener todos los archivos necesarios para su ejecución.

---

# ✅ Resumen de funcionalidades

La aplicación debe permitir:

* [ ] Registrar niños y representantes.
* [ ] Agregar nodos al inicio.
* [ ] Agregar nodos al final.
* [ ] Insertar nodos entre otros nodos.
* [ ] Buscar por número de registro civil.
* [ ] Buscar por identificación del representante.
* [ ] Eliminar niños y representantes.
* [ ] Recorrer la lista de inicio a fin.
* [ ] Recorrer la lista de fin a inicio.
* [ ] Identificar niños bajos de estatura.
* [ ] Identificar niños bajos de peso.
* [ ] Generar reportes por municipio.
* [ ] Contabilizar niños por municipio.
* [ ] Generar archivo `.txt`.
* [ ] Implementar interfaz gráfica con JFrame.
* [ ] Utilizar JTable.
* [ ] Incluir diagrama de clases UML.
* [ ] Incluir documento Word con portada institucional.
* [ ] Entregar todo comprimido en `.zip`.

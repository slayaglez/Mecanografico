<img src="img/meca_header.png">
<br>

![OpenSource](https://img.shields.io/badge/Open%20Source-22bb44?style=for-the-badge) ![java](https://img.shields.io/badge/java-FF6600?style=for-the-badge) ![maven](https://img.shields.io/badge/maven-dd0000?style=for-the-badge)
<hr>

# Introducción

Mecanográfico es un **minijuego** para practicar tu velocidad de escritura desde la terminal. **Cronometra** tu tiempo en copiar una frase y cuenta los **errores** del usuario en comparación a la cadena original de texto, la cual se escoge aleatoriamente de un repertorio de más de **100** frases. Por úlitmo también se puede escoger una **dificultad**, que determinará la longitud de la cadena de texto a escribir 
<hr>

# Descarga

En "Releases" o en este [enlace](https://github.com/slayaglez/Mecanografico/releases/tag/v1.0.5) puedes escoger el instalador para tu sistema operativo. Las descargas, respectivamente, son las siguientes:

- Windows - ` Mecanografico-1.0.msi `
- Linux - ` mecanografico_1.0-1_amd64.deb `
- Mac - ` Mecanografico-1.0.dmg `

Ya no es necesario tener instalado Java 17 o Maven en tu equipo.
<br>
<hr>

# El Proceso

## 🧩 Motivo del proyecto
Decidí crear este proyecto inicialmente como un minijuego absurdo para practicar mi mecanografía sin tener acceso a internet, pero poco a poco fui añadiendo cada vez más detalles por pura diversión. Esto evidentemente derivó en ciertos contratiempos.
<br>

## 🚧 Problemas por el camino
Cuando quise compartir mi proyecto me enfrente al problema de los distintos sistemas **operativos**. Tras investigar sobre la manera más sencilla de hacer llegar el proyecto a todos los sistemas dí con el **Actions** de GitHub, que crea un distribuible para Windows, Linux y Mac.

Por el camino me topé con infinidad de problemas en el distribuible de Windows como los colores de la terminal o el hecho de que por defecto el encoding que usa no es UTF-8.
<br>

## 🎯 Aprendizaje
Con este proyecto he tenido un primer contacto con los distribuibles, he aprendido mucho sobre el PowerShell y el cmd de Windows y sobretodo la capacidad de ubicar, depurar e identificar problemas más escondidos (Como un programa que no abre y no suelta código de error). 

También fue mi primer contacto con la implementación de dependencias como Jansi para darle color a la consola de Windows entre otras. 

La importancia de un buen **control de versiones** y de testear todas las características que se implementen son también algo a destacar.

Por último hice mi primer build.yml que aunque complejo en un inicio, es increíblemente práctico y de vital importancia para el Actions y los distintos distribuibles.
<br>

## 🧭 Mejoras
Si tuviera más tiempo, mi intención es conectar al programa una base de datos sencilla que guarde puntuaciones de partidas pasadas y palabras que con un algoritmo forme frases nuevas para no estar limitado al número de frases que pueda meter en un array.

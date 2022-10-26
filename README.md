# TallerSOLIDG1
##  Incumplimiento a los principios *SOLID*:
### Single responsability:

### Open-Close:

### Linskov substitution: 
La clase LecheDeslactosada no puede reemplazar a la clase LecheEntera en su totalidad ya que lanzamos una excepción al momento de usar la Leche Deslactosada en un pastel, por lo que no cumple el principio de sustitución de Liskov.

### Interface segregation:

### Dependancy inversion:


## Análisis del código:
Las clases Helado y Pastel deberían extender de una clase Padre que tenga todos los métodos que se repiten en dichas clases, así estas clases solo implementarían constructores y ToString

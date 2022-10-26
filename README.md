# TallerSOLIDG1
##  Incumplimiento a los principios *SOLID*:
### Single responsability:

### Open-Close:

Cada vez que se quisiera anadir un nuevo aderezo se tendira que haber editado la clase aderezos ya que estaba como un enum.


### Linskov substitution: 
La clase LecheDeslactosada no puede reemplazar a la clase LecheEntera en su totalidad ya que lanzamos una excepción al momento de usar la Leche Deslactosada en un pastel, por lo que no cumple el principio de sustitución de Liskov.

### Interface segregation: 
No hay interfaces que analizar.

### Dependancy inversion:


## Análisis del código:

Las clases Helado y Pastel deberían extender de una clase Padre que tenga todos los métodos que se repiten en dichas clases, así estas clases solo implementarían constructores y ToString.

La clase Aderezo tendria que ser editada y anadida con cada aderezo nuevo que se ingresara al menu cuando se establecio como enum, pero si la volvemos un abstract entonces mejora mucho la forma en que puede ser manejada y que hereden de esta.

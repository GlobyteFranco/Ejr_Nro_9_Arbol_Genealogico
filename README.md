# Ejercicio Numero 9 de la guia de ejercicios de Java
# Patrones de dise;o posibles: Visitor, Strategy, Builder
# Implementacion del Patron
# Consigna
La embajada de Italia lo contrata para que diseñe un software que permita saber si una
persona es apta para recibir la ciudadanía Italiana. Para dicho proceso se cargan los
datos de la persona (dni, nombre, apellido y nacionalidad) y los datos de su padre, madre,
abuelo, bisabuelo y antepasados que también son personas por lo tanto los datos son los
mismos (dni, nombre, apellido y nacionalidad). El objetivo es cargar el árbol genealógico
de la persona de tal manera de poder analizar si es válido darle la nacionalidad. Los datos
del árbol genealógico se cargan hasta encontrarnos con un desconocido, en este caso se
detiene la carga de esa rama del árbol. Una persona es considerada para el proceso de
nacionalidad Italiana, si es Italiana o si al menos el número de sus antepasados Italianos
son igual al nivel de antepasados . Por ejemplo si su padre o madre o ambos son italianos
(dado que el nivel es 1) o si tiene 2 o más abuelos italianos o 3 o más bisabuelos, etc.
a. Realice un diseño que permita resolver dicho problema y permita saber si una
persona es apta para el proceso de ciudadanía.
# How to use queue
Queue<Persona> miCola = new LinkedList<>(); 

Una vez instanciada, Java ya te da armados los métodos exactos que necesitás para replicar la lógica de la "fila del supermercado" que hablamos antes. Los principales son:

.offer(elemento) (o también .add()): Inserta el elemento al final de la cola (es decir, manda al familiar al final de la fila).

.poll(): Extrae y te devuelve el elemento que está primero en la fila. Además de devolvértelo para que lo evalúes, lo saca definitivamente de la cola.

.size(): Te devuelve el número exacto (un int) de cuántos elementos hay formados en la cola en ese preciso milisegundo. Ideal para tu "foto" del nivel.

.isEmpty(): Te devuelve un boolean (true o false) indicando si la cola se vació por completo.
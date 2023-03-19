fun main(args: Array<String>) {
    val serpiente = Serpiente()
    serpiente.crecer()
    serpiente.decrecer()
    serpiente.mudar()
    serpiente.ataque()
    println(serpiente)


}




    /*Diseñaremos un programa orientado a objetos que nos permita simular la vida de una
            serpiente. Nuestra serpiente será un poco especial y tendrá las siguientes características:
    - Es una serpiente compuesta por anillas de un color diferente cada una. Estos colores
    podrán alternar entre (r ,v,a). Por ejemplo: rrvva  sería una serpiente de 5 anillas.
    - Cuando nace tiene un color asignado al azar.
    - Se simulará su vida hasta que esté muerta (en nuestro caso se quede sin cuerpo) de
            forma que cada año (segundo):
    o Si es joven (menos de 10 años) hará dos cosas:
     Crecerá el 80% de las veces: añadiendo una nueva anilla a su cuerpo de
    un color asignado aleatoriamente.
     Mudará la piel el 20% de las veces. En este caso se cambia el cuerpo de
            toda la serpiente respetando su número de anillas.
    o Si ya va siendo mayorcilla (más de 10 años):
     Decrecerá el 90% de las veces: quitando una anilla a su cuerpo (la
    última) y respetando el resto.
     Mudará la piel el 10% de las veces.
    - Aleatoriamente, el 10% de las veces, durante el año de esa vida puede sufrir el ataque
    de una mangosta que se la zampa y por lo tanto la serpiente muere y se para la
            simulación.
            Cuando esté realizado, generaliza el ejercicio para un nido de serpientes que puede albergar,
    como máximo, hasta 20 serpientes*/




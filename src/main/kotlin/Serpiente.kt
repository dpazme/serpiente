class Serpiente {

   private var cuerpo: String = ""
   private var edad: Int = 0
   private var muerta: Boolean = false
   private var colores: Array<String> = arrayOf("r", "v", "a")
   private var colorAleatorio: Int = 0
   private var crecer: Int = 0
   private var mudar: Int = 0
   private var ataque: Int = 0
   private var decrecer: Int = 0

    constructor(cuerpo: String, edad: Int, muerta: Boolean, colores: Array<String>, colorAleatorio: Int, crecer: Int, mudar: Int, ataque: Int, decrecer: Int) {
        this.cuerpo = cuerpo
        this.edad = edad
        this.muerta = muerta
        this.colores = colores
        this.colorAleatorio = colorAleatorio
        this.crecer = crecer
        this.mudar = mudar
        this.ataque = ataque
        this.decrecer = decrecer
    }

    constructor() {
        println("Constructor por defecto")
    }

    fun getCuerpo(): String {
        return cuerpo
    }

    fun setCuerpo(cuerpo: String) {
        this.cuerpo = cuerpo
    }

    fun getEdad(): Int {
        return edad
    }

    fun setEdad(edad: Int) {
        this.edad = edad
    }

    fun getMuerta(): Boolean {
        return muerta
    }

    fun setMuerta(muerta: Boolean) {
        this.muerta = muerta
    }

    fun getColores(): Array<String> {
        return colores
    }

    fun setColores(colores: Array<String>) {
        this.colores = colores
    }

    fun getColorAleatorio(): Int {
        return colorAleatorio
    }

    fun setColorAleatorio(colorAleatorio: Int) {
        this.colorAleatorio = colorAleatorio
    }

    fun getCrecer(): Int {
        return crecer
    }

    fun setCrecer(crecer: Int) {
        this.crecer = crecer
    }

    fun getMudar(): Int {
        return mudar
    }

    fun setMudar(mudar: Int) {
        this.mudar = mudar
    }

    fun getAtaque(): Int {
        return ataque
    }

    fun setAtaque(ataque: Int) {
        this.ataque = ataque
    }

    fun getDecrecer(): Int {
        return decrecer
    }

    fun setDecrecer(decrecer: Int) {
        this.decrecer = decrecer
    }

    fun crecer() {
        crecer++
    }

    fun decrecer() {
        decrecer++
    }

    fun mudar() {
        mudar++
    }

    fun ataque() {
        ataque++
    }

    fun colorAleatorio() {
        colorAleatorio = (0..2).random()
    }

    fun muerte() {
        muerta = true
    }

    fun nacer() {
        muerta = false
    }

    fun crecerCuerpo() {
        cuerpo += colores[colorAleatorio]
    }

    fun decrecerCuerpo() {
        cuerpo = cuerpo.substring(0, cuerpo.length - 1)
    }

    fun mudarCuerpo() {
        cuerpo = cuerpo.replace(colores[colorAleatorio], colores[(0..2).random()])
    }

    fun ataqueCuerpo() {
        cuerpo = cuerpo.replace(colores[colorAleatorio], "")
    }

    public fun addcuerpo(colores: Array<String>) : Boolean{
        var conseguido = false
        var i : Int = 0

        while(i < this.colores.size && this.colores[i] != null) {
            i++
        }

        if(i < this.colores.size) {
            this.colores[i] = colores
            conseguido = true
        }
        if (!conseguido){ //Est todo lleno.
            this.colores = this.aumentarArray()
            this.colores[this.colores.size-1] = colores
            conseguido = true
        }
        return conseguido
    }

    private fun aumentarArray() : Array<Serpiente?>{ //Aumenta el tamaño del array en 1.
        var nuevoArray = Array<Serpiente?>(this.colores.size + 1){null}
        for(i in this.colores.indices){
            nuevoArray[i] = this.colores[i]
        }
        return nuevoArray
    }

    public fun removecuerpo(mod : String) : Boolean {
        var i: Int = 0
        var conseguido = false
        while (i < this.colores.size && !conseguido) {
            if (this.colores[i] != null) {
                if (this.colores[i]!!.getColores().equals(mod)) {
                    conseguido = true
                    this.colores[i] = null
                } else {
                    i++
                }
            }
            if (this.colores[i] == null) {
                i++
            }
        }
        return conseguido
    }

    



    override fun toString(): String {
        return "Serpiente(cuerpo='$cuerpo', edad=$edad, muerta=$muerta, colores=${colores.contentToString()}, colorAleatorio=$colorAleatorio, crecer=$crecer, mudar=$mudar, ataque=$ataque, decrecer=$decrecer)"
    }


}
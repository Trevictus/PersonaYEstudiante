open class Persona(val nombre: String, private var edad: Int) {

    init{
        require(nombre.isNotEmpty()){"El nombre no puede estar vacío."}
        require(edad >= 0){"La edad debe ser superior a -1."}
    }

    fun cumple(): Int{
        edad += 1
        return edad
    }

    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = ${mostrarEdad()})"
    }

    private fun mostrarEdad(): Int{
        return edad
    }

    open fun actividad(){
        println("$nombre está realizando una actividad.")

    }
}
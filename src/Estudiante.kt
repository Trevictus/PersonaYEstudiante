class Estudiante(nombre:String, edad: Int, private val carrera: String): Persona(nombre, edad) {

    override fun toString(): String {
        return super.toString() + "carrera = $carrera"
    }

    override fun actividad(){
        println("En el puesto nº1, $nombre que está en la carrera de $carrera.")

    }
}
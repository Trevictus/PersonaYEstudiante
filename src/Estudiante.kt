class Estudiante(nombre:String, edad: Int, private val carrera: String): Persona(nombre, edad) {

    override fun toString(): String {
        return super.toString() + "carrera = $carrera"
    }

    override fun actividad(): String {
        return super.actividad() + "En el puesto nº1, en la carrera de $carrera."

    }
}
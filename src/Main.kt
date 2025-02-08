fun main(){
    val persona1 = Persona("Sherry", 34)

    println("${persona1.nombre} ${persona1.edad}")

    println(persona1.cumple())
    println("${persona1.nombre} ${persona1.edad}")
    println(persona1)


    val persona2 = Persona("Alfredo", 24)
    val estudiante1 = Estudiante("Speedy Gonzales", 16, "100 metros lisos")

    persona2.actividad()
    estudiante1.actividad()

    val estudiante2 = Estudiante("Dory", -1, "Ingeniería química")

    println(estudiante2)
}
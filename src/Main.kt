import kotlin.math.pow

fun Double.redondear(posDecimales: Int): Double {
    /*val aplicarDecimales = 10.0.pow(posDecimales)
    return Math.round(this * aplicarDecimales) / aplicarDecimales*/

    return "%.${posDecimales}f".format(this).replace(",", ".").toDouble()
}

fun main() {
    val departamento1 = Departamento(mutableListOf<Empleado>(
        EmpleadoPorHora(160.0, 15.3,"1111", "Arturo"),
        EmpleadoPorHora(150.0, 9.3,"2222", "Jose Luís"),
        EmpleadoFijo(1650.0, 1,"3333", "Rodrigo"))
        )

    departamento1.agregarEmpleado(EmpleadoFijo(850.0, 2,"4444", "María"))

    for (empleado in departamento1.listaEmpleados) {
        println(empleado)
    }

    println("\nSALARIO TOTAL: ${departamento1.calculaSalarioTotal()}€ / mes.")

    val prueba1 = 9.94959459459.redondear(4)
    print(prueba1)
}
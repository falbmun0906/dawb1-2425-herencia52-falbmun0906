fun main() {
    val departamento1 = Departamento(mutableListOf<Empleado>(
        EmpleadoPorHora(160.0, 15.3,"1111", "Arturo"),
        EmpleadoPorHora(150.0, 9.3,"2222", "Jose Luís"),
        EmpleadoFijo(1650.0, 1,"3333", "Rodrigo"))
        )

    departamento1.agregarEmpleado(EmpleadoFijo(850.0, 2,"4444", "María"))

    for (empleado in departamento1.listaEmpleados) {
        println("${empleado.nombre} con ID-${empleado.id} tiene un salario de ${"%.2f".format(empleado.calcularSalario())}€ al mes.")
    }
}
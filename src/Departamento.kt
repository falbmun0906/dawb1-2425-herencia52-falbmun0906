class Departamento(val listaEmpleados: MutableList<Empleado>) {

    fun agregarEmpleado(empleado: Empleado) {
        listaEmpleados.add(empleado)
    }

    fun calculaSalarioTotal(): Double {
        var totalSalario = 0.0
        for (empleado in listaEmpleados) {
            totalSalario += empleado.calcularSalario()
        }
        return totalSalario
    }

}
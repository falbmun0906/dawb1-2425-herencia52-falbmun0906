class EmpleadoPorHora(val horasTrabajadas: Double, val tarifaPorHora: Double, id: String, nombre: String) : Empleado(id, nombre) {

    override fun calcularSalario(): Double {
        return horasTrabajadas * tarifaPorHora
    }


}
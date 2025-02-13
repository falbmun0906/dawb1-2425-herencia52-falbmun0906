class EmpleadoFijo(val salarioFijo: Double, val numPagas: Int, id: String, nombre: String) : Empleado(id, nombre) {
    override fun calcularSalario(): Double {
        return (salarioFijo * numPagas)
    }
}
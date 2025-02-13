abstract class Empleado(val id: String, val nombre: String) {

    init{
        require(id.length == 4) {"ERROR: El ID siempre debe tener 4 posiciones numéricas"}
    }
    abstract fun calcularSalario(): Double

    override fun toString(): String {
        return "${nombre} con ID-${id} tiene un salario de ${"%.2f".format(calcularSalario())}€ al mes."
    }
}
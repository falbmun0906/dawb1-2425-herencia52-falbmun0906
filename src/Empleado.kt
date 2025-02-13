abstract class Empleado(val id: String, val nombre: String) {

    init{
        require(id.length == 4) {"ERROR: El ID siempre debe tener 4 posiciones numéricas"}
    }
    abstract fun calcularSalario(): Double

}
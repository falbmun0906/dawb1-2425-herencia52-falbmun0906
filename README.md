# Ejercicio 2: Sistema de Empleados y Departamentos

Diseña una clase abstracta `Empleado` con propiedades como `nombre`, `id`, y un método abstracto `calculaSalario()`. Crea clases derivadas como `EmpleadoPorHora` y `EmpleadoFijo`, que implementen el método `calculaSalario()` de diferentes maneras. Considera añadir una clase `Departamento` que tenga una lista de empleados y pueda calcular el salario total que se debe pagar a todos sus empleados.

- `EmpleadoPorHora` podría implementar dos propiedades: `horasTrabajadas` al mes y `tarifaPorHora` para realizar el cálculo de su salario mensual.
- `EmpleadoFijo` podría tener a su vez dos propiedades distintas: `salarioFijo` y `numPagas`, con las que podríamos calcular su salario mensual.
- `Departamento` podría tener una lista de empleados y dos métodos: `agregarEmpleado` y `calculaSalarioTotal`, que calcula el salario total de sus empleados al mes.

En el `main`, crea una instancia de `Departamento`, agrega varios empleados, recorre la lista de los empleados mostrando su información en el formato:  
`"Nombre con ID-0001 tiene un salario de 28697.96 al mes."`  
(El ID siempre debe tener 4 posiciones numéricas y el salario debe mostrarse con 2 decimales).

¿Se te ocurre alguna restricción lógica que podríamos introducir a las propiedades?

## Objetivos:

- Aprender a manejar la herencia y la implementación de métodos abstractos.
- Comprender cómo diferentes subclases pueden tener implementaciones distintas de la misma operación (polimorfismo).
- Entender cómo agrupar múltiples objetos en una colección y realizar operaciones sobre ellos.
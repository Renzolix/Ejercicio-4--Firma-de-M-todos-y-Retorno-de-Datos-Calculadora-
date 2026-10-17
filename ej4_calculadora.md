# Ejercicio 4: Calculadora

## Explicación Lógica
1. **Clase Sin Estado:** La clase `Calculadora` no requiere atributos de instancia, ya que sus operaciones se realizan en función de los parámetros recibidos en el momento.
2. **Retorno de Datos:** Todos los métodos de cálculo (`sumar`, `restar`, `multiplicar`, `dividir`) retornan un tipo primitivo `double`.
3. **Validación Aritmética:** En el método `dividir()`, se agregó una condición `if (b == 0.0)` para evitar la división por cero; si el divisor es cero, muestra una advertencia y retorna `0.0`.
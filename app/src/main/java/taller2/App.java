/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */

    public static int Calcular_saldo(int base_taquilla, int total_recaudos, int total_retiros) {

        try {
            int saldo_total = 0;
            final int base_igual = 2000000;

            if (base_taquilla != base_igual) {
                return -1;
            }

            saldo_total = base_taquilla + total_recaudos - total_retiros;
            return saldo_total;

        }

        catch (Exception e) {
            return -1;
        }

    }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    
    public static String Calcular_tip (float consumo_cliente) {

        try {
            float valor_comida = 0, valor_propina = 0, impuesto_consumo= 0, total_pagar = 0;
            final short porcentaje_propina = 10;
            final short porcentaje_consumo = 8;
            final short condicion = 0;
            final short porcentaje = 100;

            if (consumo_cliente < condicion) {
                return "Error calculando consumo";
            }

            valor_comida = consumo_cliente;
            valor_propina = consumo_cliente * porcentaje_propina / porcentaje;
            impuesto_consumo = consumo_cliente *porcentaje_consumo / porcentaje;
            total_pagar = consumo_cliente + valor_propina + impuesto_consumo;
            return "valor comida: " + "$" + valor_comida + " - " + "valor propina " + "$" + valor_propina + " - " + "valor impoconsumo " + "$" + impuesto_consumo + " - " + "total a pagar " + "$" + total_pagar;

        } catch (Exception e) {
            return "Error en la función Calcular_tip";
        }

    }
    
    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */

    public static int Obtener_puntos (int partidos_ganados,int partidos_perdidos, int partidos_empatados){

        try {
            int puntos_finalesG = 0, puntos_finalesE = 0, puntos_finales = 0;
            final short puntos_ganar = 3, puntos_empate = 1; 
            final short condicion = 0;

            if (partidos_ganados < condicion || partidos_perdidos < condicion || partidos_empatados < condicion) {
                return -1;
            }
            
            puntos_finalesG = partidos_ganados * puntos_ganar;
            puntos_finalesE = partidos_empatados * puntos_empate;
            
            puntos_finales = puntos_finalesG + puntos_finalesE;
            return puntos_finales;
        }
        catch (Exception e) {
            return -1;
        }


     }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

    public static float Calcular_definitiva(float n1, float n2, float n3, float n4, float n5, float p1, float p2, float p3, float p4, float p5) {
        try {
            float nota_definitiva = 0;
            final byte p_min = 0, p_max = 1, n_min = 0, n_max = 5;
            final float suma_total = 1;
            
            float suma_por = p1 + p2 + p3 + p4 + p5; 

            if (n1 < n_min || n1 > n_max) {
                return -1;
            }
            else if (n2 < n_min || n2 > n_max) {
                return -1;
            }
            else if (n3 < n_min || n3 > n_max) {
                return -1;
            }
            else if (n4 < n_min || n4 > n_max) {
                return -1;
            }
            else if (n5 < n_min || n5 > n_max) {
                return -1;
            }

            if (suma_por != suma_total) {
                return -1;
            }
            else if (p1 < p_min || p1 > p_max) {
                return -1;
            }
            else if (p2 < p_min || p2 > p_max) {
                return -1;
            }
            else if (p3 < p_min || p3 > p_max) {
                return -1;
            }
            else if (p4 < p_min || p4 > p_max) {
                return -1;
            }
            else if (p5 < p_min || p5 > p_max) {
                return -1;
            }

            nota_definitiva = (n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4) + (n5 * p5);
            return nota_definitiva; 

        }
        
        catch (Exception e) {
            return -1;
        }
     }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */

    public static float Calcular_para_ganar(float n1, float n2, float n3, float n4, float p1, float p2, float p3, float p4, float p5){
       
        try {

            float nota = 0;
            float nota_para_ganar = 0;
            final byte nota_min_ganar = 3;
            final byte por_min = 0, por_max = 1, nota_min = 0, nota_max = 5;
            final float suma_final_por = 1;

            float suma_porcentaje = p1 + p2 + p3 + p4 + p5; 

            
            if (suma_porcentaje != suma_final_por) {
                return -1;
            }
            else if (p1 < por_min || p1 > por_max) {
                return -1;
            }
            else if (p2 < por_min || p2 > por_max) {
                return -1;
            }
            else if (p3 < por_min || p3 > por_max) {
                return -1;
            }
            else if (p4 < por_min || p4 > por_max) {
                return -1;
            }
            else if (p5 < por_min || p5 > por_max) {
                return -1;
            }

            
            if (n1 < nota_min || n1 > nota_max) {
                return -1;
            }
            else if (n2 < nota_min || n2 > nota_max) {
                return -1;
            }
            else if (n3 < nota_min || n3 > nota_max) {
                return -1;
            }
            else if (n4 < nota_min || n4 > nota_max) {
                return -1;
            }

            if (nota_para_ganar < nota_min || nota > nota_max) {
                return -1;
            }

            nota = (n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4);
            nota_para_ganar = (nota_min_ganar - nota) / p5;
            return nota_para_ganar;

        } 
        
        
        catch (Exception e) {
            return -1;
        }
     }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
    
    public static float Calcular_salario (int horas_normales, int horas_extra_D, int horas_extra_N, float valor_hora_normal){

        try {
            float horas_normalesf = 0;
            float horas_extra_Df = 0;
            float horas_extra_Nf = 0;
            float salario_total = 0;
            final float recargo_horas_extra_D = 15, recargo_horas_extra_N = 35;
            final float porcentaje = 100;
            final byte condicion = 0;

            if(valor_hora_normal <= condicion){
                return -1;
            }

            horas_normalesf = horas_normales * valor_hora_normal;
            horas_extra_Df = horas_extra_D * recargo_horas_extra_D  / porcentaje * valor_hora_normal;
            horas_extra_Nf = horas_extra_N * recargo_horas_extra_N  / porcentaje * valor_hora_normal;
            salario_total = horas_normalesf + horas_extra_Df + horas_extra_Nf;
            return salario_total;
        }
        
        catch (Exception e) {
            return -1;
        }

    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_triangulo(float base, float altura) {

        try {
            float area_triangulo = 0;
            final float division = 0.5f;
            final short condicion = 0;
            
            if(base <= condicion || altura <= condicion){
                return -1;
            }

            area_triangulo = division * base * altura;
            return area_triangulo;
        } 
        
        catch (Exception e) {
            return -1;
        }
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_perimetro_cuadrado (float lado_cuadrado){

        try {
            float perimetro_cuadrado = 0;
            final short multiplicacion_for = 4;
            final short condicion = 0;

            if(lado_cuadrado <= condicion){
                return -1;
            }
            
            perimetro_cuadrado = lado_cuadrado * multiplicacion_for;
            return perimetro_cuadrado;
        } 
        
        
        
        catch (Exception e) {
            return -1;
        }
    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_volumen_cilindro (float radio_base, float altura_cilindro){

        try {
            
            final short condicion = 0;
            float volumen_cilindro = 0; 
            final float pi = 3.1415927f;
            final double elevado = 2;
            final double r = (double) radio_base;

            if (radio_base <= condicion || altura_cilindro <= condicion){
                return -1;
            }

            double r2 = Math.pow(r, elevado);

            volumen_cilindro = pi * (float) r2 * altura_cilindro;
            return volumen_cilindro;
            
        } 
        
        catch (Exception e) {
            return -1;
        }
     }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_circulo(float radio_circulo){

        try {
            float area_circulo = 0;
            final short condicion = 0;
            final float pi = 3.1415927f;
            final double elevado = 2;
            final double r = (double) radio_circulo;


            if (radio_circulo <= condicion){
                return -1; 
            }

            double r2 = Math.pow(r, elevado);


            area_circulo = pi * (float) r2; 
            return area_circulo;

        } 
        catch (Exception e) {
            return -1;
        }

     }



}

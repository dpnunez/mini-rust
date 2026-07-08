fn main() {
    let contador: f32;
    let diagnostico: f32;
    
    contador = 5.0;
    diagnostico = 1.0;
    
    while (contador > 0.0) {
        println! contador;
        diagnostico = (diagnostico * 2.0);
        contador = (contador - 1.0);
    };
    
    println! diagnostico;
}
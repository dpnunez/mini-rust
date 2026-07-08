fn main() {
    let v: f32;
    let r: f32;
    let i: f32;
    let limite_seguro: f32;
    
    limite_seguro = 2.5;
    v = read_float();
    r = read_float();
    
    i = calcula_corrente(v, r);
    println! i;
    
    if (i > limite_seguro) {
        println! false; 
    };
}

fn calcula_corrente(tensao: f32, resistencia: f32) -> f32 {
    let corrente: f32;
    corrente = (tensao / resistencia);
    return corrente;
}
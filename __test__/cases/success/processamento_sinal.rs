fn main() {
    let sinal_bruto: f32;
    let limiar_aceitavel: f32;
    let reducao: f32;
    let iteracoes: f32;
    let estavel: bool;
    
    sinal_bruto = read_float();
    limiar_aceitavel = 0.5;
    reducao = 0.8;
    iteracoes = 0.0;
    
    estavel = verifica_estabilidade(sinal_bruto, limiar_aceitavel);
    
    while (estavel == false) {
        sinal_bruto = aplica_filtro(sinal_bruto, reducao);
        iteracoes = (iteracoes + 1.0);
        
        if (sinal_bruto < 1.0) {
            println! true; 
        };
        
        estavel = verifica_estabilidade(sinal_bruto, limiar_aceitavel);
    };
    
    println! sinal_bruto;
    println! iteracoes;
}

fn aplica_filtro(sinal_atual: f32, taxa_reducao: f32) -> f32 {
    let processado: f32;
    processado = (sinal_atual * taxa_reducao);
    return processado;
}

fn verifica_estabilidade(sinal: f32, limiar: f32) -> bool {
    return (sinal < limiar);
}
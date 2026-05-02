fn main () {
  let n : f32;
  let limite : f32;
  let ativo : bool;
  n = read_float();
  limite = 3.0;
  ativo = eh_maior(n, limite);
  if ativo {
    println! n;
  };
  while (n < 10.0) {
    n = atualiza(n);
    println! n;
  };
}

fn eh_maior (a : f32, b : f32) -> bool {
  return (a > b);
}

fn atualiza (valor : f32) -> f32 {
  let novo : f32;
  novo = (valor + 1.0);
  return novo;
}

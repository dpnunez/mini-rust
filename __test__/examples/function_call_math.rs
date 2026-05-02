fn soma (a : f32, b : f32) -> f32 {
  let total : f32;
  total = (a + b);
  return total;
}

fn main () {
  let x : f32;
  let y : f32;
  let resultado : f32;
  x = 10.5;
  y = 2.5;
  resultado = soma(x, y);
  println! resultado;
}

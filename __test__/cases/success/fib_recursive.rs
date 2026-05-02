fn fib (n : f32) -> f32 {
  if (n == 0) {
    return 0;
  };
  if (n == 1) {
    return 1;
  };
  return (fib((n - 1)) + fib((n - 2)));
}

fn main () {
  let entrada : f32;
  let resultado : f32;
  entrada = read_float();
  resultado = fib(entrada);
  println! resultado;
}

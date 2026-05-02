# Analisador Lexico MiniRust 2026

## Compiladores - Analisador Lexico em JavaCC

1. O objetivo do trabalho e implementar um analisador lexico para a linguagem MiniRust usando a ferramenta `javacc`.
2. O aluno deve usar a gramatica da linguagem MiniRust (disponivel em arquivo separado no e-aula) como referencia para os possiveis tokens da linguagem.

Por exemplo, para o seguinte programa escrito em MiniRust:

```rust
fn main ()
{
    let teste : f32;
    teste = 9.0;
    println! teste;
}
```

A saida deve ser algo parecido com:

```text
$ java MiniRust exemplo.rs
Palavra reservada: fn
Palavra reservada: main
Abre parenteses: (
Fecha parenteses: )
Abre chaves: {
Palavra reservada: let
Identificador: teste
Dois pontos: :
Palavra reservada: f32
Ponto e virgula: ;
Identificador: teste
Atribuicao: =
Numero: 9.0
Ponto e virgula: ;
Palavra reservada: println!
Identificador: teste
Ponto e virgula: ;
Fecha chaves: }
```

Alem da implementacao do analisador lexico em `javacc`, o aluno deve tambem fornecer **2 exemplos novos** de programas escritos em MiniRust que utilizem a maioria das construcoes da linguagem.

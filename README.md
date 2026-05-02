# mini-rust

Projeto acadêmico da disciplina de **Projeto de Compiladores**.

Este repositório implementa um analisador para uma linguagem simplificada inspirada em Rust (MiniRust), utilizando JavaCC.

## Entregas

| Entrega | Descrição | Data |
| --- | --- | --- |
| 1 | Analisador Léxico | 14/05/2026 |
| 2 | Analisador Sintático | 14/05/2026 |

## Requisitos

Para executar o projeto na sua máquina, você precisa ter:

- **Java JDK** instalado (recomendado JDK 11 ou superior)
- **JavaCC** instalado e disponível no `PATH` (comando `javacc`)
- Shell compatível com Bash para rodar os scripts da pasta `scripts`

Você pode validar rapidamente com:

```bash
java -version
javac -version
javacc -version
```

## Como rodar

### 1) Gerar e compilar o parser

```bash
./scripts/build-parser.sh
```

Esse script executa:

- `javacc *.jj`
- `javac *.java`

### 2) Executar um exemplo

```bash
./scripts/run-example.sh
```

Por padrão, ele roda o arquivo `__test__/examples/basic.rs`.

Para executar outro arquivo de entrada:

```bash
./scripts/run-example.sh caminho/para/arquivo.rs
```

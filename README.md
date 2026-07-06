# mini-rust

Projeto acadêmico da disciplina de **Projeto de Compiladores**.

Este repositório implementa um analisador para uma linguagem simplificada inspirada em Rust (MiniRust), utilizando JavaCC.

## Entregas

| Entrega | Descrição | Data |
| --- | --- | --- |
| 1 | Analisador Léxico | 14/05/2026 |
| 2 | Analisador Sintático | 14/05/2026 |
| 3 | Compilador para a linguagem MiniRust usando Javacc | 06/07/2026 |

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

### 1) No terminal, navegar ate a pasta que contém os arquivos e depois executar os comandos

```bash
javacc MiniRust.jj
javac *.java ast\*.java
```

### 2) Executar os testes

```bash
java MiniRust __test__\cases\success\NOME_ARQUIVO.rs
```

Por padrão, os arquivos de teste estão na pasta  `__test__/cases/`.

Alguns exemplos de arquivos de entrada:

```bash
java MiniRust __test__\cases\success\area_circulo.rs
java MiniRust __test__\cases\success\analise_circuito.rs
java MiniRust __test__\cases\success\teste_laco_for.rs

java MiniRust __test__\cases\error\erro_laco_for_sem_to.rs
java MiniRust __test__\cases\error\missing_semicolon.rs
```

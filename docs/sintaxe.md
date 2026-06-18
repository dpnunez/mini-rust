# Linguagem Mini Rust, definições léxicas e sintáticas

## Linguagem Mini Rust v 1.0

```text
RUST -> MAIN FUNC?
MAIN -> "fn" "main" "(" ")" "{" VARDECL SEQCOMANDOS "}"
VARDECL -> VARDECL "let" TOKEN_id ":" TIPO ";" | vazio
TIPO -> "f32" | "bool" | "void"
SEQCOMANDOS -> SEQCOMANDOS COMANDO | vazio
COMANDO -> TOKEN_id "=" EXP ";"
        | TOKEN_id "(" LISTAEXP? ")" ";"
        | "if" EXP "{" SEQCOMANDOS "}" ";"
        | "while" EXP "{" SEQCOMANDOS "}" ";"
        | TOKEN_id "=" "read_float" "(" ")" ";"
        | "return" EXP ";"
        | "println!" EXP ";"
EXP -> "(" EXP OP EXP ")" | FATOR
FATOR -> TOKEN_id | TOKEN_id "(" LISTAEXP? ")"
       | TOKEN_numliteral | "true" | "false"
OP -> "+" | "-" | "*" | "/" | "&&" | "||" | "<" | ">" | "=="
LISTAEXP -> EXP | LISTAEXP "," EXP
FUNC -> FUNC "fn" TOKEN_id "(" LISTAARG? ")" "->" TIPO "{" VARDECL SEQCOMANDOS "}"
     | "fn" TOKEN_id "(" LISTAARG? ")" "->" TIPO "{" VARDECL SEQCOMANDOS "}"
LISTAARG -> TOKEN_id ":" TIPO | LISTAARG "," TOKEN_id ":" TIPO
```

## Sintaxe adaptada para parser top-down em JavaCC

A gramática abaixo é equivalente à sintaxe original do trabalho, mas remove
recursões à esquerda e agrupa alternativas que começam com o mesmo símbolo.
Essa forma é mais adequada para implementação em JavaCC.

```text
RUST -> MAIN FUNC*
MAIN -> "fn" "main" "(" ")" "{" VARDECL SEQCOMANDOS "}"
VARDECL -> ("let" TOKEN_id ":" TIPO ";")*
TIPO -> "f32" | "bool" | "void"
SEQCOMANDOS -> COMANDO*
COMANDO -> TOKEN_id ("=" (EXP | "read_float" "(" ")") ";" | "(" LISTAEXP? ")" ";")
        | "if" EXP "{" SEQCOMANDOS "}" ";"
        | "while" EXP "{" SEQCOMANDOS "}" ";"
        | "return" EXP ";"
        | "println!" EXP ";"
EXP -> "(" EXP OP EXP ")" | FATOR
FATOR -> TOKEN_id ("(" LISTAEXP? ")")?
       | TOKEN_numliteral | "true" | "false"
OP -> "+" | "-" | "*" | "/" | "&&" | "||" | "<" | ">" | "=="
LISTAEXP -> EXP ("," EXP)*
FUNC -> "fn" TOKEN_id "(" LISTAARG? ")" "->" TIPO "{" VARDECL SEQCOMANDOS "}"
LISTAARG -> TOKEN_id ":" TIPO ("," TOKEN_id ":" TIPO)*
```

## Convenções léxicas

```text
TOKEN_id -> letra letraoudigito* finalsublinhado*
TOKEN_numliteral -> digitos facao_opcional expoente_opcional
onde:
letra -> [a-zA-Z]
digito -> [0-9]
digitos -> digito+
facao_opcional -> (.digitos)?
expoente_opcional -> (E (+ | -)? digitos)?
letraoudigito -> letra | digito
finalsublinhado -> _letraoudigito+
```

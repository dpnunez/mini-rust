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

#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
EXAMPLE_FILE="${1:-$ROOT_DIR/__test__/examples/basic.rs}"

if [ ! -f "$EXAMPLE_FILE" ]; then
  echo "Arquivo de exemplo nao encontrado: $EXAMPLE_FILE"
  exit 1
fi

printf "\n Recompilando o parser...\n\n\n"
"$ROOT_DIR/scripts/build-parser.sh"
printf "\n\n\n Executando o parser para o arquivo: %s \n\n\n" "$EXAMPLE_FILE"
java -cp "$ROOT_DIR" MiniRust "$EXAMPLE_FILE"

package ast;

import java.util.ArrayList;

public class CWhile extends Comando {
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;

	public CWhile(int linha, Exp exp, ArrayList<Comando> bloco) {
		this.linha = linha;
		this.exp = exp;
		this.bloco = bloco;
	}

	public String toString() {
		String result = "while (" + this.exp.toString() + ") {\n";

		if (this.bloco != null) {
			for (int i = 0; i < this.bloco.size(); i++) {
				result += "\t" + this.bloco.get(i).toString();
			}
		}

		result += "}\n";
		return result;
	}
}
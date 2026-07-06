package ast;

import java.util.ArrayList;

public class Main {

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;

	public Main(ArrayList<VarDecl> vars, ArrayList<Comando> coms) {
		this.vars = vars;
		this.coms = coms;
	}

	public String toString() {
		String result = "\tpublic static void main(String[] args) {\n";

		if (this.vars != null) {
			for (int i = 0; i < this.vars.size(); i++) {
				result += "\t\t" + this.vars.get(i).toString();
			}
		}

		if (this.coms != null) {
			for (int i = 0; i < this.coms.size(); i++) {
				result += "\t\t" + this.coms.get(i).toString();
			}
		}

		result += "\t}\n";
		return result;
	}
}
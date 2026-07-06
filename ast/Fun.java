package ast;

import java.util.ArrayList;

public class Fun {
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;

	public Fun(String nome, ArrayList<ParamFormalFun> params, String retorno, ArrayList<VarDecl> vars,
			ArrayList<Comando> body) {
		this.nome = nome;
		this.params = params;
		this.retorno = retorno;
		this.vars = vars;
		this.body = body;
	}

	public String toString() {
		String javaType = "void";
		if (this.retorno.equals("f32"))
			javaType = "float";
		else if (this.retorno.equals("bool"))
			javaType = "boolean";

		String result = "public static " + javaType + " " + this.nome + "(";

		if (this.params != null) {
			for (int i = 0; i < this.params.size(); i++) {
				result += this.params.get(i).toString();
				if (i < this.params.size() - 1) {
					result += ", ";
				}
			}
		}

		result += ") {\n";

		if (this.vars != null) {
			for (int i = 0; i < this.vars.size(); i++) {
				result += "\t" + this.vars.get(i).toString();
			}
		}

		if (this.body != null) {
			for (int i = 0; i < this.body.size(); i++) {
				result += "\t" + this.body.get(i).toString();
			}
		}

		result += "}\n\n";
		return result;
	}
}
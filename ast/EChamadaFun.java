package ast;

import java.util.ArrayList;

public class EChamadaFun extends Exp {
	public String fun;
	public ArrayList<Exp> args;

	public EChamadaFun(String fun, ArrayList<Exp> args) {
		this.fun = fun;
		this.args = args;
	}

	public String toString() {
		String result = this.fun + "(";

		if (this.args != null) {
			for (int i = 0; i < this.args.size(); i++) {
				result += this.args.get(i).toString();
				if (i < this.args.size() - 1) {
					result += ", ";
				}
			}
		}

		result += ")";
		return result;
	}
}
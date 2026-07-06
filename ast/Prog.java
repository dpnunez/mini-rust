package ast;

import java.util.ArrayList;

public class Prog {
    public Main main;
    public ArrayList<Fun> fun;

    public Prog(Main main, ArrayList<Fun> fun) {
        this.main = main;
        this.fun = fun;
    }

    public String toString() {
        String result = "public class ProgramaGerado {\n\n";

        if (this.main != null) {
            result += this.main.toString();
        }

        if (this.fun != null) {
            for (int i = 0; i < this.fun.size(); i++) {
                result += this.fun.get(i).toString();
            }
        }

        result += "}\n";
        return result;
    }
}
package ast;

import java.util.ArrayList;

public class CFor extends Comando {
    public int linha;
    public String id;
    public Exp exp1;
    public Exp exp2;
    public ArrayList<Comando> bloco;

    public CFor(int linha, String id, Exp exp1, Exp exp2, ArrayList<Comando> bloco) {
        this.linha = linha;
        this.id = id;
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.bloco = bloco;
    }

    public String toString() {
        String result = "for (" + this.id + " = " + this.exp1.toString() + "; " + this.id + " <= "
                + this.exp2.toString() + "; " + this.id + "++) {\n";

        if (this.bloco != null) {
            for (int i = 0; i < this.bloco.size(); i++) {
                result += "\t" + this.bloco.get(i).toString();
            }
        }

        result += "}\n";
        return result;
    }
}
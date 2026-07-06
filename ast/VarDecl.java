package ast;

public class VarDecl {
   public String type;
   public String var;

   public VarDecl(String type, String var) {
      this.type = type;
      this.var = var;
   }

   public String toString() {
      String javaType = "void";
      if (this.type.equals("f32"))
         javaType = "float";
      else if (this.type.equals("bool"))
         javaType = "boolean";

      return javaType + " " + this.var + ";\n";
   }
}
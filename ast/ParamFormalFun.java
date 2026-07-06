package ast;

public class ParamFormalFun {
   public String type;
   public String var;

   // Construtor atualizado para receber (var, type)
   public ParamFormalFun(String var, String type) {
      this.type = type;
      this.var = var;
   }

   public String toString() {
      String javaType = "void";
      if (this.type.equals("f32"))
         javaType = "float";
      else if (this.type.equals("bool"))
         javaType = "boolean";

      return javaType + " " + this.var;
   }
}
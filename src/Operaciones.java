public class Operaciones {
    public int suma(int num1,int num2){
        return num1 + num2;
    }
    public Double suma(Double num1,Double num2){
        return num1 + num2;
    }
    public Float suma(Float num1,Float num2){
        return num1 + num2;
    }




    public int resta(int num1,int num2){
        return num1-num2;
    }
    public Double resta(Double num1,Double num2){
        return num1-num2;
    }
    public Float resta(Float num1,Float num2){
        return num1-num2;
    }




    public int multi(int num1,int num2){
        return num1 * num2;
    }
    public Double multi(Double num1,Double num2){
        return num1 * num2;
    }
    public Float multi(Float num1,Float num2){
        return num1 * num2;
    }




    public int operacion(int num1,int num2){
        if(num2 != 0){
            return num1 / num2;
        }else {
            System.out.println(" La divicion no se puede realizar...");
            System.out.println(" Se encontro una vicion entre 0");
            return 0;
        }
    }
    public Double operacion(Double num1,Double num2){
        if(num2 != 0){
            return num1 / num2;
        }else {
            System.out.println(" La divicion no se puede realizar...");
            System.out.println(" Se encontro una vicion entre 0");
            return 0.0;
        }
    }
    public Float operacion(Float num1,Float num2){
        if(num2 != 0){
            return num1 / num2;
        }else {
            System.out.println(" La divicion no se puede realizar...");
            System.out.println(" Se encontro una vicion entre 0");
            return 0.0F;
        }
    }
}

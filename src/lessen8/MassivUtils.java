package lessen8;

public class MassivUtils {
    public static double[] addMassives(double[] mass1, double[] mass2) {
        double[] result= new double[mass1.length+mass2.length];
        for (int i = 0;i<result.length;i++){
            if (i<mass1.length){
              result[i]=mass1[i];
            }else{
                result[i]=mass2[i-mass1.length];
            }
        }
        return result;

    }
}

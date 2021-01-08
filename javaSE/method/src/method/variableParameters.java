package method;

public class VariableParameters {
    public static void main(String[] args) {
        VariableParameters vp = new VariableParameters();
        System.out.println(vp.sum(10, 1, 12, 131, 13));
    }

    public int sum(int a,int... i){
        int sum =a;
        for(int num:i){
            sum+=num;
        }
        return sum;
    }
}

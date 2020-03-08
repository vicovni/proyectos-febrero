package mx.com.proyecti;

public class Test {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        System.out.println(tip);
        double tax = meal_cost * (tax_percent / 100);
        System.out.println(tax);
        System.out.println(meal_cost+tip+tax);
    }
    
	public static void main(String[] args) {
        int n = 439;
        char[] res = Integer.toBinaryString(n).toCharArray();
        System.out.println(res);
        int count = 0;
        int max = 0;
        for(int i=0; i<res.length;i++){
            if(res[i] == '1') count++;
            else{
                max = count> max? count: max;
                count = 0;
            } 
        }
        max = count> max? count: max;
        System.out.println(max);


	}

}

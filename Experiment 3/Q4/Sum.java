public class Sum{
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 40; i < 250; i++){
            if(i%5 == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum is "+sum);
    }
}
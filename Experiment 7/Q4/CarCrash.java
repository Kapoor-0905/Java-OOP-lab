/*On a single track two vehicles are running. As vehicles are going in same direction there is no problem. If the vehicles are running indifferent direction there is a chance of collision. To avoid collisions write a Java program using exception handling. You are free tomake necessary assumptions */
public class CarCrash {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        try {
            if (a == b) {
                System.out.println("No collision");
            } else {
                throw new Exception("Collision");
            }
        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
        }
    }
}

/*Write a java program to throw an exception for an employee details. If an employee name is a number, a name exception must be thrown. If an employee age is greater than 50, an age exception must be thrown. Or else an object must be created for the entered employee detail */
 class Employee {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        try {
            if (name.matches("[0-9]+")) {
                throw new Exception("Name Exception");
            } else if (age > 50) {
                throw new Exception("Age Exception");
            } else {
                System.out.println("Employee name = " + name);
                System.out.println("Employee age = " + age);
            }
        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
        }
    }
}

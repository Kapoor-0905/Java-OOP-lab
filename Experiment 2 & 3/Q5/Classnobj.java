/*5) Write a program using classes and object in java.*/
class Park{
    boolean parked;
    void yes(){
        parked = true;
        System.out.println("Car is parked");
    }
    void no(){
        parked = false;
        System.out.println("Car is not parked");
    }
}
class Classnobj{
    public static void main(String[] args){
        Park p = new Park();
        p.yes();
        p.no();
    }
}
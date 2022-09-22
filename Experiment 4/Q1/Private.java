/*1)	Write a Java program to show that private member of a super class cannot be accessed from derived classes */

class Private{
    private int l,b;
    void room(int x,int y){
        l=x; b=y;
    }
    int area(){
        return(l*b);
    }
}

class rect extends Private{
    int h;
    rect(int x,int y,int z){
        super(x,y);
        h=z;
    }
    int volume(){
        return(area()*h);
    }
}

class s04_01{
    public static void main(String args[]) {
        rect cr=new rect(10,20,15);
        int a1=cr.area();
        int v1=cr.volume();
        System.out.println("Area of Room : "+a1);
        System.out.println("Volume of Room : "+v1);
    }
}

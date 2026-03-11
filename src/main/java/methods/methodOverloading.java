package methods;

public class methodOverloading {
    public static void main(String[] args) {
        methodOverloading methodOverloading = new methodOverloading();
        methodOverloading.add(10);
        methodOverloading.add("Hello");
        methodOverloading.add(100,200);
        methodOverloading.add(true);
    }

    public void add(String a){
        System.out.println(a);
    }

    public void add(int a){
        System.out.println(a);
    }

    public void add(int a, int b){
        System.out.println(b);
    }

    public void add(boolean a){
        System.out.println(a);
    }

}

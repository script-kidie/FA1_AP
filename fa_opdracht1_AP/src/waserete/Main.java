package waserete;


public class Main {

    public static void main(String [] args) throws Exception {

        Wasmachine wasje1 = new Wasmachine("zwart", "katoen", 50, 1200, 5);
        Persoon p1 = new Persoon("zwart", 200, "Ingrid");
        Persoon p2 = new Persoon("zwart", 200, "Bart");
        Persoon p3 = new Persoon("blauw", 200, "Jan-willem");
        Wascheck wc1 = new Wascheck(p1,wasje1);
        Wascheck wc2 = new Wascheck(p2,wasje1);
        Wascheck wc3 = new Wascheck(p3,wasje1);
    }
}


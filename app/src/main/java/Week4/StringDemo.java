package Week4;

public class StringDemo {
    public static void main(String[] args) {
        String s = null;
        System.out.println(System.identityHashCode(s));
        try {
            abc();
        } catch (Exception e) {
            System.out.println("jksdfjks");
        }
        try {
            bbb();
        } catch (Exception a) {

        }
    }
    static void bbb() throws Exception {
        throw new Exception("asd");
    }
    static void abc(){
        try {
            try {
                int a = 1/0;
            } catch(RuntimeException e) {
                System.out.println("Runtime Error");
                throw new Exception("asd");
            } catch (Exception e) {
                System.out.println("asdasd");
            }
        } catch (Exception a) {
            System.out.println("sadas");
        }
    }
}

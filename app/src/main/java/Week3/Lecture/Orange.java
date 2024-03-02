package Week3.Lecture;

public class Orange {
    public static String getFact(){ return "Vitamin C";}
    private String type;
    Orange() {this.type = "Navel Orange";}
    Orange(String type) { this.type = type;}
    public String getType() {
        return type;
    }
    public static void main(String [] args) {
        System.out.println(Orange.getFact());
        System.out.println(new Orange().getType());
        System.out.println(new Orange("Tangerine").getType());
    }
}

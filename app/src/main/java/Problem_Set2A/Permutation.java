package Problem_Set2A;


import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<String> v;
        Permutation p = new Permutation("hat");
        p.permute();
        v = p.getA();
        System.out.println(v);
    }

    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed

    Permutation(final String str){
        in = str;
        // additional initialization if needed
    }

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively
        if (in.length() > 1) {
            ArrayList<Character> sample = new ArrayList<Character>();
            for(int i = 0; i<in.length(); i++){
                sample.add(in.charAt(i));
            }
            recursive_permute("", sample);
        } else {
            a.add(in);
        }
    }

    void recursive_permute(String parent, ArrayList<Character> s) {
        if(s.size() == 1) {
            a.add(parent + s.get(0));
            return;
        }
        for(Character c: s) {
            ArrayList<Character> currentList = new ArrayList<Character>(s);
            currentList.remove(c);
            recursive_permute(parent + c, currentList);
        }
    }

    public ArrayList<String> getA(){
        return a;
    }
}


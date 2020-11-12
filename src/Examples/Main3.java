package Examples;


import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        boolean fff =false;
        String[] s = args;
        StringBuilder g = new StringBuilder();
        for (String ss : s){
            if (fff){
                g.append(ss);

            }else{
                fff = true;
                g.append(ss);
                g.append(" ");
            }
        }
        System.out.println(g.toString());
       File file = new File(g.toString());

       outT(file);
    }

    public static File outT(File f){
        if (f.isDirectory()){
            String dd = f.getAbsolutePath();
            File[] fileList = f.listFiles();
            for (File ff : fileList){
                outT(ff);
            }
        }else {
            System.out.println(f);
        }
        return null;
    }

}

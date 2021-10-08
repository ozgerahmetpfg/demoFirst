package test;

public class DemoClass {

    public static void main(String[] args) {
        System.out.println("hey there");

        String[] ar1 = new String[5];

        for (int i = 0; i<5; i++){
            String str = "kamil"+ i;

            ar1[i]= str;
        }



        for (String s : ar1){
            System.out.println(s);
        }



    }
}

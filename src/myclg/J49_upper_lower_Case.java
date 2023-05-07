package myclg;

public class J49_upper_lower_Case {
    public static void main(String[] args) {
        String s="abcdef";
        String x="";
        for(int i=0;i<s.length();i++){
//            if(Character.isLowerCase(s.charAt(i))){
            if(i%2==0){
                x+=Character.toUpperCase(s.charAt(i));
            }
            else{
                x+=s.charAt(i);
            }
        }
        System.out.println(x);
    }
}

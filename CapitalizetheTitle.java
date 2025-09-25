public class CapitalizetheTitle {
    public static String capitalizeTitles(String title) {
        String arr[]=title.split(" ");
        int n=arr.length;
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            if(s.length()<=2) sb.append(s.toLowerCase()).append(" ");
            else{
              //  char ch=s.charAt(0).toLowerCase();
                sb.append(s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()).append(" ");
            }
        }
        return sb.toString().trim();
    }


    public static void main(String [] args){
        String title = "First leTTeR of EACH Word";
        String result = capitalizeTitles(title);
        System.out.println(result);
    }
}

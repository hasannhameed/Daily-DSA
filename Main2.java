import java.util.Stack;

class Main2{
    public static void main(String str[]){
        String strr = "2 3 1 * + 9 -";
        String tokens[] = strr.split( " ");
        Stack<Integer> st = new Stack<>(); 
        for(String str1:tokens){
            if(isNumber(str1)){
                st.push(Integer.parseInt(str1));
            }else{
                int number2 = st.pop();
                int number1 = st.pop();
                int result = 0;
               
                switch (str1){
                        case  "-":
                            result = number1 - number2 ;
                            break;
                        case "+":
                            result = number1 + number2;
                            break;
                        case "*":
                            result = number1 * number2;
                            break;
                        case "/":
                            result = number1 / number2;
                            break;
                        case "%":
                            result = number1 % number2;
                            break;
                        default:
                              System.out.println("error");
                        break;
                }
                st.push(result);
            }

        }
        System.out.println(st.pop());
    }
    public static Boolean isNumber(String str1){
        try{
            Integer.parseInt(str1);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
        
    }
}
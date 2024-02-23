package cs207.linear;

public class StringUtils {
    public static boolean checkMatching(String str) throws Exception{
        ArrayBasedStack<Character> stack = new ArrayBasedStack<Character>(str.length());
        for(int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            if(a=='{'||a=='('||a=='['){
                stack.push(a);
            }
            if(a=='}'||a==')'||a==']'){
                if(a=='}'&&stack.pop()!='{'){
                    return false;
                }
                if(a==')'&&stack.pop()!='('){
                    return false;
                }
                if(a==']'&&stack.pop()!='['){
                    return false;
                }
            }
        }
            return stack.isEmpty();
    }
}

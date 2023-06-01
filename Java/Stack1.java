import java.util.*;
public class Stack1
{
    public static void main(String[] args)
    {
        Stack st=new Stack();
        st.push("3");
        st.push("9");
        st.push("7");
        st.push("8");
        st.push("10");
        st.pop();
        st.pop();
        st.pop();
        st.push("7");
        st.push("8");
        st.push("10");
        st.push("12");
        st.pop();
        st.pop();
        System.out.print(st+"\n");
        st.peek();
        System.out.print(st.peek());
        st.size();
        System.out.print("\n"+st.size());
        int position=st.search(9);
        System.out.print("\n"+position); 
}
}
        
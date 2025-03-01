import java.util.ArrayList;

public class StackB{
    static class Stack{
        static ArrayList <Integer> list =new ArrayList<>();
        public static boolean isEmpty(){  //if our static is empty then return true otherwise return false
            return list.size() ==0;
        }

        //push
        public static void push(int data) {
           list.add(data);             //data add in last index of array list
        }

        //pop
        public static int pop(){   //pop datatype give int becouse it store pop value then pop
         if(isEmpty()) {               /// if our stack empty return -1
        return -1;
         }
          int top = list.get(list.size() -1);               //last in indext of array list
          list.remove(list.size()-1);
                    return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()) {               /// if our stack empty return -1
                return -1;
            }
            return list.get(list.size() -1);          
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty())  {  //jab tak loop chale ka tab tak our loop not empty
           System.out.println(s.peek());
            s.pop();
            }
    }
}
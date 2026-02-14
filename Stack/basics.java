import java.util.Stack;

class basics{

    public static void main(String args[]){
        Stack<String> StackName = new Stack<>();

        // Adding element to the stack

        StackName.push("item1");
        StackName.push("item2");
        System.out.println(StackName);

        // LIFO- Last In First Out

        StackName.pop();    //remove the top element item2
        System.out.println(StackName);

        StackName.push("item3");

        System.out.println(StackName.peek());   //identify the top element in the stack
        System.out.println(StackName);

        StackName.pop();  //item 3 is poped
        StackName.pop();  //item 1 is poped

        boolean CheckIsempty=StackName.isEmpty();  //isempty returns the boolean
        System.out.println(CheckIsempty);

        //Search the index of the element in the stack
        
        StackName.add("item1");
        StackName.add("item2");
        StackName.add("item3");
        StackName.add("item4");
        System.out.println(StackName);
        System.out.println(StackName.search("item3")); //Search


    }
}
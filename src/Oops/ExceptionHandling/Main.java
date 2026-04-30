package Oops.ExceptionHandling;

public class Main {
    public static void main(String[] args) throws MyOwnException {
        int a = 5;
        int b = 0;

        try {
            div(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        finally {
            System.out.println("It will run always");
        }

        // Custom exception

        String name = null;
        try {
            name = "Mani";
            if (name.equals("Mani")) {
                throw new MyOwnException("Name shouldn't be Mani");
            }
        } catch ( MyOwnException  e) {
            System.out.println(e.getMessage());
        }

    }
    static int div(int a, int b) throws ArithmeticException {

        if(b==0){
            throw new ArithmeticException("Arithmetic Exception");
        }
        return a/b;
    }
}

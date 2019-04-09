package first;

public class Exp {

    private Float obj = null;

    public void Excep(String S) throws MyException {
        try{
            this.obj = Float.parseFloat(S);
            System.out.println("Float number from String: " + obj);
        }
        catch(NumberFormatException e){
            throw new MyException("The string does not contain a parsable number.", e);
        }
        catch(NullPointerException e){
            throw new MyException("The string is null.", e);
        }
    }
}

public interface MyIF{
    int getNumber();
    default String getString(){
        return "Shree Prasad";
    }
}
class MyIFImp implements MyIF{
    public int getNumber(){
        return 22050;
    }
}
class DefaultMethod{
    public static void main(String args[]){

        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());        
    }
}

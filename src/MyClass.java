public class MyClass {
    enum myChar {
        A,
        B
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.switchCheckEnum();
    }

    public void forEachLoopCheck(){
        String[] myArray = {"a","b","c"};

        for(String str: myArray)
        {
            System.out.println(str);
            if(str.equalsIgnoreCase("b")){
                break;
            }
        }
    }

    public void whileLoop(){
        int i = 5;
        while (i>0)
        {
            System.out.println("i is "+i);
            i--;
            if(i == 2){
                break;
            }
        }
    }

    public void switchCheck(){
        String str = "e";

        switch (str){
            case "a":
                System.out.println(str);
                break;
            case "b":
                System.out.println(str);
                break;
            default:
                System.out.println(str);
        }
    }

    public void switchCheckEnum(){
        myChar nowChar = myChar.A;

        switch (nowChar){
            case A:
                System.out.println(nowChar);
                break;
            case B:
                System.out.println(nowChar);
                break;
        }
    }
}

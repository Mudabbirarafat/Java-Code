import java.util.Scanner;
class FIRSTPROGRAM
{
    public static void main(String[] args) 
    {
        System.out.println("hello world");
        {
            int a = 10;
            System.out.println(a);
        }
    }
    
}
class Hero
{
    public static void main(String[] args) 
    {
        System.out.println("HELLO NIET");
        System.out.println("NAME: MUDABBIR" +"ARAFAT");
        System.out.println("ID: 2201331530119");
    }
}
class datatypes
{
    public static void main(String[] args) 
    {
        System.out.println("datatypes:");
        int num=123;
        float floatvar=12.45f;
        short shortvar=234;
        String str="LUCKNOW";
        char ch='N';
        long longvar=123456;
        byte bytevar=12;
        double doublevar=1234.23456;

        System.out.println("integer: "+num);
        System.out.println("float: "+floatvar);
        System.out.println("short: "+shortvar);
        System.out.println("string: "+str);
        System.out.println("char: "+ch);
        System.out.println("long: "+longvar);
        System.out.println("byte: "+bytevar);
        System.out.println("double: "+doublevar);
    }
}
class operator
{
    public static void main(String[] args) 
    {
        System.out.println("Arithmetic: ");
        System.out.println(2+3);
        System.out.println(5-3);
        System.out.println(3*5);
        System.out.println(5/2);
        System.out.println(1245%23);

        System.out.println("relational: ");
        System.out.println(2>4);
        System.out.println(2<5);

        System.out.println("logical:");
        System.out.println(2>6 && 4<6);
        System.out.println(true && false);
        System.out.println(true && false);
        int a=12;
        int b=2;
        System.out.println(++a + b++ - --a + b-- + a);
        
        System.out.println("tarnary operator: ");
        int max=21;
        int low=3;
        System.out.println(max<low? true : false);
        
        

    }
}
class DecisionMaking
{
    public static void main(String[] args)
    {
        int n=5;
        if (n==0)
        {
            System.out.println("Zero");
        }    
        else if (n==1)
        {
            System.out.println("One");
        }
        else if (n==2)
        {
            System.out.println("Two");
        }
        else
        {
           
            System.out.println("null");
        }  
    }  
}
class favorite
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = sc.nextInt();
        if (n==1)
        {
            System.out.println("I love Java");
        }
        else if (n==2)
        {
            System.out.println("I love C++");
        }
        else if (n==3)
        {
            System.out.println("I love Python");
        }
        else 
        {
            System.out.println("I love kotlin");
        }

    }
}
class switchcase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
//class maxvalue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.1 : ");
        int a = scanner.nextInt();
        System.out.println("Enter the no.2 : ");
        int b = scanner.nextInt()
        System.out.println("Enter the no.3 : ");
        int c = scanner.nextInt();
        int max = a>b?a:b;
        int res = (max>c)? max:c;





    }
}
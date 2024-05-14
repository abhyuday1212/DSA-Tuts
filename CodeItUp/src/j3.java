
import java.io.*;

class j3{
    public static void main(String[] args)throws IOException
    {
int a,b,sum;
// BufferedReader object_name = new BufferedReader(new InputStreamReader(System.in));
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedReader class ka object bna rhe hai 

System.out.println("Enter first Number");
a= Integer.parseInt(br.readLine());
System.out.println("Enter second Number : ");
b= Integer.parseInt(br.readLine());

sum = a+b;
System.out.println("Addition = "+sum);



    }
}




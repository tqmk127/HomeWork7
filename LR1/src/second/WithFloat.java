package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithFloat
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Введіть загальну відстань(в км.):");
        float S = Float.parseFloat(reader.readLine());// Відстань, яку човен пройшов туди і назад

        System.out.println("Введіть швидкість човна(в км/год):");
        float V = Float.parseFloat(reader.readLine());// Швидкість човна

        System.out.println("Введіть швидкість течії(в км/год):");
        float U = Float.parseFloat(reader.readLine());//Швидкість течії

        float v1=V+U;// Швидкість човна, який пливе за течією
        float v2=V-U;// Швидкість човна, який пливе проти течії

        // Середня швидкість човна
        float Vs= (v1+v2)/2;
        System.out.println("=== Середня швидкість човна: " + Vs + " км/год ===");

        float s1=S/2;// Шлях, який човен пройшов за течією(туди) і проти течії(назад)

        float t1=s1/v1;//  Час,за який човен пройшов шлях за течією
        float t2= s1/v2;//  Час,за який човен пройшов шлях проти течії
        float t=t1+t2;// Час, за який човен пройшов саме загальну відстань
        System.out.println("=== Час, за який човен пройшов загальну відстань: " + t + " год. ===");
    }
}

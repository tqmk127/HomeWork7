public class Main {
    public static void main(String[] args) {
        Rocket rocket1;//створення об'єкта

        Research rocket2 = new Research("V3PO", 9.1, 3000,3,
                32,1, 13);//визнаяення об'єкта

        Satellite rocket3 = new Satellite("Explorer 1", 5.2, 5000,0,
                16,"21.01.19");//визначення об'єкта

        rocket1=rocket2;; //встановлення посилання на об'єкт rocket2
        rocket1.printInfo();//виклик методу printInfo() із класу Research

        System.out.println("------------------------------------------------------------");

        rocket1=rocket3;//встановлення посилання на об'єкт rocket2
        rocket1.printInfo();//виклик методу printInfo() із класу Satellite
    }
}

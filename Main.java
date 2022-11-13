public class Main {
    public static void main(String[] args) {

        double[] myList = {0.13, 0.24, 0.41};
        double total = 0;
        double büyüksayi = myList[0];


        for (double number : myList){
            if (büyüksayi<number){
                büyüksayi = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam Tutar : " + total);
        System.out.println("En Büyük Sayı : " + büyüksayi);
    }
}
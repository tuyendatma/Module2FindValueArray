import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] flower ={"LAN","Hong","Hue","Dao","Cuc","Xuyen Chi"};
        System.out.println("nhap ten loai hoa ban muon tim:");
        String yourFlower = scanner.nextLine();


        for (int i = 0; i <flower.length ; i++) {
            if(flower[i].equals(yourFlower)){
                //khi so sanh chuoi khong dung ==
                System.out.println("vi tri: "+i);
                break;
            }else {
                System.out.println("khong co trong mang");
            }
        }
    }
}

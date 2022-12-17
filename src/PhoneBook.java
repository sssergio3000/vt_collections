import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {


    public static void main(String[] args) {
        String name;
        Long phoneNum;
        HashMap<Long, String> pb = new HashMap<>();
        Scanner scNumber = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name: ");
            name = scString.nextLine();
            System.out.println("Enter Phone Number: ");
            phoneNum = scNumber.nextLong();
            PhoneBook.add(pb, phoneNum, name);
            System.out.println(PhoneBook.get(pb, "Serg"));;



        }
//        System.out.println(pb);


    }

    static public void add(HashMap parPb, Long parPhoneNum, String parName) {
        parPb.put(parPhoneNum, parName);


    }

    static public HashMap get(HashMap parPb, String parName) {
        System.out.println(parPb);
        HashMap<Long, String> outPutHM = new HashMap<>();
        for (Map.Entry<Long, String> elem : parPb.entrySet()) {
            if (elem.getValue().equals(parName)) {
                outPutHM.put(elem.getKey(), elem.getValue());

            }


        }
        return outPutHM;
    }
}

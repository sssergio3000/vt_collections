import java.util.*;

public class ListTraining {
    public static void main(String[] args) {
        String[] list = new String[]{"Serg", "Kate",
                "John", "Valery", "Serg", "Friede", "Karina", "Alex", "Raffi",
                "Andrew", "Karina", "Karina"};
        Set<String> listSet = new HashSet<>(Arrays.asList(list));
        Map<String, Integer> map = new HashMap<>();
        Iterator iter = listSet.iterator();
        int count;
        String str;
        while (iter.hasNext()) {
            count = 0;
            str = (String) iter.next();
            for (int i = 0; i < list.length; i++) {

                if (str.equals(list[i])) {
                    count++;
                }
                map.put(str, count);

            }

        }
        System.out.println(map);

        for (Map.Entry<String, Integer> elem : map.entrySet()) {
            System.out.println(elem.getKey() + ": " + elem.getValue());

        }


    }
}


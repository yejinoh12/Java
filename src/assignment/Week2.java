package assignment;

import java.util.*;

public class Week2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String dataStructure = in.nextLine();
        String cookName = in.nextLine();

        if (dataStructure.equals("List")) {

            List<String> listRecipe = new ArrayList<String>();

            //입력
            for (int i = 0; ; i++) {
                listRecipe.add(in.nextLine());
                if (listRecipe.get(i).equals("끝")) {
                    listRecipe.remove(i);
                    break;
                }
            }

            //출력
            System.out.println("[" + dataStructure + " 으로 저장된 " + cookName + "]");

            int i = 0;
            for(String str : listRecipe) {
                System.out.println(++i + ". " + str);
            }

        } else if (dataStructure.equals("Set")) {

            Set<String > setRecipe = new HashSet<String>();

            //입력
            for (int i = 0; ; i++) {
                setRecipe.add(in.nextLine());
                if (setRecipe.contains("끝")) {
                    setRecipe.remove("끝");
                    break;
                }
            }

            //출력
            System.out.println("[" + dataStructure + " 으로 저장된 " + cookName + "]");

            Iterator<String> iterator = setRecipe.iterator();
            for(int i = 0; iterator.hasNext(); i++) {
                System.out.println(i + 1 + ". " + iterator.next());
            }

        } else if (dataStructure.equals("Map")) {

            Map<Long, String> mapRecipe = new HashMap<>();

            //입력
            for (int i = 0; ; i++) {
                String str = in.nextLine();
                Long key = (long) i;
                mapRecipe.put(key, str);
                if(mapRecipe.get(key).equals("끝")) {
                    mapRecipe.remove(key);
                    break;
                }
            }

            //출력
            System.out.println("[" + dataStructure + " 으로 저장된 " + cookName + "]");

           int i = 0;
            for(String str : mapRecipe.values()){
                System.out.println(++i + ". " + str);
            }
        }
    }
}

import java.util.*;

public class CollectionExample {
           public static void main(String[] args) {
            List<String> arrayList = new ArrayList<String>();
            arrayList.add("PHP");
            arrayList.add("Python");
            arrayList.add("Java");
            arrayList.add("C++");
            System.out.println("Các phần tử của ArrayList");
            System.out.print("\t" + arrayList + "\n");
               // Show list through Iterator
               Iterator<String> itr = arrayList.iterator();
               while (itr.hasNext()) {
                   System.out.print(itr.next() + ", ");
               }
               // Show list through for-each
               System.out.println();
               for (String obj : arrayList) {
                   System.out.print(obj + ", ");
               }
               // Show list through index
               System.out.println();
               int size = arrayList.size();
               for (int i = 0; i < size; i++) {
                   System.out.print(arrayList.get(i) + ", ");
               }

//            List<String> linkedList = new LinkedList<String>();
//            linkedList.add("PHP");
//            linkedList.add("Python");
//            linkedList.add("Java");
//            linkedList.add("C++");
//            System.out.println("Các phần tử của LinkedList");
//            System.out.print("\t" + linkedList + "\n");

            // new TreeSet() sẽ sắp xếp các phần tử
//            Set<String> hashSet = new HashSet<String>();
//            hashSet.add("PHP");
//            hashSet.add("Python");
//            hashSet.add("Java");
//            hashSet.add("Java");
//            hashSet.add("C++");
//            System.out.println("Các phần tử của Set");
//            System.out.print("\t" + hashSet + "\n");
//               // Show set through Iterator
//               Iterator<String> iterator = hashSet.iterator();
//               while (iterator.hasNext()) {
//                   System.out.print(iterator.next() + ", ");
//               }
//               // Show set through for-each
//               System.out.println();
//               for (String obj : hashSet) {
//                   System.out.print(obj + ", ");
//               }

            // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
//            Map<String, String> hashMap = new HashMap<String, String>();
//            hashMap.put("Windows", "2000");
//            hashMap.put("Windows", "XP");
//            hashMap.put("Language2", "Java");
//            hashMap.put("Language1", ".Net");
//            System.out.println("Các phần tử của Map");
//            System.out.print("\t" + hashMap);
        }
    }

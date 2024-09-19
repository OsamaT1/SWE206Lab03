import java.util.ArrayList;

public class StudentReader {
    public static void main (String[] args) {
        System.out.println("Print the list of students");
        createRandom();
    }
    public static void createRandom() {
        System.out.println("Create the list of students");
    }

        public void method(ArrayList<String> list){

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
    }
}

public ArrayList<String> createRandomStudents(){
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Osama");
    arrayList.add("tarek");
    arrayList.add("Abdulaziz");
    return arrayList;
}

}

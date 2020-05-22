import java.util.*;

public class MapSchool {
    private static Map<String,Integer> sumGrade = new HashMap<>();
    public static void main(String[] args) {
        Map<String,Integer> absente = new HashMap<>();
        absente.put("Anca",7);
        absente.put("Daniel",3);
        absente.put("Andreea",1);
        absente.put("Doru",0);
        Set<String> list = absente.keySet();
        for (String nume: list){
            System.out.println(nume + " are " + absente.get(nume) + " absent.");
        }
        Map<String, ArrayList<Integer>> noteExamen = new HashMap<>();
        ArrayList<Integer> noteAnca = new ArrayList<>();
        noteAnca.add(10);
        noteAnca.add(8);
        noteAnca.add(4);
        noteExamen.put("Anca",noteAnca);

        ArrayList<Integer> noteDaniel = new ArrayList<>();
        noteDaniel.add(9);
        noteDaniel.add(9);
        noteExamen.put("Daniel", noteDaniel);
        //add a grade to dan
        ArrayList<Integer> noteDanielNew = noteExamen.get("Daniel");
        noteDanielNew.add(5);
        noteExamen.put("Daniel",noteDanielNew);
        System.out.println("========================");
        for (String note: noteExamen.keySet()){
            System.out.println(note + " are " + noteExamen.get(note) + "!");
        }
        System.out.println("===================");
        addNote("Anca",8);
        addNote("Anca",5);
        addNote("Dani",7);
        System.out.println(sumGrade.get("Anca"));
        System.out.println(sumGrade.get("Daniel"));


    }
    public static void addNote(String nume, Integer nota){
        if (sumGrade.containsKey(nume)) {
            Integer sumVeche = sumGrade.get(nume);
            sumGrade.put(nume, sumVeche + nota);
        }else {
            sumGrade.put(nume, nota);
        }
    }
}

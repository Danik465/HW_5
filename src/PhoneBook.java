import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PhoneBook {

    // TODO: 20.12.2022 Подумать и поменять generic-type для этой Map
    private final Map<String , List<String >> storage = new HashMap<>();


    public void add(String surname, String phonenumber) {
        // TODO: 20.12.2022 Реализовать
        List<String> list = new ArrayList<>();
        list.add(phonenumber);
        if(!storage.containsKey(surname)){
            storage.put(surname, list);
        }else {
            storage.get(surname).add(phonenumber);
        }

    }

    public List<String >  getBySurname(String surname) {
        // TODO: 20.12.2022 Реализовать
        List<String> list = new ArrayList<>();

        for (int i = 0; i < storage.get(surname).size(); i++) {
            list.add(storage.get(surname).get(i));
        }

        return list;
    }
    public  void FillMap(){
        for (String key : storage.keySet()){
            System.out.println(key + " = " + storage.get(key));
        }
    }

}
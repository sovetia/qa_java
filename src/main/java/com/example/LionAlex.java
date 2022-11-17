package com.example;
import java.util.List;

public class LionAlex extends Lion {

    public LionAlex(Feline feline) throws Exception {
        super(feline, "Самец");
    }

    public List<String> getFriends() {
        List<String> friendsList = List.of("Марти", "Глория", "Мелман");
        return friendsList;
    }
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}

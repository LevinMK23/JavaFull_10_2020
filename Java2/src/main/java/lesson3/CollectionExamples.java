package lesson3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class CollectionExamples {

    public static Collection<String> getNames(String path) {
        Scanner in = new Scanner(
                CollectionExamples.class.getResourceAsStream(path));
        List<String> list = new ArrayList<>();
        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<>();
        while (in.hasNextLine()) {
            String[] data = in.nextLine().split(",");
            for (String el : data) {
                list.add(el);
                treeSet.add(el);
                hashSet.add(el);
            }
        }
        return treeSet;
    }

    // a b c a b c
    // a : 2, b : 2, c : 2
    public static Map<String, Integer> getWordsCount(String path) {
        TreeMap<String, Integer> map = new TreeMap<>();
        Map<String, Map<String, Set<Long>>> map1 = new HashMap<>();
        map1.putIfAbsent("key", new HashMap<>());
        map1.get("key").put("key1", new TreeSet<>());
        map1.get("key").put("key2", new TreeSet<>());
        map1.get("key").get("key1").add(500L);
        map1.get("key").get("key1").add(501L);
        map1.get("key").get("key1").add(502L);
        map1.get("key").get("key2").add(500L);
        map1.get("key").get("key2").add(501L);
        map1.get("key").get("key2").add(502L);
        map1.putIfAbsent("key4", new HashMap<>());
        map1.get("key4").put("key1", new TreeSet<>());
        map1.get("key4").put("key2", new TreeSet<>());
        map1.get("key4").get("key1").add(500L);
        map1.get("key4").get("key1").add(501L);
        map1.get("key4").get("key1").add(502L);
        map1.get("key4").get("key2").add(500L);
        map1.get("key4").get("key2").add(501L);
        map1.get("key4").get("key2").add(502L);
        System.out.println(map1);
        Scanner in = new Scanner(
                CollectionExamples.class.getResourceAsStream(path));
        while (in.hasNextLine()) {
            String[] data = in.nextLine().split(",");
            for (String key : data) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        return map;
    }

//    public static Map<String, String> loadDictionary(String path) {
//        TreeMap<String, String> map = new TreeMap<>();
//        Scanner in = new Scanner(
//                CollectionExamples.class.getResourceAsStream(path), Charset.forName("windows-1251"));
//        while (in.hasNextLine()) {
//            String eng = in.nextLine().replaceAll("a ", "");
//            try {
//                String ru = in.nextLine().split(" +")[0];
//                map.put(eng, ru);
//                map.put(ru, eng);
//            } catch (Exception ignored) {
//            }
//        }
//        return map;
//    }


    public static void main(String[] args) {
//        var map = loadDictionary("ENRUS.txt");
//        System.out.println(map.get("are"));
//        System.out.println(map.get("you"));
//        System.out.println(map.get("live"));
//        System.out.println(map.get("here"));
        System.out.println(getWordsCount("names.csv"));
//
//        for (var mapEntry : getWordsCount("names.csv").entrySet()) {
//            System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
//        }
//        System.out.println("************************");
//        getWordsCount("names.csv").forEach((key, val) -> {
//            System.out.println(key + " - " + val);
//        });
    }
}

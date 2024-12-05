import java.util.HashMap;

public class PositionMapper {
    public static HashMap<String, Integer> positionMap = initHash();

    private static HashMap<String, Integer> initHash() {
        HashMap<String, Integer> map = new HashMap<>(); //TODO make into enum
        map.put(Positions.a1, 1);
        map.put(Positions.a2, 2);
        map.put(Positions.a3, 3);
        map.put(Positions.a4, 4);
        map.put(Positions.a5, 5);
        map.put(Positions.a6, 6);
        map.put(Positions.a7, 7);
        map.put(Positions.a8, 8);
        map.put(Positions.b1, 9);
        map.put(Positions.b2, 10);
        map.put(Positions.b3, 11);
        map.put(Positions.b4, 12);
        map.put(Positions.b5, 13);
        map.put(Positions.b6, 14);
        map.put(Positions.b7, 15);
        map.put(Positions.b8, 16);
        map.put(Positions.c1, 17);
        map.put(Positions.c2, 18);
        map.put(Positions.c3, 19);
        map.put(Positions.c4, 20);
        map.put(Positions.c5, 21);
        map.put(Positions.c6, 22);
        map.put(Positions.c7, 23);
        map.put(Positions.c8, 24);
        map.put(Positions.d1, 25);
        map.put(Positions.d2, 26);
        map.put(Positions.d3, 27);
        map.put(Positions.d4, 28);
        map.put(Positions.d5, 29);
        map.put(Positions.d6, 30);
        map.put(Positions.d7, 31);
        map.put(Positions.d8, 32);
        map.put(Positions.e1, 33);
        map.put(Positions.e2, 34);
        map.put(Positions.e3, 35);
        map.put(Positions.e4, 36);
        map.put(Positions.e5, 37);
        map.put(Positions.e6, 38);
        map.put(Positions.e7, 39);
        map.put(Positions.e8, 40);
        map.put(Positions.f1, 41);
        map.put(Positions.f2, 42);
        map.put(Positions.f3, 43);
        map.put(Positions.f4, 44);
        map.put(Positions.f5, 45);
        map.put(Positions.f6, 46);
        map.put(Positions.f7, 47);
        map.put(Positions.f8, 48);
        map.put(Positions.g1, 49);
        map.put(Positions.g2, 50);
        map.put(Positions.g3, 51);
        map.put(Positions.g4, 52);
        map.put(Positions.g5, 53);
        map.put(Positions.g6, 54);
        map.put(Positions.g7, 55);
        map.put(Positions.g8, 56);
        map.put(Positions.h1, 57);
        map.put(Positions.h2, 58);
        map.put(Positions.h3, 59);
        map.put(Positions.h4, 60);
        map.put(Positions.h5, 61);
        map.put(Positions.h6, 62);
        map.put(Positions.h7, 63);
        map.put(Positions.h8, 64);
        return map;
    }

    public static int getPositionIndex(String position) {
//        validatePosition(position);
        return positionMap.get(position);
    }

    private boolean validatePosition(String position) {
        //TODO
        return false;
    }
}

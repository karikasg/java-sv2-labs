package algorithmsmax;

public class Plane {

    public static void main(String[] args) {
        Plane plane = new Plane();
        String map = "10000000111110000000000001111111111000010000010000100000111111110000101000000000111110000000000000000100000001000000000000111111000000000100000000000011";
        System.out.println(plane.getLongestOcean(map));
        map = "10000000111110000000000001111111111000010000010000100000111111110000101000000000111110000000010000000100000001000000000000111111000000000100000000000011";
        System.out.println(plane.getLongestOcean(map));
        map = "10101010101010101001010101010101";
        System.out.println(plane.getLongestOcean(map));
        map = "111111111111111111111111";
        System.out.println(plane.getLongestOcean(map));

    }

    public int getLongestOcean(String map){
        int i = 1;
        int maxOcean = 0;
        int ocean;
        while (i<map.length()) {
            if (map.charAt(i-1) == '1' && map.charAt(i) == '0') {
                ocean = 0;
                while (map.charAt(i) == '0') {
                    ocean++;
                    i++;
                }
                if (ocean > maxOcean) {
                    maxOcean = ocean;
                }
            }
            i++;
        }
        return maxOcean;
    }
}

public class Lasagna {
    int oven = 40;
    public int expectedMinutesInOven() {
        return oven;
    }
    public int remainingMinutesInOven(int remaining) {
        int ans = expectedMinutesInOven() - remaining;
        return ans;
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int min) {
        return preparationTimeInMinutes(layers) + min;
    }
}
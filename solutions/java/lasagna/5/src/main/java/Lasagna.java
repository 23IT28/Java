public class Lasagna {
    int oven = 40;
    public int expectedMinutesInOven(){
        return oven;
    }
    public int remainingMinutesInOven(int remaning){
        int ans = expectedMinutesInOven() - remaning;
        return ans;
    }
    public int preparationTimeInMinutes(int layers){
        int sum = layers * 2;
        return sum;
    }
    public int totalTimeInMinutes(int layer, int min){
        int mul = layer * 2;
        int result = mul + min;
        return result;
    }

}

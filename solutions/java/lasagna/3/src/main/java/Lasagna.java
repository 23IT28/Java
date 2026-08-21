public class Lasagna {
    int oven = 40;
    public int expectedMinutesInOven(){
        return oven;
    }
    public int remainingMinutesInOven(int remaning){
        int ans = oven - remaning;
        return ans;
    }
    public int preparationTimeInMinutes(int layers){
        int sum = layers * 2;
        return sum;
    }
    public int totalTimeInMinutes(int layers, int min){
        int mul = layers * 2;
        int result = mul + min;
        return result;
    }

    public static void main(String[] args){
        Lasagna l = new Lasagna();
        System.out.println(l.expectedMinutesInOven());
        System.out.println(l.remainingMinutesInOven(30));
        System.out.println(l.remainingMinutesInOven(25));
        System.out.println(l.preparationTimeInMinutes(2));
        System.out.println(l.totalTimeInMinutes(3, 20));
    }
}

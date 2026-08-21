public class Lasagna {
    int oven = 40;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        // oven = 40;
        return oven;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int remaning){
        int ans = oven - remaning;
        return ans;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int sum = layers * 2;
        return sum;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int min){
        int mul = layers * 2;
        int result = mul + min;
        return result;
    }

    public static void main(String[] args){
        Lasagna l = new Lasagna();
        l.expectedMinutesInOven();
        l.remainingMinutesInOven(30);
        l.remainingMinutesInOven(25);
        l.preparationTimeInMinutes(2);
        l.totalTimeInMinutes(3, 20);
    }
}

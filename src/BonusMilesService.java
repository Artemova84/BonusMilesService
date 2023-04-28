public class BonusMilesService {

    public int calculate(int price) {

        int mile = price * 5 / 100;

        return mile;
    }
}
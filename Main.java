public class Main{
    public static void main(String[] args){
        Game one = new Game();
        System.out.println(one.getLevel(3));
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).setPoints(500);
        System.out.println(one.getScore());
    }
}
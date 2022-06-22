package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        linkToFirst = 15;
        linkToSecond = 6;
        linkToThird = 4;
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
        
    }
}

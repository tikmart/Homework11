public class AverageAge {
    public static void main(String[] args) {
        Person p1 = new Person("Grig", 53);
        Person p2 = new Person("Artur", 45);
        Person p3 = new Person("Areg", 67);
        Person p4 = new Person("Karen", 42);
        Person p5 = new Person("Davit", 26);
        Person p6 = new Person("Roman", 54);
        Person p7 = new Person("Hovhannes",42);
        Person p8 = new Person("Hayk", 32);

        Person [] group1 = {p1,p2,p3};
        Person [] group2 = {p4,p5,p6,p7,p8};

        averageChecker(group1,group2);

    }

    static void averageChecker(Person[] group1, Person[] group2){
        int sum1 = 0;
        int sum2 = 0;

        for (Person p : group1){
            sum1 += p.age;
        }

        for (Person p : group2){
            sum1 += p.age;
        }

        int avg1 = sum1 / group1.length;
        int avg2 = sum2 / group2.length;


        if (avg1 > avg2){
            System.out.println("Group1 is older than Group2");
        }else if (avg1 == avg2)
            System.out.println("Same age");
        else
            System.out.println("Group2 is older than group1");
    }
}

public class GiveRoles {
    public static void main(String[] args) {
        Person p1 = new Person("Grig", 26);
        Person p2 = new Person("Artur", 25);
        Person p3 = new Person("Areg", 27);
        Person p4 = new Person("Karen", 22);
        Person p5 = new Person("Davit", 24);
        Person p6 = new Person("Roman", 22);


        checkAge(p1,p2,p3,p4,p5,p6);
    }

    static void checkAge(Person ... arr){
        Person oldest = arr[0];
        Person youngest = arr[0];

        for(Person p : arr){
            if (oldest.age < p.age)
                oldest = p;
            else if (youngest.age > p.age) {
                youngest = p;
            }
        }

        youngest.role = "Junior";
        oldest.role = "Senior";


        System.out.println("The " + oldest.role + " in the group is " + oldest.name + " " +oldest.age + " years old");
        System.out.println("The " + youngest.role + " in the group is " + youngest.name + " " + youngest.age + " years old");

    }
}

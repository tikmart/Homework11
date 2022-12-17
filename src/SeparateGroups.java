public class SeparateGroups {
    public static void main(String[] args) {
        Person p1 = new Person("Grig", 26);
        Person p2 = new Person("Artur", 25);
        Person p3 = new Person("Areg", 27);
        Person p4 = new Person("Karen", 22);
        Person p5 = new Person("Davit", 24);
        Person p6 = new Person("Roman", 22);

        separateAdults(p1,p2,p3,p4,p5,p6);


    }



    static void separateAdults(Person ... arr) {
        int adults = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].age >= 18)
                adults++;
        }

        if (adults == 0) {
            System.out.println("There are only underage people in this group");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].name + " " + arr[i].age);
            }
        } else if (adults == arr.length) {
            System.out.println("There are only adults in the group");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].name + " " + arr[i].age + " ");
            }
        } else {
            Person[] adultGroup = new Person[adults];
            Person[] underAge = new Person[arr.length - adults];

            int j = 0; //index for adultGroup
            int k = 0; //index for underage
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].age >= 18)
                    adultGroup[j++] = arr[i];
                else
                    underAge[k++] = arr[i];
            }


            System.out.println("Adults group: ");
            for (Person p : adultGroup){
                System.out.println(p.name + " " + p.age);
            }

            System.out.println("Underage group: ");
            for (Person p : underAge){
                System.out.println(p.name + " " + p.age);
            }
        }



    }
}
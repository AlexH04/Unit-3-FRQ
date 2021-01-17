public class Q1 {
    public static void main(String[] args) {
        boolean rsvp = false;
        int selection = 0;
        String option1, option2 = null;
        //a
        if (rsvp) {
            System.out.println("attending");
        } else {
            System.out.println("not attending");
        }
        //b
        switch(selection) {
            case 1:
                System.out.println("beef");
                break;
            case 2:
                System.out.println("chicken");
                break;
            case 3:
                System.out.println("pasta");
                break;
            default:
                System.out.println("fish");
                break;
        }
        //c
        if (rsvp) {
            switch(selection) {
                case 1:
                    option1 = "Thanks for attending. You will be served beef.";
                    break;
                case 2:
                    option1 = "Thanks for attending. You will be served chicken.";
                    break;
                case 3:
                    option1 = "Thanks for attending. You will be served pasta.";
                    break;
                default:
                    option1 = "Thanks for attending. You will be served fish.";
                    break;
            }
        } else {
            option1 = "Sorry you can't make it.";
        }
        //d
        System.out.println(option1.equals(option2));
    }
}

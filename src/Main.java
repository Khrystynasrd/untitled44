public class Main {
        public static void main(String[] args) {
            int d = 28;
            int b = 101;
            int k = 43;
            if (d<b && d>k) {
                System.out.println("Число " + d + " міститься в проміжку (50;100)");
            } else{
                System.out.println("Число " + d + " не міститься в проміжку (50;100)");
            }

            int p =993 ;
            int f = p%10;
            int w = (p/10)%10;
            int e = p/100;
            if (f<w && w>e){
                System.out.println("Найбільше число = " + w);
            } else if (w<f && f>e) {
                System.out.println("Найбільше число = " + f);
            } else if (f<e && e>w) {
                System.out.println("Найбільше число = " + e);
            } else if (f==w && f>e) {
                System.out.println("Найбільше число = " + f);
            } else if (f==e && f>w) {
                System.out.println("Найбільше число = " + f);
            } else if (w==e && w>f) {
                System.out.println("Найбільше число = " + w);
            }


            String direction = "До низу";
            int floor = 3;
            if (direction=="До гори" && floor==1){
                System.out.println("Ви піднялись на 1 поверх");
            } else if (direction=="До гори" && floor==2) {
                System.out.println("Ви піднялись на 3 поверх");
            } else if (direction=="До гори" && floor==3) {
                System.out.println("Ви піднялись на 3 поверх");
            } else if (direction=="До гори" && floor==4) {
                System.out.println("Ви піднялись на 4 поверх");
            } else if (direction=="До гори" && floor==5) {
                System.out.println("Ви піднялись на 5 поверх");
            }else if (direction=="До гори" && floor==6) {
                System.out.println("Ви піднялись на 6 поверх");
            }else if (direction=="До гори" && floor==7) {
                System.out.println("Ви піднялись на 7 поверх");
            }else if (direction=="До гори" && floor==8) {
                System.out.println("Ви піднялись на 8 поверх");
            }else if (direction=="До гори" && floor==9) {
                System.out.println("Ви піднялись на 9 поверх");
            }else if (direction=="До низу" && floor==1) {
                System.out.println("Ви спустились на 1 поверх");
            }else if (direction=="До низу" && floor==2) {
                System.out.println("Ви спустились на 1 поверх");
            }else if (direction=="До низу" && floor==3) {
                System.out.println("Ви спустились на 3 поверх");
            }else if (direction=="До низу" && floor==4) {
                System.out.println("Ви спустились на 4 поверх");
            }else if (direction=="До низу" && floor==5) {
                System.out.println("Ви спустились на 5 поверх");
            }else if (direction=="До низу" && floor==6) {
                System.out.println("Ви спустились на 6 поверх");
            }else if (direction=="До низу" && floor==7) {
                System.out.println("Ви спустились на 7 поверх");
            }else if (direction=="До низу" && floor==8) {
                System.out.println("Ви спустились на 8 поверх");
            }else if (direction=="До низу" && floor==9) {
                System.out.println("Ви спустились на 9 поверх");
            }else {
                System.out.println("Ви вказали неіснуючий поверх!");
            }

            String option = "OK";
            switch(option){
                case "Так":
                case "OK":
                case "Yes":
                case "Y":
                case "+":
                case "Ok":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "Ні":
                case "NO":
                case "N":
                case "-":
                case "No":
                    System.out.println("Я відмовляюсь!");
                    break;
                default:
                    System.out.println("Невірне твердження");

            }
        }
    }


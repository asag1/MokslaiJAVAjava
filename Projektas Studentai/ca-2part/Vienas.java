public class Vienas {

    public static void main(String[] args) {

        int menesis = 7;

        if (menesis > 0) {

            if (menesis < 13) {

                if (menesis % 2 == 0) {

                    switch (menesis) {
                        case 2:
                            System.out.println("VASARIS");
                            break;
                        case 4:
                            System.out.println("BALANDIS");
                            break;
                        case 6:
                            System.out.println("BIRZELIS");
                            break;
                        case 8:
                            System.out.println("RUGPJUTIS");
                            break;
                        case 10:
                            System.out.println("SPALIS");
                            break;
                        case 12:
                            System.out.println("GRUODIS");
                            break;
                    }
                } else {
                    switch (menesis) {
                        case 1:
                            System.out.println("saisis");
                            break;
                        case 3:
                            System.out.println("kovas");
                            break;
                        case 5:
                            System.out.println("geguzis");
                            break;
                        case 7:
                            System.out.println("liepa");
                            break;
                        case 9:
                            System.out.println("rugsejis");
                            break;
                        case 11:
                            System.out.println("lapkritis");
                            break;
                    }
                }
            } else {
                System.out.println("netinkamas skaicius");
                System.out.println("NAUJAS");
            }
        } else {
            System.out.println("netinkamas skaicius");
        }
    }
}

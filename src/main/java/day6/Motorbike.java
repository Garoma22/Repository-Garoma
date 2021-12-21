package day6;


class Motorbike {

    void info(){
        System.out.println("Этот мотоцикл");
    }
    int yearDifference (int inputYear){
        int currentYear = 2022;

        if (inputYear>currentYear){
            System.out.println("Этот год еще не наступил");
            return 0;
        }

        if (inputYear< currentYear){
            System.out.println("На дворе" + currentYear+ " год. Введи его");
            return 0;}

        if (inputYear < release){
            System.out.println("Байк еще не произвели. Байк сделают через " + (release - currentYear) + " год/года/лет");
        return 0;
        }
        else
            inputYear = inputYear - release;
        return inputYear;
    }

        private String model;
        private String color ;
        private int release;

        Motorbike(String model, String color){
            this.model = model;
            this.color = color;
        }
        Motorbike(String model, String color, int release){ // констурктор
            this.model = model;
            this.color = color;
            this.release = release;

        }
        public String getModel(){
            return model;
        }
        public String getColor(){
            return color;
        }
        public int getRelease() {
        return release;
    }
}

package my_program;

public class Enums {

    enum Month {
        January("January", "Січень"),
        February("February", "Лютий"),
        March("March", "Березень"),
        April("April", "Квітень"),
        May("May", "Травень"),
        June("June", "Червень"),
        July("July", "Липень"),
        August("August", "Серпень"),
        September("September", "Вересень"),
        October("October", "Жовтень"),
        November("November", "Листопад"),
        December("December", "Грудень");


        changeLanguage lang = new changeLanguage();
        Month (String eng, String ua) {
            this.lang.eng = eng;
            this.lang.ua = ua;
        }
        public String getEng() {
            return lang.eng;
        }
        public String getUa() {
            return lang.ua;
        }
    }

    enum Season {
        Winter("Winter","Зима"),
        Spring("Spring","Весна"),
        Summer("Summer","Літо"),
        Autumn("Autumn","Осінь");
        changeLanguage lang = new changeLanguage();
        Season(String eng, String ua) {
            this.lang.eng = eng;
            this.lang.ua = ua;
        }
        public String getEng() {
            return lang.eng;
        }
        public String getUa() {
            return lang.ua;
        }
    }
}

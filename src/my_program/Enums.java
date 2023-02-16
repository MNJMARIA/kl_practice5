package my_program;

public class Enums {
    public static
    enum Month {
        January("January", "Січень", "Январь"),
        February("February", "Лютий","Февраль"),
        March("March", "Березень","Март"),
        April("April", "Квітень","Апрель"),
        May("May", "Травень","Май"),
        June("June", "Червень","Июнь"),
        July("July", "Липень","Июль"),
        August("August", "Серпень","Август"),
        September("September", "Вересень","Сентябрь"),
        October("October", "Жовтень","Октябрь"),
        November("November", "Листопад","Ноябрь"),
        December("December", "Грудень","Декабрь");


        changeLanguage lang = new changeLanguage();
        Month (String eng, String ua, String ru) {
            this.lang.eng = eng;
            this.lang.ru = ru;
            this.lang.ua = ua;
        }

        public String getEng() {
            return lang.eng;
        }
        public String getUa() {
            return lang.ua;
        }
        public String getRu() {
            return lang.ru;
        }
    }

    enum Season {
        Winter,
        Spring,
        Summer,
        Autumn
    }
}

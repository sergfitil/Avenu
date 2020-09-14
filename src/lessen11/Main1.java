package lessen11;

public class Main1 {
    public static void main(String[] args) {
        Test naitiIt= new Test("Найди свою IT профессию");
        Test englishLevel =new Test("Определите уровень английского языка");
        naitiIt.setPathToImage("http://easy-it-courses.com/resources/images/tests/icons/Test7.png");
        englishLevel.setPathToImage("http://easy-it-courses.com/resources/images/tests/icons/Test1.png");
        naitiIt.setMainText("Сфера информационных технологий последние десятилетия движется семимильными шагами к лидирующим позициям на международном рынке труда." +
                " Специалисты этой отрасли востребованы во всем мире," +
                " уровень их заработной платы не уступает окладам топ-менеджеров или даже управляющих крупных компаний," +
                " поэтому многие молодые люди мечтают связать свою будущую профессиональную деятельность именно с IT-сферой.\n" +
                "\n" +
                "Компания Easy IT разработала тест, который поможет Вам разобраться в многообразии IT профессий." +
                " Тест проанализирует Ваши личностные качества, знания и навыки, необходимые для работы в каждой из IT специальностей.");
        Option option1_1_1=new Option("чтение книги",false);
        Option option1_1_2=new Option("выступление в 95м квартале",false);
        Option option1_1_3=new Option("игра в шахматы/нарды",false);
        Option option1_1_4=new Option("обсуждение фильма/события с друзьями",true);

        Option option1_2_1=new Option("игра \"Найди 10 отличий в картинках\"",true);
        Option option1_2_2=new Option("пазлы",false);
        Option option1_2_3=new Option("конструктор Лего",false);
        Option option1_2_4=new Option("граффити на стене",false);

        Option option1_3_1=new Option("за 20 минут и более",true);
        Option option1_3_2=new Option("за 5-10 минут",false);
        Option option1_3_3=new Option("лечу, чтобы успеть",false);
        Option option1_3_4=new Option("всегда по разному",false);
    }
}

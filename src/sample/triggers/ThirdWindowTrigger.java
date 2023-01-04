package sample.triggers;

import sample.controllers.Image;

import java.util.ArrayList;
import java.util.List;

public class ThirdWindowTrigger {

    /*
   0 Заголовок
   1 кнопка_1
   2 кнопка_2
   3 кнопка_3
    */
    public static List<Image> questionsList = new ArrayList<>();

    public static List<Image> setQuestionsList(int index){

        if (SecondWindowTrigger.userSelectionInTheFirstdWindow == 1) {

            if (index == 1) {

                questionsList.add(new Image("Выберите физическое качество",""));
                questionsList.add(new Image("Гибкость","/sample/images/физическое развитие/гибкость.png"));
                questionsList.add(new Image("Ловкость","/sample/images/физическое развитие/ловкость.png"));
                questionsList.add(new Image("Координация движения","/sample/images/физическое развитие/координацияДвижения.png"));


            }
            if (index == 2) {

                questionsList.add(new Image("Выберите орган чувств",""));
                questionsList.add(new Image("Слух","/sample/images/физическое развитие/слух.png"));
                questionsList.add(new Image("Осязание","/sample/images/физическое развитие/осязание.png"));
                questionsList.add(new Image("Зрение","/sample/images/физическое развитие/зрение.png"));
            }
            if (index == 3) {

                questionsList.add(new Image("Выберите группу мышц",""));
                questionsList.add(new Image("Мышцы рук и пальцев","/sample/images/физическое развитие/мышцыРукИПальцев.png"));
                questionsList.add(new Image("Мышцы ног","/sample/images/физическое развитие/мышцыНог.png"));
                questionsList.add(new Image("Мышцы туловища","/sample/images/физическое развитие/мышцыТуловища.png"));
            }
        }

        if (SecondWindowTrigger.userSelectionInTheFirstdWindow == 2) {


            if (index == 1) {

                questionsList.add(new Image("Выберите направление интересов вашего ребёнка",""));
                questionsList.add(new Image("Наука","/sample/images/интелектуальное развитие/наука.png"));
                questionsList.add(new Image("Техника","/sample/images/интелектуальное развитие/техника.png"));
                questionsList.add(new Image("",""));

            }
            if (index == 2) {

                questionsList.add(new Image("Выберите вид игры",""));
                questionsList.add(new Image("Настольная","/sample/images/интелектуальное развитие/настольная.png"));
                questionsList.add(new Image("Компьютерная","/sample/images/интелектуальное развитие/компьютерная.png"));
                questionsList.add(new Image("Карточная","/sample/images/интелектуальное развитие/карточная.png"));
            }
            if (index == 3) {

                questionsList.add(new Image("Выберите объект или образ",""));
                questionsList.add(new Image("Человек","/sample/images/интелектуальное развитие/человек.png"));
                questionsList.add(new Image("Животное","/sample/images/интелектуальное развитие/животное.png"));
                questionsList.add(new Image("Здание","/sample/images/интелектуальное развитие/здание.png"));
            }
        }

        if (SecondWindowTrigger.userSelectionInTheFirstdWindow == 3) {

            if (index == 1) {

                questionsList.add(new Image("Выберите тип игрушки",""));
                questionsList.add(new Image("Игрушка-шутка","/sample/images/творческое развитие/игрушкаШутка.png"));
                questionsList.add(new Image("Игрушка на радио-управлении","/sample/images/творческое развитие/игрушкаНаРадиоуправлении.png"));
                questionsList.add(new Image("Интерактивная игрушка","/sample/images/творческое развитие/интерактивная игрушка.png"));


            }
            if (index == 2) {

                questionsList.add(new Image("Выберите тип искусства",""));
                questionsList.add(new Image("Музыка","/sample/images/творческое развитие/музыка.png"));
                questionsList.add(new Image("Театр","/sample/images/творческое развитие/театр.png"));
                questionsList.add(new Image("Творчество","/sample/images/творческое развитие/творчество.png"));
            }
            if (index == 3) {

                questionsList.add(new Image("Выберите сферу производства",""));
                questionsList.add(new Image("Транспорт","/sample/images/творческое развитие/транспорт.png"));
                questionsList.add(new Image("Садоводство","/sample/images/творческое развитие/садоводство.png"));
                questionsList.add(new Image("Строительство","/sample/images/творческое развитие/строительство.png"));
            }
        }

        return questionsList;

    }

    public static void removeQuestionsList(){
        questionsList.clear();
    }
}

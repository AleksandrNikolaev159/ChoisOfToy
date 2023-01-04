package sample.triggers;

import sample.controllers.Image;

import java.util.ArrayList;
import java.util.List;

public class SecondWindowTrigger {

    /*
    Список вопросов для второго окна
    Элементы списка с индексом:
    0 соответствует Вопросу - "заголовок окна"
    1 соответствует Варианту ответа - "кнопка1"
    2 соответствует Варианту ответа - "кнопка2"
    3 соответствует Варианту ответа - "кнопка3"
     */
    public static List<Image> questionsListForSecondWindow = new ArrayList<>();

    /*
    признак отражающий выбор пользователя во втором окне интерфейса
    0 - по дефолту
    1 - пользователь выбрал "Физическое развитие"
    2 - пользователь выбрал "Интеллектуальное развитие"
    3 - пользователь выбрал "Творческое развитие"
     */
    static int userSelectionInTheFirstdWindow = 0;

    /*
    Метод формирующий список с вопросами для "окна № 2"
     */
    public static List<Image> setQuestionsListForSecondWindow(int index){

        /*
        При нажатии на конпку "Физическое развитие"
         */
        if(index == 1){
            questionsListForSecondWindow.add(new Image("Выберите область физического развития ребёнка",""));
            questionsListForSecondWindow.add(new Image("Развитие физических качеств","/sample/images/физическое развитие/развитиеФизическихКачеств.png"));
            questionsListForSecondWindow.add(new Image("Развитие органов чувств","/sample/images/физическое развитие/развитиеОргановЧувств.png"));
            questionsListForSecondWindow.add(new Image("Развитие мышц","/sample/images/физическое развитие/развитиеМышц.png"));
            userSelectionInTheFirstdWindow = 1;
        }
        
        /*
        При нажатии на конпку "Интеллектуальное развитие"
         */
        if(index == 2){
            questionsListForSecondWindow.add(new Image("Выберите область интеллектуального развития ребёнка",""));
            questionsListForSecondWindow.add(new Image("Знакомство с наукой и техникой","/sample/images/интелектуальное развитие/знакомствоСНаукойИТехникой.png"));
            questionsListForSecondWindow.add(new Image("Развитие кругозора и тяги к знаниям","/sample/images/интелектуальное развитие/развитиеКругозораИТягиКЗнаниям.png"));
            questionsListForSecondWindow.add(new Image("Развитие образного мышления","/sample/images/интелектуальное развитие/развитиеОбразногоМышления.png"));
            userSelectionInTheFirstdWindow = 2;
        }
        
        /*
        При нажатии на конпку "Творческое развитие"
         */
        if(index == 3){
            questionsListForSecondWindow.add(new Image("Выберите область творческого развития ребёнка",""));
            questionsListForSecondWindow.add(new Image("Развитие чувства юмора","/sample/images/творческое развитие/развитиеЧувстваЮмора.png"));
            questionsListForSecondWindow.add(new Image("Развитие творческих навыков","/sample/images/творческое развитие/развитиеТворческихНавыков.png"));
            questionsListForSecondWindow.add(new Image("Развитие трудовых навыков","/sample/images/творческое развитие/развитиеТрудовыхНавыков.png"));
            userSelectionInTheFirstdWindow = 3;
        }

        return questionsListForSecondWindow;

    }

    /*
        Метод для очистка список с вопросами для "окна № 2"
        и установке для признака выбора пользователя дефолтного значения
     */
    public static void clearQuestionsListForSecondWindow(){
        questionsListForSecondWindow.clear();
        userSelectionInTheFirstdWindow = 0;

    }

}

package sample.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import sample.dto.FormDto;
import sample.enums.DtoFields;

/*
Главное окно с выбором "Педагогического направления развития ребёнка"
 */
public class MainViewController {


    static FormDto formDto = new FormDto();

    static String sign = "Main";

    private static List<FormDto> formDtoList = new ArrayList<>();

    static {

        /*
        Главная форма
         */
        formDtoList.add(new FormDto(
                "Выберите педагогическое направление развития ребёнка",
                "Физическое развитие",
                "Творческое развитие",
                "Интеллектуальное развитие",
                "/sample/images/физическое развитие/физическоеРазвитие.png",
                "/sample/images/творческое развитие/творческоеРазвитие.png",
                "/sample/images/интелектуальное развитие/интелектуальноеРазвитие.png",
                "",
                "Main")
        );

        /*
        Ветка дерава решений "Физическое развитие"
         */
        formDtoList.add(new FormDto(
                "Выберите область физического развития ребёнка",
                "Развитие физических качеств",
                "Развитие органов чувств",
                "Развитие мышц",
                "/sample/images/физическое развитие/развитиеФизическихКачеств.png",
                "/sample/images/физическое развитие/развитиеОргановЧувств.png",
                "/sample/images/физическое развитие/развитиеМышц.png",
                "",
                "Физическое развитие")
        );
        formDtoList.add(new FormDto(
                "Выберите физическое качество",
                "Гибкость",
                "Ловкость",
                "Координация движения",
                "/sample/images/физическое развитие/гибкость.png",
                "/sample/images/физическое развитие/ловкость.png",
                "/sample/images/физическое развитие/координацияДвижения.png",
                "",
                "Развитие физических качеств")
        );

        //Ответвление "Выберите физическое качество"

        formDtoList.add(new FormDto(
                "Гимнастические кольца",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/гимнастические кольца.png",
                "Гибкость")
        );

        formDtoList.add(new FormDto(
                "Шары для жонглирования",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/шары для жонглирования.png",
                "Ловкость")
        );

        formDtoList.add(new FormDto(
                "Обруч",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/обруч.png",
                "Координация движения")
        );

        formDtoList.add(new FormDto(
                "Выберите орган чувств",
                "Слух",
                "Осязание",
                "Зрение",
                "/sample/images/физическое развитие/слух.png",
                "/sample/images/физическое развитие/осязание.png",
                "/sample/images/физическое развитие/зрение.png",
                "",
                "Развитие органов чувств")
        );

        //Ответвление "Выберите орган чувств"

        formDtoList.add(new FormDto(
                "Погремушка",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/погремушка.png",
                "Слух")
        );

        formDtoList.add(new FormDto(
                "Шипованный мячик",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/Шипованный мячик.png",
                "Осязание")
        );

        formDtoList.add(new FormDto(
                "Игрушка - подвеска",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/Игрушка-подвеска.png",
                "Зрение")
        );

        formDtoList.add(new FormDto(
                "Выберите группу мышц",
                "Мышцы рук и пальцев",
                "Мышцы ног",
                "Мышцы туловища",
                "/sample/images/физическое развитие/мышцыРукИПальцев.png",
                "/sample/images/физическое развитие/мышцыНог.png",
                "/sample/images/физическое развитие/мышцыТуловища.png",
                "",
                "Развитие мышц")
        );

        //Ответвление "Выберите орган чувств"

        formDtoList.add(new FormDto(
                "Пирамидка",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/Пирамидка.png",
                "Мышцы рук и пальцев")
        );

        formDtoList.add(new FormDto(
                "Самокат",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/Самокат.png",
                "Мышцы ног")
        );

        formDtoList.add(new FormDto(
                "Большой мяч",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/физическое развитие/Большой мяч.png",
                "Мышцы туловища")
        );

        /*
        Ветка дерава решений "Творческое развитие"
         */
        formDtoList.add(new FormDto(
                "Выберите область творческого развития ребёнка",
                "Развитие чувства юмора",
                "Развитие творческих навыков",
                "Развитие трудовых навыков",
                "/sample/images/творческое развитие/развитиеЧувстваЮмора.png",
                "/sample/images/творческое развитие/развитиеТворческихНавыков.png",
                "/sample/images/творческое развитие/развитиеТрудовыхНавыков.png",
                "",
                "Творческое развитие")
        );

        //Ответвление "Выберите тип игрушки"
        formDtoList.add(new FormDto(
                "Выберите тип игрушки",
                "Игрушка - шутка",
                "Игрушка на радиоуправлении",
                "Интерактивная игрушка",
                "/sample/images/творческое развитие/игрушкаШутка.png",
                "/sample/images/творческое развитие/игрушкаНаРадиоуправлении.png",
                "/sample/images/творческое развитие/интерактивная игрушка.png",
                "",
                "Развитие чувства юмора")
        );

        formDtoList.add(new FormDto(
                "Вакуумный паук",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Вакуумный паук.png",
                "Игрушка - шутка")
        );

        formDtoList.add(new FormDto(
                "Робот на рудио - управлении",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Робот на радиоуправлении.png",
                "Игрушка на радиоуправлении")
        );

        formDtoList.add(new FormDto(
                "Танцующая обезьяна",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Танцующая обезьяна.png",
                "Интерактивная игрушка")
        );

        //Ответвление "Выберите тип искусства"
        formDtoList.add(new FormDto(
                "Выберите тип искусства",
                "Музыка",
                "Театр",
                "Творчество",
                "/sample/images/творческое развитие/музыка.png",
                "/sample/images/творческое развитие/театр.png",
                "/sample/images/творческое развитие/творчество.png",
                "",
                "Развитие творческих навыков")
        );

        formDtoList.add(new FormDto(
                "Детский синтезатор",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Детский синтезатор.png",
                "Музыка")
        );

        formDtoList.add(new FormDto(
                "Кукольный дом",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Кукольный дом.png",
                "Театр")
        );

        formDtoList.add(new FormDto(
                "Набор для лепки из глины",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Набор лепки из глины.png",
                "Творчество")
        );


        //Ответвление "Выберите сферу производства"
        formDtoList.add(new FormDto(
                "Выберите сферу производства",
                "Транспорт",
                "Садоводство",
                "Строительство",
                "/sample/images/творческое развитие/транспорт.png",
                "/sample/images/творческое развитие/садоводство.png",
                "/sample/images/творческое развитие/строительство.png",
                "",
                "Развитие трудовых навыков")
        );

        formDtoList.add(new FormDto(
                "Модель автобуса",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Модель автобуса.png",
                "Транспорт")
        );

        formDtoList.add(new FormDto(
                "Детская лейка",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Детская лейка.png",
                "Садоводство")
        );

        formDtoList.add(new FormDto(
                "Детский набор инструментов",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/творческое развитие/Детский набор инструментов.png",
                "Строительство")
        );

        /*
        Ветка дерава решений "Интеллектуальное развитие"
         */
        formDtoList.add(new FormDto(
                "Выберите область интеллектуального развития ребёнка",
                "Знакомство с наукой и техникой",
                "Расширение кругозора и развитие тяги к знаниям ребёнка",
                "Развитие образного мышления и знакомство с окружающим миром",
                "/sample/images/интелектуальное развитие/знакомствоСНаукойИТехникой.png",
                "/sample/images/интелектуальное развитие/развитиеКругозораИТягиКЗнаниям.png",
                "/sample/images/интелектуальное развитие/развитиеОбразногоМышления.png",
                "",
                "Интеллектуальное развитие")
        );

        /*
        Ответвление "Выберите направление интересов вашего ребёнка" от ветки  дерава решений "Интеллектуальное развитие"
         */
        formDtoList.add(new FormDto(
                "Выберите направление интересов вашего ребёнка",
                "Наука",
                "Техника",
                "",
                "/sample/images/интелектуальное развитие/наука.png",
                "/sample/images/интелектуальное развитие/техника.png",
                "",
                "",
                "Знакомство с наукой и техникой")
        );

        //Ответвление "Выберите научную сферу"
        formDtoList.add(new FormDto(
                "Выберите научную сферу",
                "Химия",
                "Физика",
                "Биология",
                "/sample/images/интелектуальное развитие/физика.png",
                "/sample/images/интелектуальное развитие/химия.png",
                "/sample/images/интелектуальное развитие/биология.png",
                "",
                "Наука")
        );

        formDtoList.add(new FormDto(
                "Набор 'Удивительная химия'",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Набор Удивительная химия.png",
                "Химия")
        );

        formDtoList.add(new FormDto(
                "Набор 'Юный физик'",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Набор Юный физик.png",
                "Физика")
        );

        formDtoList.add(new FormDto(
                "Учебный биологический микроскоп",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Учебный биологический микроскоп.png",
                "Биология")
        );


        //Ответвление "Выберите вид техники"
        formDtoList.add(new FormDto(
                "Выберите вид техники",
                "Робототехника",
                "Электротехника",
                "Вычислительная техника",
                "/sample/images/интелектуальное развитие/робототехника.png",
                "/sample/images/интелектуальное развитие/электротехника.png",
                "/sample/images/интелектуальное развитие/вычислительнаяТехника.png",
                "",
                "Техника")
        );

        formDtoList.add(new FormDto(
                "Программируемый робот-конструктор",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Программируемый робот-конструктор.png",
                "Робототехника")
        );

        formDtoList.add(new FormDto(
                "Конструктор-радиоприёмник",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Конструктор-радиоприёмник.png",
                "Электротехника")
        );

        formDtoList.add(new FormDto(
                "Конструктор-компьютер",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Конструктор-компьютер.png",
                "Вычислительная техника")
        );


        /*
        Ответвление "Выберите вид игры" от ветки  дерава решений "Интеллектуальное развитие"
         */
        formDtoList.add(new FormDto(
                "Выберите вид игры",
                "Настольная",
                "Компьютерная",
                "Карточная",
                "/sample/images/интелектуальное развитие/настольная.png",
                "/sample/images/интелектуальное развитие/компьютерная.png",
                "/sample/images/интелектуальное развитие/карточная.png",
                "",
                "Расширение кругозора и развитие тяги к знаниям ребёнка")
        );

        formDtoList.add(new FormDto(
                "Монополия",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Монополия.png",
                "Настольная")
        );

        formDtoList.add(new FormDto(
                "Обучение программированию в виде игры 'CODE COMBAT'",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Обучение программированию в виде игры Code combat.png",
                "Компьютерная")
        );

        formDtoList.add(new FormDto(
                "Карточная игра 'Кругосветка'",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Кругосветка.png",
                "Карточная")
        );


         /*
        Ответвление "Выберите вид объекта или образ представленный в виде игрушки" от ветки  дерава решений "Интеллектуальное развитие"
         */
        formDtoList.add(new FormDto(
                "Выберите вид объекта или образ представленный в виде игрушки",
                "Человек",
                "Животное",
                "Здание",
                "/sample/images/интелектуальное развитие/человек.png",
                "/sample/images/интелектуальное развитие/животное.png",
                "/sample/images/интелектуальное развитие/здание.png",
                "",
                "Расширение кругозора и развитие тяги к знаниям ребёнка")
        );

        formDtoList.add(new FormDto(
                "Кукла",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Кукла.png",
                "Человек")
        );

        formDtoList.add(new FormDto(
                "Плюшевый заяц",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Плюшевый заяц.png",
                "Животное")
        );

        formDtoList.add(new FormDto(
                "Макет пожарной части",
                "",
                "",
                "",
                "",
                "",
                "",
                "/sample/images/интелектуальное развитие/Макет пожарной части.png",
                "Здание")
        );

    }

    /*
    Возвращает то DTO признак которых был указан
     */
     static FormDto getDtoBySign(String sign){

        FormDto resultDto = new FormDto();

        for(FormDto dto : formDtoList){
            if (dto.getSign().equals(sign)) {
                resultDto = dto;
                break;
            }

        }

        return resultDto;
    }

    /*
    Присваивает признаку значение кнопки
     */
    static String getCurrentSign (Button currentButton){

        String resultSign = currentButton.getText();

        return resultSign;
    }

    /*
    Возвращает обновлённый признак
     */
    static String updatedSign (String newSign){
        String updatedSign = newSign;

        return updatedSign;
    }

    /*
    Проверяет является ли то или иное поле объекта FormDto пустым или нет
     */
    static boolean formDtoObjectFieldValidation (FormDto formDto, DtoFields dtoFields){

        boolean result = false;

        if (dtoFields.equals(DtoFields.FirstButton)){
            result = formDto.getFirstButton().equals("");
        }

        if (dtoFields.equals(DtoFields.SecondButton)){
            result = formDto.getSecondButton().equals("");
        }

        if (dtoFields.equals(DtoFields.ThirdButton)){
            result = formDto.getThirdButton().equals("");
        }

        if (dtoFields.equals(DtoFields.FirstImage)){
            result = formDto.getFirstImage().equals("");
        }

        if (dtoFields.equals(DtoFields.SecondImage)){
            result = formDto.getSecondImage().equals("");
        }

        if (dtoFields.equals(DtoFields.ResultImage)){
            result = formDto.getResultImage().equals("");
        }

        if (dtoFields.equals(DtoFields.ThirdImage)){
            result = formDto.getThirdImage().equals("");
        }

        return result;
    }

    /*
    Загружает FXML файл
     */
    static void loadFileByFxmlLoader(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainViewController.class.getResource("/sample/view/mainView.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
//        stage.setMinWidth(1200);
//        stage.setMinHeight(900);
//        stage.setWidth(1200);
//        stage.setHeight(900);
        stage.showAndWait();
    }

    /*
    Делает выбранную кнопку невидимой на экране
     */
    static void makeButtonInvisible(Button button){
        button.setMaxSize(0,0);
        button.setMinSize(0,0);
    }

    /*
    Делает выбранную картинку невидимой на экране
     */
    static void makeImageInvisible(ImageView imageView){
        imageView.setFitHeight(0);
        imageView.setFitWidth(0);
    }

    @FXML
    private Button firstButton;

    @FXML
    private ImageView firstImage;

    @FXML
    private Label header;

    @FXML
    private Button secondButton;

    @FXML
    private ImageView secondImage;

    @FXML
    private Button thirdButton;

    @FXML
    private ImageView thirdImage;

    @FXML
    private ImageView resultImage;

    @FXML
    void initialize()  {
        System.out.println("Текущий признак = " + sign);
        formDto = getDtoBySign(sign);
        header.setText(formDto.getHeader());

        if (formDtoObjectFieldValidation(formDto,DtoFields.FirstButton)){
            makeButtonInvisible(firstButton);
        } else {
            firstButton.setText(formDto.getFirstButton());
        }

        if (formDtoObjectFieldValidation(formDto,DtoFields.SecondButton)){
            makeButtonInvisible(secondButton);
        } else {
            secondButton.setText(formDto.getSecondButton());
        }

        if (formDtoObjectFieldValidation(formDto,DtoFields.ThirdButton)){
            makeButtonInvisible(thirdButton);
        } else {
            thirdButton.setText(formDto.getThirdButton());
        }

        if (formDtoObjectFieldValidation(formDto,DtoFields.FirstImage)){
            makeImageInvisible(firstImage);
        } else {
            firstImage.setImage(new Image(formDto.getFirstImage()));
        }

        if (formDtoObjectFieldValidation(formDto,DtoFields.SecondImage)){
            makeImageInvisible(secondImage);
        } else {
            secondImage.setImage(new Image(formDto.getSecondImage()));
        }

        if (formDtoObjectFieldValidation(formDto,DtoFields.ThirdImage)){
            makeImageInvisible(thirdImage);
        } else {
            thirdImage.setImage(new Image(formDto.getThirdImage()));
        }

        if (formDtoObjectFieldValidation(formDto,DtoFields.ResultImage)){
            makeImageInvisible(resultImage);
        } else {
            resultImage.setImage(new Image(formDto.getResultImage()));
        }


        firstButton.setOnAction(event ->{
            firstButton.getScene().getWindow();  //вызов сцены элемента.вызов окна элемента. скрыть
            sign = updatedSign(getCurrentSign(firstButton));
            loadFileByFxmlLoader();
      });

        secondButton.setOnAction(event ->{
            secondButton.getScene().getWindow();  //вызов сцены элемента.вызов окна элемента. скрыть
            sign = updatedSign(getCurrentSign(secondButton));
            loadFileByFxmlLoader();
        });

        thirdButton.setOnAction(event ->{
            thirdButton.getScene().getWindow();  //вызов сцены элемента.вызов окна элемента. скрыть
            sign = updatedSign(getCurrentSign(thirdButton));
            loadFileByFxmlLoader();
        });

    }

}


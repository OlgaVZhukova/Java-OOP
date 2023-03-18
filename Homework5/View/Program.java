package Homework5.View;

import Homework5.Models.CommonModel;
import Homework5.Presenter.Presenter;

public class Program {
    public static void main(String[] args) {

        Presenter presenter = new Presenter(new UI(), new CommonModel());

        presenter.runOperation();

    }
}
